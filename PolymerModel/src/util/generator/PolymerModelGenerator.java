package util.generator;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import PolymerModel.Atom;
import PolymerModel.Container;
import PolymerModel.PolymerModelFactory;


public class PolymerModelGenerator {
	
	private PolymerModelFactory factory = PolymerModelFactory.eINSTANCE;
	private String outputPath;
	private Container model;
	

	private int numOfAtoms;
	
	private List<Atom> atoms;
	
	public Container generate(String path) {
		model = factory.createContainer();
		outputPath = path;
		
		genAtoms();
		model.getAtoms().addAll(atoms);
		
		saveToFile();
		
		return model;
	}
	
	private void genAtoms() {
		atoms = new LinkedList<>();
		for(int i = 0; i<numOfAtoms; i++) {
			Atom atom = factory.createAtom();
			atoms.add(atom);
		}
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
