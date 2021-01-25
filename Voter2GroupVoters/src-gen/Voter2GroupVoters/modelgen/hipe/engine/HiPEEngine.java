package Voter2GroupVoters.modelgen.hipe.engine;

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

import Voter2GroupVoters.modelgen.hipe.engine.actor.NotificationActor;
import Voter2GroupVoters.modelgen.hipe.engine.actor.DispatchActor;
import Voter2GroupVoters.modelgen.hipe.engine.actor.localsearch.Voter2GroupVoter__GEN_1_localSearch;
import Voter2GroupVoters.modelgen.hipe.engine.actor.junction.Voter2Group__GEN_5_junction;
import Voter2GroupVoters.modelgen.hipe.engine.actor.junction.VoterRelation2VoterGroupRelation__GEN_26_junction;

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
		classes.put("Voter2GroupVoter__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Voter2GroupVoter__GEN_production", "Voter2GroupVoter__GEN");
		classes.put("Voter2Group__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("Voter2Group__GEN_production", "Voter2Group__GEN");
		classes.put("VoterRelation2VoterGroupRelation__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("VoterRelation2VoterGroupRelation__GEN_production", "VoterRelation2VoterGroupRelation__GEN");
		
	}
	
	public void createJunctionNodes() {
		classes.put("Voter2GroupVoter__GEN_1_localSearch", Voter2GroupVoter__GEN_1_localSearch.class);
		classes.put("Voter2Group__GEN_6_junction", GenericJunctionActor.class);
		classes.put("Voter2Group__GEN_10_junction", GenericJunctionActor.class);
		classes.put("Voter2Group__GEN_18_junction", GenericJunctionActor.class);
		classes.put("Voter2Group__GEN_11_junction", GenericJunctionActor.class);
		classes.put("Voter2Group__GEN_7_junction", GenericJunctionActor.class);
		classes.put("Voter2Group__GEN_5_junction", Voter2Group__GEN_5_junction.class);
		classes.put("VoterRelation2VoterGroupRelation__GEN_27_junction", GenericJunctionActor.class);
		classes.put("VoterRelation2VoterGroupRelation__GEN_28_junction", GenericJunctionActor.class);
		classes.put("VoterRelation2VoterGroupRelation__GEN_26_junction", VoterRelation2VoterGroupRelation__GEN_26_junction.class);
	}
	
	public void createReferenceNodes() {
		classes.put("Voter2GroupVoter_source_0_reference",Voter2GroupVoter_source_0_reference.class);
		classes.put("Voter2GroupVoter_target_0_reference",Voter2GroupVoter_target_0_reference.class);
		classes.put("Voter2Group_source_0_reference",Voter2Group_source_0_reference.class);
		classes.put("Voter1_member_0_reference",Voter1_member_0_reference.class);
		classes.put("Voter2Group_target_0_reference",Voter2Group_target_0_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("Container_object",Container_object.class);
		classes.put("Container2GroupVotersContainer_object",Container2GroupVotersContainer_object.class);
		classes.put("GroupVotersContainer_object",GroupVotersContainer_object.class);
		classes.put("Voter2GroupVoter_object",Voter2GroupVoter_object.class);
		classes.put("Voter1_object",Voter1_object.class);
		classes.put("Voter1_1_object",Voter1_1_object.class);
		classes.put("Voter2Group_object",Voter2Group_object.class);
		classes.put("Group_object",Group_object.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("Voter2GroupVoter_source_0_reference", new InitGenReferenceActor<Voter2GroupVoters.Voter2GroupVoter,Voter.Voter1>(name2actor, name2node.get("Voter2GroupVoter_source_0_reference"), (o) -> o instanceof Voter2GroupVoters.Voter2GroupVoter, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Voter2GroupVoter_target_0_reference", new InitGenReferenceActor<Voter2GroupVoters.Voter2GroupVoter,GroupVoters.Voter1>(name2actor, name2node.get("Voter2GroupVoter_target_0_reference"), (o) -> o instanceof Voter2GroupVoters.Voter2GroupVoter, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Voter2Group_source_0_reference", new InitGenReferenceActor<Voter2GroupVoters.Voter2Group,Voter.Voter1>(name2actor, name2node.get("Voter2Group_source_0_reference"), (o) -> o instanceof Voter2GroupVoters.Voter2Group, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Voter1_member_0_reference", new InitGenReferenceActor<GroupVoters.Voter1,GroupVoters.Group>(name2actor, name2node.get("Voter1_member_0_reference"), (o) -> o instanceof GroupVoters.Voter1, null, (o) -> o.getMember(), false, prodUtil, incUtil));
		name2initRefGen.put("Voter2Group_target_0_reference", new InitGenReferenceActor<Voter2GroupVoters.Voter2Group,GroupVoters.Group>(name2actor, name2node.get("Voter2Group_target_0_reference"), (o) -> o instanceof Voter2GroupVoters.Voter2Group, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
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
class Container2GroupVotersContainer_object extends GenericObjectActor<Voter2GroupVoters.Container2GroupVotersContainer> { }
class GroupVotersContainer_object extends GenericObjectActor<GroupVoters.GroupVotersContainer> { }
class Voter2GroupVoter_object extends GenericObjectActor<Voter2GroupVoters.Voter2GroupVoter> { }
class Voter1_object extends GenericObjectActor<Voter.Voter1> { }
class Voter1_1_object extends GenericObjectActor<GroupVoters.Voter1> { }
class Voter2Group_object extends GenericObjectActor<Voter2GroupVoters.Voter2Group> { }
class Group_object extends GenericObjectActor<GroupVoters.Group> { }

class Voter2GroupVoter_source_0_reference extends GenericReferenceActor<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1> { }
class Voter2GroupVoter_target_0_reference extends GenericReferenceActor<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1> { }
class Voter2Group_source_0_reference extends GenericReferenceActor<Voter2GroupVoters.Voter2Group, Voter.Voter1> { }
class Voter1_member_0_reference extends GenericReferenceActor<GroupVoters.Voter1, GroupVoters.Group> { }
class Voter2Group_target_0_reference extends GenericReferenceActor<Voter2GroupVoters.Voter2Group, GroupVoters.Group> { }

