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
		
//		Simulation sim = config.createSimulation();
//		sim.initialize();
//		Simulation sim1 = config.createSimulation();
//		sim1.initialize();
//		Simulation sim2 = config.createSimulation();
//		sim2.initialize();
//		Simulation sim3 = config.createSimulation();
//		sim3.initialize();
	}

}