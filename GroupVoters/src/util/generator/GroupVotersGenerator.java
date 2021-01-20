package util.generator;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


import GroupVoters.Group;
import GroupVoters.Voter1;
import GroupVoters.GroupVotersContainer;
import GroupVoters.GroupVotersFactory;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class GroupVotersGenerator {
	
	private GroupVotersFactory factory = GroupVotersFactory.eINSTANCE;
	private String outputPath;
	private GroupVotersContainer model;
	

	private int numOfGroups;
	private List<Group> groups;
	
	public void setNumOfGroups(final int num) {
		this.numOfGroups = num;
	}
	
	private void genGroups() {
		groups = new LinkedList<>();
		for(int i = 0; i<numOfGroups; i++) {
			Group group = factory.createGroup();
//			if (i % 3 == 0) 
//				{group.setVote(false);} else 
//				{group.setVote(true);}
			groups.add(group);
		}
	}
	
	
	private int numOfVoters;
	private int falseRate;
	private List<Voter1> voters;
	
	public void setNumOfVoters(final int num) {
		this.numOfVoters = num;
	}

	public void setFalseRate(final int num) {		
		this.falseRate = num;
	}
	
	private void genVoters() {
		voters = new LinkedList<>();
		for(int i = 0; i<numOfVoters; i++) {
			Voter1 voter = factory.createVoter1();
			if (i % falseRate == 0) 
				{voter.setVote(false);} else 
				{voter.setVote(true);}
			voters.add(voter);
		}
	}
	
	public GroupVotersContainer generate(String path) {
		model = factory.createGroupVotersContainer();
		outputPath = path;
		
		genGroups();
		model.getGroup().addAll(groups);
	
		genVoters();
		model.getVoter().addAll(voters);
		
		saveToFile();
		
		return model;
	}
	
	
	private void saveToFile() {
		URI uri = URI.createFileURI(outputPath);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource modelResource = rs.createResource(uri);
		
		modelResource.getContents().add(model);
		
		Map<Object, Object> saveOptions = ((XMIResource)modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		try {
			((XMIResource)modelResource).save(saveOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
		modelResource.unload();
		
		System.out.println("Model saved to: "+uri.path());
	}

}
