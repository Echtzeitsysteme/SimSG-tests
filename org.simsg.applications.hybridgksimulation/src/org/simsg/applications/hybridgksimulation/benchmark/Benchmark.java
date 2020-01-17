package org.simsg.applications.hybridgksimulation.benchmark;

import org.eclipse.emf.common.util.URI;
import org.simsg.applications.hybridgksimulation.api.HybridgksimulationAPI;
import org.simsg.applications.hybridgksimulation.api.HybridgksimulationApp;
import org.simsg.applications.hybridgksimulation.api.HybridgksimulationDemoclesApp;
import org.simsg.applications.hybridgksimulation.api.HybridgksimulationHiPEApp;
import org.simsg.applications.hybridgksimulation.api.matches.KtXfwdMatch;
import org.simsg.adapter.HybridGkDemoclesGT;
import org.simsg.adapter.HybridGkHiPEGT;
import org.simsg.adapter.HybridGkPMC;
import org.simsg.adapter.HybridRuleUtils;
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
		config.setGT(HybridGkHiPEGT.class);
		config.setIBeXHiPEAsEngine();
//		config.setGT(HybridGkDemoclesGT.class);
//		config.setIBeXDemoclesAsEngine();	
		config.setPMC(HybridGkPMC.class);
		config.setStochasticSimulation();
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
		//HybridgksimulationApp app = new HybridgksimulationHiPEApp();
		HybridgksimulationApp app = new HybridgksimulationDemoclesApp();
		app.loadModel(URI.createFileURI("instances/default1600.xmi"));
		
		double superTic = System.currentTimeMillis();
		double tic = System.currentTimeMillis();
		HybridgksimulationAPI api = app.initAPI();
		api.updateMatches();
		double toc = System.currentTimeMillis();
		System.out.println("Init: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		System.out.println(HybridRuleUtils.countKTX_FWD_LHS(api));
		toc = System.currentTimeMillis();
		System.out.println("Count: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		HybridRuleUtils.applyRuleKTX_FWD(HybridRuleUtils.constructKTX_FWD_LHS(api));
		toc = System.currentTimeMillis();
		System.out.println("Apply: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		System.out.println(HybridRuleUtils.countKTX_FWD_LHS(api));
		toc = System.currentTimeMillis();
		System.out.println("Count: "+ (toc-tic)+"ms");
		
		tic = System.currentTimeMillis();
		api.updateMatches();
		System.out.println(HybridRuleUtils.countKTX_FWD_LHS(api));
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
