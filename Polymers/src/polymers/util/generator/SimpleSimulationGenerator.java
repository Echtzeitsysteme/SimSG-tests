package polymers.util.generator;

import org.eclipse.emf.common.util.URI;
import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

import util.generator.PolymerModelGenerator;

public class SimpleSimulationGenerator {
	
	public static void main(String[] args) {
		PolymerModelGenerator polymersGen = new PolymerModelGenerator();
		polymersGen.setNumOfAtoms(10);
		polymersGen.generate(System.getProperty("user.dir")+"/instances/simulation_instances/10atoms_unconnected.xmi");
		
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator("10atoms_unconnected");
		gen.setIBeXModel(URI.createFileURI(System.getProperty("user.dir")+"/src-gen/polymers/rules/api/ibex-patterns.xmi"));
		gen.setModelURI(System.getProperty("user.dir")+"/instances/simulation_instances/"+"10atoms_unconnected"+".xmi"); 
		gen.addPatternObservation("triangle");
		gen.addPatternObservation("cC2");
		gen.addPatternObservation("bC2");
		gen.addPatternObservation("createEdge");
		gen.addPatternObservation("deleteEdge");
//		gen.addPatternObservation("deleteVertex");
		gen.addTerminationConditionIterations(100);
		gen.saveDefinition(System.getProperty("user.dir")+"/instances/simulation_definitions/"+"10atoms_unconnected"+".xmi");
	}

}
