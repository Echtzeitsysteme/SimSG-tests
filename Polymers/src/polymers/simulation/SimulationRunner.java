package polymers.simulation;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.simulation.SimulationContainer;

import polymers.rules.api.RulesSimSGApi;


public class SimulationRunner {

	public static void main(String[] args) {
		RulesSimSGApi api = new RulesSimSGApi();
//		api.configureForHiPE();
		api.configureForDemocles();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();
		config.setModel("10atoms_unconnected");
		
//		Simulation sim = config.createSimulation();
//		sim.initializeClocked();
//		sim.runClocked();
//		sim.printCurrentMatches();
//		sim.displayResults();
//		sim.finish();
		
		SimulationContainer simContainer = config.createSimulations(10);
		simContainer.initialize();
		simContainer.run();
		simContainer.displayResults();
		simContainer.finish();

	}

}
