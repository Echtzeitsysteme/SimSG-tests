package groupVotersGen.rules.hipe.engine;

import java.io.File;
import java.io.IOException;

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

import groupVotersGen.rules.hipe.engine.actor.NotificationActor;
import groupVotersGen.rules.hipe.engine.actor.DispatchActor;
import groupVotersGen.rules.hipe.engine.actor.junction.agreeFalse_1_junction;
import groupVotersGen.rules.hipe.engine.actor.junction.agreeTrue_7_junction;
import groupVotersGen.rules.hipe.engine.actor.node.Voter1_object_SP0;
import groupVotersGen.rules.hipe.engine.actor.node.Voter1_object_SP1;
import groupVotersGen.rules.hipe.engine.actor.node.Voter1_object_SP2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

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
	
	public HiPEEngine() {
		thread = Thread.currentThread();
		incUtil.registerWakeUpCall(this::wakeUp);
		
		loadNetwork();
	}
	
	public void loadNetwork() {
		ResourceSet rs = new ResourceSetImpl();
		String cp = "";
		File file = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString() + getClass().getPackageName().replace(".", "/") + "/" + "hipe-network.xmi");
				try {
					 cp = file.getCanonicalPath();
					 cp = cp.replace("%20", " ");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		URI uri = URI.createFileURI(cp);
		Resource r = rs.createResource(uri);

		try {
			r.load(null);
			network = (HiPENetwork) r.getContents().get(0);
		} catch(Exception e) {
			throw new RuntimeException("Network file could not be loaded via " + uri);	
		}
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
		classes.put("agreeFalse_production", GenericProductionActor.class);
		productionNodes2pattern.put("agreeFalse_production", "agreeFalse");
		classes.put("agreeTrue_production", GenericProductionActor.class);
		productionNodes2pattern.put("agreeTrue_production", "agreeTrue");
		classes.put("connectedVG_production", GenericProductionActor.class);
		productionNodes2pattern.put("connectedVG_production", "connectedVG");
		classes.put("falseMemberVG_production", GenericProductionActor.class);
		productionNodes2pattern.put("falseMemberVG_production", "falseMemberVG");
		classes.put("falseMemberVG_CONDITION_g_production", GenericProductionActor.class);
		productionNodes2pattern.put("falseMemberVG_CONDITION_g_production", "falseMemberVG_CONDITION_g");
		classes.put("hetGroup_production", GenericProductionActor.class);
		productionNodes2pattern.put("hetGroup_production", "hetGroup");
		classes.put("homGroupFalse_production", GenericProductionActor.class);
		productionNodes2pattern.put("homGroupFalse_production", "homGroupFalse");
		classes.put("homGroupTrue_production", GenericProductionActor.class);
		productionNodes2pattern.put("homGroupTrue_production", "homGroupTrue");
		classes.put("newMembership_production", GenericProductionActor.class);
		productionNodes2pattern.put("newMembership_production", "newMembership");
		classes.put("trueMemberVG_production", GenericProductionActor.class);
		productionNodes2pattern.put("trueMemberVG_production", "trueMemberVG");
		classes.put("trueMemberVG_CONDITION_g_production", GenericProductionActor.class);
		productionNodes2pattern.put("trueMemberVG_CONDITION_g_production", "trueMemberVG_CONDITION_g");
		classes.put("voteFalse_production", GenericProductionActor.class);
		productionNodes2pattern.put("voteFalse_production", "voteFalse");
		classes.put("voteTrue_production", GenericProductionActor.class);
		productionNodes2pattern.put("voteTrue_production", "voteTrue");
		
	}
	
	public void createJunctionNodes() {
		classes.put("agreeFalse_1_junction", agreeFalse_1_junction.class);
		classes.put("agreeTrue_7_junction", agreeTrue_7_junction.class);
		classes.put("hetGroup_25_junction", GenericJunctionActor.class);
		classes.put("homGroupFalse_26_nacjunction", GenericNACJunctionActor.class);
		classes.put("homGroupTrue_28_nacjunction", GenericNACJunctionActor.class);
		classes.put("newMembership_31_junction", GenericJunctionActor.class);
		classes.put("newMembership_30_nacjunction", GenericNACJunctionActor.class);
	}
	
	public void createReferenceNodes() {
		classes.put("Voter1_member_0_reference",Voter1_member_0_reference.class);
		classes.put("Voter1_member_1_reference",Voter1_member_1_reference.class);
		classes.put("Voter1_member_2_reference",Voter1_member_2_reference.class);
		classes.put("Voter1_member_3_reference",Voter1_member_3_reference.class);
		classes.put("Voter1_member_4_reference",Voter1_member_4_reference.class);
		classes.put("Voter1_member_5_reference",Voter1_member_5_reference.class);
		
	}
	
	public void createObjectNodes() {
		classes.put("Voter1_object_SP0",Voter1_object_SP0.class);
		classes.put("Voter1_object_SP1",Voter1_object_SP1.class);
		classes.put("Voter1_object_SP2",Voter1_object_SP2.class);
		classes.put("Group_object_SP0",Group_object_SP0.class);
		classes.put("Group_object_SP1",Group_object_SP1.class);
		classes.put("Group_object_SP2",Group_object_SP2.class);
		
	}
	
	public void initializeReferenceNodes() {
		name2initRefGen.put("Voter1_member_0_reference", new InitGenReferenceActor<GroupVoters.Voter1,GroupVoters.Group>(name2actor, name2node.get("Voter1_member_0_reference"), (o) -> o instanceof GroupVoters.Voter1, null, (o) -> o.getMember(), false, prodUtil, incUtil));
		name2initRefGen.put("Voter1_member_1_reference", new InitGenReferenceActor<GroupVoters.Voter1,GroupVoters.Group>(name2actor, name2node.get("Voter1_member_1_reference"), (o) -> o instanceof GroupVoters.Voter1, null, (o) -> o.getMember(), false, prodUtil, incUtil));
		name2initRefGen.put("Voter1_member_2_reference", new InitGenReferenceActor<GroupVoters.Voter1,GroupVoters.Group>(name2actor, name2node.get("Voter1_member_2_reference"), (o) -> o instanceof GroupVoters.Voter1, null, (o) -> o.getMember(), false, prodUtil, incUtil));
		name2initRefGen.put("Voter1_member_3_reference", new InitGenReferenceActor<GroupVoters.Voter1,GroupVoters.Group>(name2actor, name2node.get("Voter1_member_3_reference"), (o) -> o instanceof GroupVoters.Voter1, null, (o) -> o.getMember(), false, prodUtil, incUtil));
		name2initRefGen.put("Voter1_member_4_reference", new InitGenReferenceActor<GroupVoters.Voter1,GroupVoters.Group>(name2actor, name2node.get("Voter1_member_4_reference"), (o) -> o instanceof GroupVoters.Voter1, null, (o) -> o.getMember(), false, prodUtil, incUtil));
		name2initRefGen.put("Voter1_member_5_reference", new InitGenReferenceActor<GroupVoters.Voter1,GroupVoters.Group>(name2actor, name2node.get("Voter1_member_5_reference"), (o) -> o instanceof GroupVoters.Voter1, null, (o) -> o.getMember(), false, prodUtil, incUtil));
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

class Group_object_SP0 extends GenericObjectActor<GroupVoters.Group> { }
class Group_object_SP1 extends GenericObjectActor<GroupVoters.Group> { }
class Group_object_SP2 extends GenericObjectActor<GroupVoters.Group> { }

class Voter1_member_0_reference extends GenericReferenceActor<GroupVoters.Voter1, GroupVoters.Group> { }
class Voter1_member_1_reference extends GenericReferenceActor<GroupVoters.Voter1, GroupVoters.Group> { }
class Voter1_member_2_reference extends GenericReferenceActor<GroupVoters.Voter1, GroupVoters.Group> { }
class Voter1_member_3_reference extends GenericReferenceActor<GroupVoters.Voter1, GroupVoters.Group> { }
class Voter1_member_4_reference extends GenericReferenceActor<GroupVoters.Voter1, GroupVoters.Group> { }
class Voter1_member_5_reference extends GenericReferenceActor<GroupVoters.Voter1, GroupVoters.Group> { }

