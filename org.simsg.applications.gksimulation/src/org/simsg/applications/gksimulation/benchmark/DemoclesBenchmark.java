package org.simsg.applications.gksimulation.benchmark;

import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;

import GoldbeterKoshland.util.ModelGenerator;

public class DemoclesBenchmark {
	
	public static void main(String[] args) {
		//ModelGenerator.createAndSaveModel("instances/default100.xmi", 100);
		//Utils.generateGKSimulation("default100");
		SimulationConfigurator config = new SimulationConfigurator(); 
		config.setModelFolder(System.getProperty("user.dir")+"/models"); 
		config.setModel("default100"); 
		config.setStochasticSimulation();
		//config.addSimpleTerminationCondition(20000, -1);
		config.addSimpleTerminationCondition(-1, 20.0);
		config.addObservableStatistic();
		 
		Simulation sim = config.createSimulation(); 
		sim.initialize(); 
		sim.run(); 
		sim.printCurrentMatches(); 
		sim.displayResults();
		sim.saveModelGraph();
		sim.finish();
		
		
	}

}
