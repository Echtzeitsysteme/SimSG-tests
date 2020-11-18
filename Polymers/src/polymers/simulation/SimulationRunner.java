package polymers.simulation;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.simulation.SimulationContainer;

import polymers.rules.api.RulesSimSGApi;


public class SimulationRunner {

	public static void main(String[] args) {
		RulesSimSGApi api = new RulesSimSGApi();
		api.configureForHiPE();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();
//		config.setModel("users20_groups2_topics2");
		config.setModel("10atoms_unconnected");
//		config.addObservableStatistic();
		
//		Simulation sim = config.createSimulation();
//		sim.initializeClocked();
//		sim.runClocked();
//		sim.printCurrentMatches();
//		sim.displayResults();
//		sim.finish();
		SimulationContainer simContainer = config.createSimulations(1);
		simContainer.initialize();
		simContainer.run();
		simContainer.displayResults();
		simContainer.finish();
	}

}
