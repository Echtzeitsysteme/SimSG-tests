package org.simsg.applications.gksimulation.benchmark;

import org.eclipse.emf.common.util.URI;
import org.simsg.applications.gksimulation.api.GksimulationAPI;
import org.simsg.applications.gksimulation.api.GksimulationApp;
import org.simsg.applications.gksimulation.api.GksimulationDemoclesApp;
import org.simsg.applications.gksimulation.api.GksimulationHiPEApp;
import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import GoldbeterKoshland.util.ModelGenerator;

public class Benchmark {
	
	public static void main(String[] args) {

//		createModels();
		
		
		SimulationConfigurator config = new SimulationConfigurator(); 
		config.setRootDataFolder(System.getProperty("user.dir")+"/models"); 
		config.setModel("default100");
		config.setIBeXHiPEAsEngine("org.simsg.applications.gksimulation.api");
		config.setIBeXHiPEGT("org.simsg.applications.gksimulation.api");
		config.setIBeXPMC();
//		config.setIBeXDemoclesAsEngine();
//		config.setIBeXDemoclesGT();
		try {
			config.setStochasticSimulation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		config.addSimpleTerminationCondition(10000, -1);
		//config.addSimpleTerminationCondition(-1, 20.0);
		config.addObservableStatistic();
		 
		Simulation sim = config.createSimulation();
		sim.initializeClocked();
		sim.runClocked();
		sim.printCurrentMatches(); 
		sim.displayResults();
		sim.saveModelGraph();
		sim.finish();
		
		System.out.println(Runtimer.getInstance().toString());

		
		//rawApplications();
	}
	
	public static void rawApplications() {
		GksimulationApp app = new GksimulationHiPEApp();
		app.loadModel(URI.createFileURI("instances/default800.xmi"));
		
		double superTic = System.currentTimeMillis();
		double tic = System.currentTimeMillis();
		GksimulationAPI api = app.initAPI();
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
		ModelGenerator.createAndSaveModel("instances/default100.xmi", 100);
		Utils.generateGKSimulation("default100");
		ModelGenerator.createAndSaveModel("instances/default200.xmi", 200);
		Utils.generateGKSimulation("default200");
		ModelGenerator.createAndSaveModel("instances/default400.xmi", 400);
		Utils.generateGKSimulation("default400");
		ModelGenerator.createAndSaveModel("instances/default800.xmi", 800);
		Utils.generateGKSimulation("default800");
		ModelGenerator.createAndSaveModel("instances/default1600.xmi", 1600);
		Utils.generateGKSimulation("default1600");
	}

}
