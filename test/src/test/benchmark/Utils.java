package test.benchmark;

import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

import GoldbeterKoshland.GoldbeterKoshlandPackage;

public class Utils {
	public static void generateGKSimulation(String modelName) { 
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator(modelName); 
		gen.setGtRules("src-gen/test/api/gt-rules.xmi"); 
		gen.setIBeXPatterns("src-gen/test/api/ibex-patterns.xmi");
		gen.setModelURI("instances/simulation_instances/"+modelName+".xmi"); 
		gen.addRuleRateAnnotation("ktXfwd", 1.0); 
		gen.addRuleRateAnnotation("ktXbwd", 10.0);
		gen.addRuleRateAnnotation("ktYfwd", 1.0); 
		gen.addRuleRateAnnotation("ktYbwd", 10.0);
		gen.addRuleRateAnnotation("ptXfwd", 1.0); 
		gen.addRuleRateAnnotation("ptXbwd", 10.0);
		gen.addRuleRateAnnotation("ptYfwd", 1.0); 
		gen.addRuleRateAnnotation("ptYbwd", 10.0);
		gen.addRuleRateAnnotation("ktXactivate", 1.0);
		gen.addRuleRateAnnotation("ktYactivate", 1.0);
		gen.addRuleRateAnnotation("ptXdeactivate", 1.0);
		gen.addRuleRateAnnotation("ptYdeactivate", 1.0);
		gen.addPatternObservation("tPP"); 
		gen.addPatternObservation("tPPfree"); 
		//gen.addTerminationConditionTime(20000); 
		System.out.println(gen); 
		gen.saveDefinition("instances/simulation_definitions/"+modelName+".xmi"); 
	}
}
