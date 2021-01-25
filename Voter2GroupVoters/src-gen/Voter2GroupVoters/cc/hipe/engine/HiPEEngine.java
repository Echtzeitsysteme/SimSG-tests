package Voter2GroupVoters.cc.hipe.engine;

import org.eclipse.emf.common.notify.Notification;

import java.text.DecimalFormat;
import java.lang.Thread;
import java.time.Duration;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import static akka.pattern.Patterns.ask;

import Voter2GroupVoters.cc.hipe.engine.actor.NotificationActor;
import Voter2GroupVoters.cc.hipe.engine.actor.DispatchActor;
import Voter2GroupVoters.cc.hipe.engine.actor.localsearch.Container2GroupVotersContainer__CONSISTENCY_4_localSearch;
import Voter2GroupVoters.cc.hipe.engine.actor.localsearch.Voter2GroupVoter__CC_9_localSearch;
import Voter2GroupVoters.cc.hipe.engine.actor.localsearch.Voter2GroupVoter__CONSISTENCY_15_localSearch;
import Voter2GroupVoters.cc.hipe.engine.actor.localsearch.Voter2Group__CC_23_localSearch;
import Voter2GroupVoters.cc.hipe.engine.actor.localsearch.Voter2Group__CONSISTENCY_32_localSearch;
import Voter2GroupVoters.cc.hipe.engine.actor.localsearch.VoterRelation2VoterGroupRelation__CC_43_localSearch;
import Voter2GroupVoters.cc.hipe.engine.actor.localsearch.VoterRelation2VoterGroupRelation__CONSISTENCY_51_localSearch;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitActor;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.InitGenReferenceActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;
import hipe.engine.message.ExtractData;
import hipe.engine.message.production.ProductionResult;

import hipe.engine.util.IncUtil;
import hipe.engine.util.ProductionUtil;
import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;
import hipe.generic.actor.junction.util.HiPEConfig;

import hipe.network.*;

public class HiPEEngine implements IHiPEEngine{

	private final ActorSystem system = ActorSystem.create("HiPE-Engine");
	private ActorRef dispatcher;
	private ActorRef notificationActor;

	private Map<String, NetworkNode> name2node = new HashMap<>();
	
	private Map<String, ActorRef> name2actor = new ConcurrentHashMap<>();
	private Map<String, InitGenReferenceActor<?,?>> name2initRefGen = new ConcurrentHashMap<>();
	private Map<String, Class<?>> classes = new ConcurrentHashMap<>();
	private Map<String, String> productionNodes2pattern = new ConcurrentHashMap<>();
	private boolean dirty = false;
	private HiPENetwork network;
	
	final private IncUtil incUtil = new IncUtil();
	final private ProductionUtil prodUtil = new ProductionUtil();
	
	private long time = 0;
	private int counter = 0;
	
	private Thread thread;
	
	public HiPEEngine(HiPENetwork network) {
		thread = Thread.currentThread();
		incUtil.registerWakeUpCall(this::wakeUp);
		
		this.network = network;
	}
	
	public boolean wakeUp() {
		thread.interrupt();
		return true;
	}
	
	public void initialize() throws InterruptedException {
		network.getNetworknode().stream().forEach(n -> name2node.put(n.getName(), n));
		
		createProductionNodes();
		createJunctionNodes();
		createReferenceNodes();
		createObjectNodes();

		initializeReferenceNodes();

		classes.keySet().parallelStream().forEach(name -> {
			name2actor.put(name, system.actorOf(Props.create(classes.get(name))));			
		});
		
		dispatcher = system.actorOf(
				Props.create(DispatchActor.class, () -> new DispatchActor(name2actor, incUtil)),
				"DispatchActor");
		
		notificationActor = system.actorOf(Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher, incUtil)), "NotificationActor");
		
		name2actor.values().forEach(actor -> actor.tell(new InitActor(name2actor), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ObjectNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ReferenceNode).forEach(n -> name2actor.get(n.getName()).tell(name2initRefGen.get(n.getName()), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof AbstractJunctionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ProductionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		}
	
	public void createProductionNodes() {
		classes.put("Container2GroupVotersContainer__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Container2GroupVotersContainer__CC_production", "Container2GroupVotersContainer__CC");
		classes.put("Container2GroupVotersContainer__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Container2GroupVotersContainer__CONSISTENCY_production", "Container2GroupVotersContainer__CONSISTENCY");
		classes.put("Voter2GroupVoter__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Voter2GroupVoter__CC_production", "Voter2GroupVoter__CC");
		classes.put("Voter2GroupVoter__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Voter2GroupVoter__CONSISTENCY_production", "Voter2GroupVoter__CONSISTENCY");
		classes.put("Voter2Group__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("Voter2Group__CC_production", "Voter2Group__CC");
		classes.put("Voter2Group__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("Voter2Group__CONSISTENCY_production", "Voter2Group__CONSISTENCY");
		classes.put("VoterRelation2VoterGroupRelation__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("VoterRelation2VoterGroupRelation__CC_production", "VoterRelation2VoterGroupRelation__CC");
		classes.put("VoterRelation2VoterGroupRelation__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("VoterRelation2VoterGroupRelation__CONSISTENCY_production", "VoterRelation2VoterGroupRelation__CONSISTENCY");
		
	}
	
	public void createJunctionNodes() {
		classes.put("Container2GroupVotersContainer__CC_1_junction", GenericJunctionActor.class);
		classes.put("Container2GroupVotersContainer__CONSISTENCY_4_localSearch", Container2GroupVotersContainer__CONSISTENCY_4_localSearch.class);
		classes.put("Voter2GroupVoter__CC_9_localSearch", Voter2GroupVoter__CC_9_localSearch.class);
		classes.put("Voter2GroupVoter__CONSISTENCY_15_localSearch", Voter2GroupVoter__CONSISTENCY_15_localSearch.class);
		classes.put("Voter2Group__CC_23_localSearch", Voter2Group__CC_23_localSearch.class);
		classes.put("Voter2Group__CONSISTENCY_32_localSearch", Voter2Group__CONSISTENCY_32_localSearch.class);
		classes.put("VoterRelation2VoterGroupRelation__CC_43_localSearch", VoterRelation2VoterGroupRelation__CC_43_localSearch.class);
		classes.put("VoterRelation2VoterGroupRelation__CONSISTENCY_51_localSearch", VoterRelation2VoterGroupRelation__CONSISTENCY_51_localSearch.class);
	}
	
	public void createReferenceNodes() {
		
	}
	
	public void createObjectNodes() {
		classes.put("Container_object",Container_object.class);
		classes.put("GroupVotersContainer_object",GroupVotersContainer_object.class);
		classes.put("Container2GroupVotersContainer_object",Container2GroupVotersContainer_object.class);
		classes.put("Container2GroupVotersContainer__Marker_object",Container2GroupVotersContainer__Marker_object.class);
		classes.put("Voter2GroupVoter__Marker_object",Voter2GroupVoter__Marker_object.class);
		classes.put("Group_object",Group_object.class);
		classes.put("Voter2Group_object",Voter2Group_object.class);
		classes.put("Voter2Group__Marker_object",Voter2Group__Marker_object.class);
		classes.put("VoterRelation2VoterGroupRelation__Marker_object",VoterRelation2VoterGroupRelation__Marker_object.class);
		classes.put("Voter1_object_SP0",Voter1_object_SP0.class);
		classes.put("Voter1_object_SP1",Voter1_object_SP1.class);
		classes.put("Voter1_1_object_SP0",Voter1_1_object_SP0.class);
		classes.put("Voter1_1_object_SP1",Voter1_1_object_SP1.class);
		classes.put("Voter2GroupVoter_object_SP0",Voter2GroupVoter_object_SP0.class);
		classes.put("Voter2GroupVoter_object_SP1",Voter2GroupVoter_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
	}
	
	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */			
	public void handleNotification(Notification notification) {
		try {
			dirty = true;
			ask(notificationActor, new NotificationMessage(notification), Duration.ofHours(24)).toCompletableFuture().get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}			
	}
	
	public Map<String, ProductionResult> extractData() throws InterruptedException {
		if(!dirty) {
			return java.util.Collections.synchronizedMap(new HashMap<>());
		}	
		
		long tic = System.nanoTime();
		counter++;
		
		dirty = false;
		
		notificationActor.tell(new NoMoreInput(), notificationActor);
		
		try {
			Thread.sleep(100000000);
		} catch(Exception e) {
		}
		
		Map<String, ProductionResult> productionResults = prodUtil.getProductionResults();
				
		incUtil.clean();
		prodUtil.clean();
		
		time += System.nanoTime() - tic;
		
		return productionResults;
	}
	
	public void terminate() {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("HiPEEngine" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
						
		system.terminate();	
	}
	
}

class Container_object extends GenericObjectActor<Voter.Container> { }
class GroupVotersContainer_object extends GenericObjectActor<GroupVoters.GroupVotersContainer> { }
class Container2GroupVotersContainer_object extends GenericObjectActor<Voter2GroupVoters.Container2GroupVotersContainer> { }
class Container2GroupVotersContainer__Marker_object extends GenericObjectActor<Voter2GroupVoters.Container2GroupVotersContainer__Marker> { }
class Voter2GroupVoter__Marker_object extends GenericObjectActor<Voter2GroupVoters.Voter2GroupVoter__Marker> { }
class Group_object extends GenericObjectActor<GroupVoters.Group> { }
class Voter2Group_object extends GenericObjectActor<Voter2GroupVoters.Voter2Group> { }
class Voter2Group__Marker_object extends GenericObjectActor<Voter2GroupVoters.Voter2Group__Marker> { }
class VoterRelation2VoterGroupRelation__Marker_object extends GenericObjectActor<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker> { }
class Voter1_object_SP0 extends GenericObjectActor<Voter.Voter1> { }
class Voter1_object_SP1 extends GenericObjectActor<Voter.Voter1> { }
class Voter1_1_object_SP0 extends GenericObjectActor<GroupVoters.Voter1> { }
class Voter1_1_object_SP1 extends GenericObjectActor<GroupVoters.Voter1> { }
class Voter2GroupVoter_object_SP0 extends GenericObjectActor<Voter2GroupVoters.Voter2GroupVoter> { }
class Voter2GroupVoter_object_SP1 extends GenericObjectActor<Voter2GroupVoters.Voter2GroupVoter> { }

