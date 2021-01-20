package groupVotersSim.util.generator;

import org.eclipse.emf.common.util.URI;
import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

//import util.generator.VoterGenerator;

public class SimpleSimulationGenerator {
	
	public static void main(String[] args) {	
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator("100voters_10groups_unconnected");
		gen.setIBeXModel(URI.createFileURI(System.getProperty("user.dir")+"/src-gen/groupVotersSim/rules/api/ibex-patterns.xmi"));
		gen.setModelURI(System.getProperty("user.dir")+"/instances/simulation_instances/"+"100voters_10groups_unconnected"+".xmi"); 
		gen.addPatternObservation("voteTrue");
		gen.addPatternObservation("voteFalse");
		gen.addPatternObservation("agreeTrue");
		gen.addPatternObservation("agreeFalse");
		gen.addPatternObservation("homGroupFalse");
		gen.addPatternObservation("homGroupTrue");
		gen.addPatternObservation("hetGroup");
		gen.addTerminationConditionIterations(100);
		gen.saveDefinition(System.getProperty("user.dir")+"/instances/simulation_definitions/"+"100voters_10groups_unconnected"+".xmi");
	}
}
