package voterSim2.util.generator;

import org.eclipse.emf.common.util.URI;
import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

import util.generator.VoterGenerator;

public class SimpleSimulationGenerator {
	
	public static void main(String[] args) {	
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator("103voters_connected");
		gen.setIBeXModel(URI.createFileURI(System.getProperty("user.dir")+"/src-gen/voterSim2/rules/api/ibex-patterns.xmi"));
		gen.setModelURI(System.getProperty("user.dir")+"/instances/simulation_instances/"+"3voters_unconnected"+".xmi"); 
		gen.addPatternObservation("voteTrue");
		gen.addPatternObservation("voteFalse");
		gen.addPatternObservation("disagree");
		gen.addPatternObservation("agreeTrue");
		gen.addPatternObservation("agreeFalse");
		gen.addTerminationConditionIterations(100);
		gen.saveDefinition(System.getProperty("user.dir")+"/instances/simulation_definitions/"+"103voters_connected"+".xmi");
	}
}
