package groupVotersGen.util.generator;

import org.eclipse.emf.common.util.URI;
import org.simsg.simulationdefinition.utils.SimulationDefinitionGenerator;

import util.generator.GroupVotersGenerator;

public class SimpleSimulationGenerator {
	
	public static void main(String[] args) {
		GroupVotersGenerator groupVotersGen = new GroupVotersGenerator();
		groupVotersGen.setNumOfVoters(100);
		groupVotersGen.setNumOfGroups(10);
		groupVotersGen.setFalseRate(3);
		groupVotersGen.generate(System.getProperty("user.dir")+"/instances/simulation_instances/100voters_10groups_unconnected.xmi");
		
		SimulationDefinitionGenerator gen = new SimulationDefinitionGenerator("100voters_10groups_unconnected");
		gen.setIBeXModel(URI.createFileURI(System.getProperty("user.dir")+"/src-gen/groupVotersGen/rules/api/ibex-patterns.xmi"));
		gen.setModelURI(System.getProperty("user.dir")+"/instances/simulation_instances/"+"100voters_10groups_unconnected"+".xmi"); 
		gen.addPatternObservation("voteTrue");
		gen.addPatternObservation("voteFalse");
		gen.addPatternObservation("agreeTrue");
		gen.addPatternObservation("agreeFalse");
		gen.addPatternObservation("homGroupFalse");
		gen.addPatternObservation("homGroupTrue");
		gen.addPatternObservation("hetGroup");
		gen.addTerminationConditionIterations(300);
		gen.saveDefinition(System.getProperty("user.dir")+"/instances/simulation_definitions/"+"100voters_10groups_unconnected"+".xmi");
	}
}
