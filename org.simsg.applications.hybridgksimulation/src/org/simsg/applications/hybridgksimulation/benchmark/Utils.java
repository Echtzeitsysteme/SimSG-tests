package org.simsg.applications.hybridgksimulation.benchmark;

import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

public class Utils {
	public static void generateGKSimulation(String modelName) { 
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator(modelName); 
		gen.setGtRules("src-gen/org/simsg/applications/hybridgksimulation/api/gt-rules.xmi"); 
		gen.setIBeXPatterns("src-gen/org/simsg/applications/hybridgksimulation/api/ibex-patterns.xmi");
		//gen.setMetaModel("C:\\Users\\sehmes\\git\\SimSG_Applications\\GoldbeterKoshland\\model\\GoldbeterKoshland.ecore");
		gen.setModelURI("instances/"+modelName+".xmi"); 
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
		gen.saveDefinition("models/SimulationDefinitions/"+modelName+".xmi"); 
	}
}
