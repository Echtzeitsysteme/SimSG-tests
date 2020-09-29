package org.simsg.applications.hybridgklsimulation.benchmark;

import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.gt.api.GraphTransformationApp;
import org.simsg.applications.hybridgklsimulation.adapter.HybridGkGT;
import org.simsg.applications.hybridgklsimulation.adapter.HybridGkPMC;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.HybridgklAPI;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.HybridgklApp;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.HybridgklDemoclesApp;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.HybridgklHiPEApp;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.HybridgklSimSGApi;
import org.simsg.core.gt.IBeXGT;
import org.simsg.core.persistence.PersistenceManager;
import org.simsg.core.persistence.SimplePersistenceManager;
import org.simsg.core.pm.ibex.IBeXEngine;
import org.simsg.core.simulation.BackendContainer;
import org.simsg.core.simulation.Simulation;
import org.simsg.core.simulation.SimulationConfigurator;
import org.simsg.core.utils.Runtimer;

import GoldbeterKoshland.util.ModelGenerator;

public class Benchmark {
	
	public static void main(String[] args) {
//		createModels();
//		Utils.generateGKSimulation("default100");
		
		HybridgklSimSGApi simsg = new HybridgklSimSGApi();
		simsg.configureForHiPE();
		simsg.configureStochasticSimulation();
		SimulationConfigurator config = simsg.getSimulationConfigurator();
		
		Supplier<BackendContainer> backendConstructor = () -> {
			BackendContainer backend = new BackendContainer();
			backend.persistence = createPersistenceManager();
			GraphTransformationApp<?> app = new HybridgklHiPEApp();
			IBeXGT gt = new HybridGkGT();
			backend.gtEngine = gt;
			backend.pmEngine = new IBeXEngine(app, gt::setApiAndInit);
			backend.pmc = new HybridGkPMC();
			backend.pmc.setEngine(backend.pmEngine);
			
			return backend;
		};
		
		config.setBackend(backendConstructor);
		config.setModel("default100");
		config.addSimpleTerminationCondition(30000, -1);
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
		//HybridgksimulationApp app = new HybridgksimulationHiPEApp();
		HybridgklApp app = new HybridgklDemoclesApp();
		app.loadModel(URI.createFileURI("instances/default1600.xmi"));
		
		double superTic = System.currentTimeMillis();
		double tic = System.currentTimeMillis();
		HybridgklAPI api = app.initAPI();
		api.updateMatches();
		double toc = System.currentTimeMillis();
		System.out.println("Init: "+ (toc-tic)+"ms");
		
//		tic = System.currentTimeMillis();
//		System.out.println(HybridRuleUtils.countKTX_FWD_LHS(api));
//		toc = System.currentTimeMillis();
//		System.out.println("Count: "+ (toc-tic)+"ms");
//		
//		tic = System.currentTimeMillis();
//		HybridRuleUtils.applyRuleKTX_FWD(HybridRuleUtils.constructKTX_FWD_LHS(api));
//		toc = System.currentTimeMillis();
//		System.out.println("Apply: "+ (toc-tic)+"ms");
//		
//		tic = System.currentTimeMillis();
//		System.out.println(HybridRuleUtils.countKTX_FWD_LHS(api));
//		toc = System.currentTimeMillis();
//		System.out.println("Count: "+ (toc-tic)+"ms");
//		
//		tic = System.currentTimeMillis();
//		api.updateMatches();
//		System.out.println(HybridRuleUtils.countKTX_FWD_LHS(api));
//		toc = System.currentTimeMillis();
//		System.out.println("Update: "+ (toc-tic)+"ms");
		
		double superToc = System.currentTimeMillis();
		System.out.println("Total: "+ (superToc-superTic)+"ms");
		
		api.terminate();
	}
	
	private static PersistenceManager createPersistenceManager() {
		PersistenceManager persistence =  new SimplePersistenceManager();
		persistence.setProjectFolderPath(System.getProperty("user.dir"));
		persistence.setRootDataFolderPath(System.getProperty("user.dir")+"/instances");
		persistence.setSimulationDefinitionFolderPath(System.getProperty("user.dir")+"/instances/simulation_definitions");
		persistence.setSimulationInstancesFolderPath(System.getProperty("user.dir")+"/instances/simulation_instances");
		persistence.setSimulationResultsFolderPath(System.getProperty("user.dir")+"/instances/simulation_results");

		return persistence;
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
