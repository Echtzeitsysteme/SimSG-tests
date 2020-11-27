package voterSim.util.generator;

import org.eclipse.emf.common.util.URI;
import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

import util.generator.VoterGenerator;

public class SimpleSimulationGenerator {
	
	public static void main(String[] args) {
		VoterGenerator votersGen = new VoterGenerator();
		votersGen.setNumOfVoters(3);
		votersGen.generate(System.getProperty("user.dir")+"/instances/simulation_instances/3voters_unconnected.xmi");
		
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator("3voters_unconnected");
		gen.setIBeXModel(URI.createFileURI(System.getProperty("user.dir")+"/src-gen/voterSim/rules/api/ibex-patterns.xmi"));
		gen.setModelURI(System.getProperty("user.dir")+"/instances/simulation_instances/"+"3voters_unconnected"+".xmi"); 
		gen.addPatternObservation("disagree");
		gen.addPatternObservation("agreeTrue");
		gen.addPatternObservation("agreeFalse");
		gen.addPatternObservation("voteTrue");
		gen.addPatternObservation("voteFalse");
//		gen.addPatternObservation("newVoterTrue");
//		gen.addPatternObservation("newVoterFalse");
		gen.addTerminationConditionIterations(100);
		gen.saveDefinition(System.getProperty("user.dir")+"/instances/simulation_definitions/"+"3voters_unconnected"+".xmi");
	}
}
