package polymers.simulation;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.simulation.SimulationContainer;
import org.simsg.core.simulation.SimulationProcess;

import polymers.rules.api.RulesSimSGApi;


@SuppressWarnings("unused")
public class SimulationRunner {

	public static void main(String[] args) {
		RulesSimSGApi api = new RulesSimSGApi();
//		api.configureForHiPE();												// Sets HiPE as default pattern matcher (does not work for concurrent simulations -> TBD)
		api.configureForDemocles();											// Sets Democles as default pattern matcher (required for concurrent simulations)
		api.configureStochasticSimulation();								// Simulation uses Continous Timed Markov-chains (see Gillespie's Algorithm)
		SimulationConfigurator config = api.getSimulationConfigurator();	// Creates a simulation configurator object (similar to a factory)
		config.setModel("10atoms_unconnected");								// Sets the current simulation definition (Hint: Use model name, not model path.)
		config.setConsoleInfoLevel(SimulationProcess.CONSOLE_LEVEL_INFO);	// Sets verbosity levels of console output
		
//		Simulation sim = config.createSimulation();							// Creates a single simulation.
//		sim.initialize();
////	sim.initializeClocked();											// Inits the simulation, measures runtime and heap memory during init.
//		sim.run();
////	sim.runClocked();													// Runs the simulation, measures runtime and heap memory 
////	sim.printCurrentMatches();											// Prints final match counts to console
//		sim.displayResults(true); 											// Displays results of this simulation (true => time on x-axis / false => steps on x-axis)
//		sim.saveResultsToFile();											// Saves match statistics to .csv-file
//		sim.finish();														// Clears pattern matcher and simulation model
		
		SimulationContainer simContainer = config.createSimulations(10); 	// Creates N simulations to be run concurrently
		simContainer.initialize(); 											// Call this method before running a simulation
		simContainer.run();													// Runs N simulations concurrently and calculates the average over all simulations
		simContainer.saveResultsToFile();									// Saves match statistics to .csv-file
		simContainer.displayResults(true); 									// Displays results of the average over all simulations (true => time on x-axis / false => steps on x-axis)
//		simContainer.displayAllResults(); 									// Displays results of each simulation

	}

}
