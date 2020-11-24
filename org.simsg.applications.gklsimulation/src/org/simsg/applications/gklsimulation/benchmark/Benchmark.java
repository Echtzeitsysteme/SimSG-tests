package org.simsg.applications.gklsimulation.benchmark;

import org.eclipse.emf.common.util.URI;
import org.simsg.applications.gklsimulation.gkl.api.GklAPI;
import org.simsg.applications.gklsimulation.gkl.api.GklApp;
import org.simsg.applications.gklsimulation.gkl.api.GklHiPEApp;
import org.simsg.applications.gklsimulation.gkl.api.GklSimSGApi;
import org.simsg.applications.gklsimulation.util.ModelGenerator;
import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

public class Benchmark {
	
	public static void main(String[] args) {
//		createModels();
		GklSimSGApi api = new GklSimSGApi();
		api.configureForHiPE();
		api.configureStochasticSimulation();
		SimulationConfigurator config = api.getSimulationConfigurator();
		config.setModel("default100");
		config.addSimpleTerminationCondition(30000, -1);
		//config.addSimpleTerminationCondition(-1, 20.0);
		config.addObservableStatistic();
		 
		Simulation sim = config.createSimulation();
		sim.initializeClocked();
		sim.runClocked();
		sim.printCurrentMatches(); 
		sim.displayResults(true);
		sim.saveModelGraph();
		sim.finish();
		
		System.out.println(Runtimer.getInstance().toString());

		
		//rawApplications();
	}
	
	public static void rawApplications() {
		GklApp app = new GklHiPEApp();
		app.loadModel(URI.createFileURI("instances/default100.xmi"));
		
		double superTic = System.currentTimeMillis();
		double tic = System.currentTimeMillis();
		GklAPI api = app.initAPI();
		api.updateMatches();
		double toc = System.currentTimeMillis();
		System.out.println("Init: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		System.out.println(api.ktXfwd().countMatches());
		toc = System.currentTimeMillis();
		System.out.println("Count: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		api.ktXfwd().apply();
		toc = System.currentTimeMillis();
		System.out.println("Apply: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		System.out.println(api.ktXfwd().countMatches());
		toc = System.currentTimeMillis();
		System.out.println("Count: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		api.updateMatches();
		System.out.println(api.ktXfwd().countMatches());
		toc = System.currentTimeMillis();
		System.out.println("Update: "+ (toc-tic)+"ms");
		
		double superToc = System.currentTimeMillis();
		System.out.println("Total: "+ (superToc-superTic)+"ms");
		
		api.terminate();
	}
	
	public static void createModels() {
		ModelGenerator.createAndSaveModel("instances/simulation_instances/default100.xmi", 100);
		Utils.generateGKSimulation("default100");
		ModelGenerator.createAndSaveModel("instances/simulation_instances/default200.xmi", 200);
		Utils.generateGKSimulation("default200");
		ModelGenerator.createAndSaveModel("instances/simulation_instances/default400.xmi", 400);
		Utils.generateGKSimulation("default400");
		ModelGenerator.createAndSaveModel("instances/simulation_instances/default800.xmi", 800);
		Utils.generateGKSimulation("default800");
		ModelGenerator.createAndSaveModel("instances/simulation_instances/default1600.xmi", 1600);
		Utils.generateGKSimulation("default1600");
	}

}
