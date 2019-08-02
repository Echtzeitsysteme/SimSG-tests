package GoldbeterKoshland.util;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GoldbeterKoshland.Agent;
import GoldbeterKoshland.GoldbeterKoshlandFactory;
import GoldbeterKoshland.Mixture;
import GoldbeterKoshland.P_s;
import GoldbeterKoshland.T;
import GoldbeterKoshland.U_s;

public class ModelGenerator {
	
	public static Resource createAndSaveModel(String outputPath, int numberOfInstances) {
		
		URI uri = URI.createFileURI(outputPath);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi_resource", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = rs.createResource(uri);
		Mixture mix = createMixture(numberOfInstances);
		resource.getContents().add(mix);
		
		try {
			GeneratorUtils.saveModelContainer(resource, outputPath);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Model could not be stored at the given location.");
		}
		
		return resource;
	}
	
	public static Resource loadModel(String path) {
		try {
			return GeneratorUtils.loadResource(path);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Model could not be loaded from the given location.");
			return null;
		}
	}
	
	private static Mixture createMixture(int numberOfInstances) {
		GoldbeterKoshlandFactory factory = GoldbeterKoshlandFactory.eINSTANCE;
		Mixture mix = factory.createMixture();
		U_s us = factory.createU_s();
		P_s ps = factory.createP_s();
		mix.getStates().add(us);
		mix.getStates().add(ps);
		
		List<Agent> agents = new LinkedList<>();
		for(int i = numberOfInstances; i>0; i--) {
			agents.add(factory.createK());
			agents.add(factory.createP());
			T t = factory.createT();
			t.setX_u(us);
			t.setY_u(us);
			agents.add(t);
		}
		mix.getAgents().addAll(agents);
		return mix;
	}

}
