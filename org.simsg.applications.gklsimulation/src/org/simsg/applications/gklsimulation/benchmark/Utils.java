package org.simsg.applications.gklsimulation.benchmark;

import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

public class Utils {
	public static void generateGKSimulation(String modelName) { 
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator(modelName); 
		gen.setIBeXModel("src-gen/org/simsg/applications/gklsimulation/gkl/api/ibex-patterns.xmi");
		gen.setModelURI("instances/simulation_instances/"+modelName+".xmi"); 
		gen.addPatternObservation("tPP"); 
		gen.addPatternObservation("tPPfree"); 
		//gen.addTerminationConditionTime(20000); 
		System.out.println(gen); 
		gen.saveDefinition("instances/simulation_definitions/"+modelName+".xmi"); 
	}
}
