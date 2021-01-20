package groupVotersGen.rules.api;
import org.simsg.core.simulation.SimSGAPI;
import java.util.HashMap;
import GroupVoters.GroupVotersPackage;
import groupVotersGen.rules.api.RulesHiPEApp;
import groupVotersGen.rules.api.RulesDemoclesApp;
		
public class RulesSimSGApi extends SimSGAPI{
			
	public RulesSimSGApi() {
		super();
		configurator.setProjectFolder(System.getProperty("user.dir"));
		configurator.setRootDataFolder(System.getProperty("user.dir")+"/instances"); 
		configurator.setSimulationDefinitionFolder(System.getProperty("user.dir")+"/instances/simulation_definitions"); 
		configurator.setSimulationInstancesFolder(System.getProperty("user.dir")+"/instances/simulation_instances"); 
		configurator.setSimulationResultsFolder(System.getProperty("user.dir")+"/instances/simulation_results"); 
	}
			
	public void configureForHiPE() {
		configurator.configureForIBeX(apps.get("RulesHiPEApp"));
	}
			
	public void configureForDemocles() {
		configurator.configureForIBeX(apps.get("RulesDemoclesApp"));
	}	
				
	public void configureStochasticSimulation() {
		try {
			configurator.setStochasticSimulation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
			
	public void configureSimpleSimulation(final boolean deterministic) {
		try {
			configurator.setSimpleSimulation(deterministic);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initAppsMap() {
		apps = new HashMap<>();
		apps.put("RulesHiPEApp", () -> new RulesHiPEApp());
		apps.put("RulesDemoclesApp", () -> new RulesDemoclesApp());
	}
			
	@Override
	public void registerMetamodels() {
		addMetaModel(GroupVotersPackage.eINSTANCE.getNsURI(), GroupVotersPackage.eINSTANCE);
	}
	
}