package org.simsg.applications.gksimulation.benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;

public class DemoclesBenchmark {
	
	public static void main(String[] args) {
		Utils.generateGKSimulation("default100");
		SimulationConfigurator config = new SimulationConfigurator(); 
		config.setModelFolder(System.getProperty("user.dir")+"/models"); 
		config.setModel("default100"); 
		config.setStochasticSimulation();
		config.addSimpleTerminationCondition(1000, -1);
		config.addObservableStatistic();
		 
		Simulation sim = config.createSimulation(); 
		sim.initialize(); 
		sim.run(); 
		sim.printCurrentMatches(); 
		sim.displayResults();
		sim.finish();
		
		
	}

}
