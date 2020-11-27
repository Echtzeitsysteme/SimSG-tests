package voterSim2.rules;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.simulation.SimulationProcess;

import voterSim2.rules.api.RulesSimSGApi;

public class SimulationRunner {

	public static void main(String[] args) {
		RulesSimSGApi api = new RulesSimSGApi();
		api.configureForHiPE();
//		api.configureSimpleSimulation(false);
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();
		config.setConsoleInfoLevel(SimulationProcess.CONSOLE_LEVEL_DEBUG);
//		config.setModel("users20_groups2_topics2");
		config.setModel("103voters_connected");
//		config.addObservableStatistic();
		Simulation sim = config.createSimulation();
		sim.initializeClocked();
		sim.runClocked();
		sim.printCurrentMatches();
		sim.displayResults(true);
//		sim.saveModelGraph();
		sim.finish();

	}

}
