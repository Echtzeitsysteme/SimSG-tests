package Voter2GroupVoters.initbwd.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.*;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.HiPEMultiUtil;
import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.NotificationContainer;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2setConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = HiPEMultiUtil.createMap();
	
	private IncUtil incUtil;
	
	private ActorMaterializer materializer;
	
	public DispatchActor(Map<String, ActorRef> name2actor, IncUtil incUtil) {
		this.name2actor = name2actor;
		this.incUtil = incUtil;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	
		materializer = ActorMaterializer.create(getContext());
	}
	
	private void initializeAdd() {
		type2addConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroup(), obj -> {
			GroupVoters.Group _group = (GroupVoters.Group) obj;
			incUtil.newMessage();
			name2actor.get("Group_object").tell(new ObjectAdded<GroupVoters.Group>(incUtil, _group), getSelf());
		});
		type2addConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer(), obj -> {
			GroupVoters.GroupVotersContainer _groupvoterscontainer = (GroupVoters.GroupVotersContainer) obj;
			incUtil.newMessage();
			name2actor.get("GroupVotersContainer_object").tell(new ObjectAdded<GroupVoters.GroupVotersContainer>(incUtil, _groupvoterscontainer), getSelf());
		});
		type2addConsumer.put(Voter.VoterPackage.eINSTANCE.getContainer(), obj -> {
			Voter.Container _container = (Voter.Container) obj;
			incUtil.newMessage();
			name2actor.get("Container_object").tell(new ObjectAdded<Voter.Container>(incUtil, _container), getSelf());
		});
		type2addConsumer.put(Voter.VoterPackage.eINSTANCE.getVoter1(), obj -> {
			Voter.Voter1 _voter1 = (Voter.Voter1) obj;
			incUtil.newMessage();
			name2actor.get("Voter1_1_object").tell(new ObjectAdded<Voter.Voter1>(incUtil, _voter1), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer(), obj -> {
			Voter2GroupVoters.Container2GroupVotersContainer _container2groupvoterscontainer = (Voter2GroupVoters.Container2GroupVotersContainer) obj;
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer_object").tell(new ObjectAdded<Voter2GroupVoters.Container2GroupVotersContainer>(incUtil, _container2groupvoterscontainer), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter(), obj -> {
			Voter2GroupVoters.Voter2GroupVoter _voter2groupvoter = (Voter2GroupVoters.Voter2GroupVoter) obj;
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter_object").tell(new ObjectAdded<Voter2GroupVoters.Voter2GroupVoter>(incUtil, _voter2groupvoter), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group(), obj -> {
			Voter2GroupVoters.Voter2Group _voter2group = (Voter2GroupVoters.Voter2Group) obj;
			incUtil.newMessage();
			name2actor.get("Voter2Group_object").tell(new ObjectAdded<Voter2GroupVoters.Voter2Group>(incUtil, _voter2group), getSelf());
		});
		type2addConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1(), obj -> {
			GroupVoters.Voter1 _voter1 = (GroupVoters.Voter1) obj;
			incUtil.newMessage();
			name2actor.get("Voter1_object").tell(new ObjectAdded<GroupVoters.Voter1>(incUtil, _voter1), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer_Voter(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_2_localSearch").tell(new ReferenceAdded<GroupVoters.GroupVotersContainer, GroupVoters.Voter1>(incUtil,(GroupVoters.GroupVotersContainer) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "GroupVotersContainer_voter_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group_target_Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_2_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getNewValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group_source_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1_Member(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_2_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getNewValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer_Voter(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_2_localSearch").tell(new ReferenceDeleted<GroupVoters.GroupVotersContainer, GroupVoters.Voter1>(incUtil, (GroupVoters.GroupVotersContainer) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "GroupVotersContainer_voter_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group_target_Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_2_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getOldValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group_source_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1_Member(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_7_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_16_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_2_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getOldValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationContainer.class, this::handleNotificationContainer)
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		incUtil.allMessagesInserted();
	}
	
	private void handleNotificationContainer(NotificationContainer nc) {
		counter++;
		long tic = System.nanoTime();
		nc.notifications.parallelStream().forEach(this::handleNotification);
		time += System.nanoTime() - tic;
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
	}

	private void handleAdd(Notification notification) {
		if(notification.getFeature() == null) 
			handleAddedNode(notification.getNewValue());
		else
			handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		//check for self-edges
		if(notification.getNotifier().equals(notification.getNewValue()))
			handleAddedNode(notification.getNewValue());
					
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof Voter2GroupVoters.Container2GroupVotersContainer) {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer_object").tell(new ObjectDeleted<Voter2GroupVoters.Container2GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.Voter2Group) {
			incUtil.newMessage();
			name2actor.get("Voter2Group_object").tell(new ObjectDeleted<Voter2GroupVoters.Voter2Group>(incUtil, (Voter2GroupVoters.Voter2Group) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.Voter2GroupVoter) {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter_object").tell(new ObjectDeleted<Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) node), getSelf());
		}
		if (node instanceof Voter.Container) {
			incUtil.newMessage();
			name2actor.get("Container_object").tell(new ObjectDeleted<Voter.Container>(incUtil, (Voter.Container) node), getSelf());
		}
		if (node instanceof Voter.Voter1) {
			incUtil.newMessage();
			name2actor.get("Voter1_1_object").tell(new ObjectDeleted<Voter.Voter1>(incUtil, (Voter.Voter1) node), getSelf());
		}
		if (node instanceof GroupVoters.GroupVotersContainer) {
			incUtil.newMessage();
			name2actor.get("GroupVotersContainer_object").tell(new ObjectDeleted<GroupVoters.GroupVotersContainer>(incUtil, (GroupVoters.GroupVotersContainer) node), getSelf());
		}
		if (node instanceof GroupVoters.Voter1) {
			incUtil.newMessage();
			name2actor.get("Voter1_object").tell(new ObjectDeleted<GroupVoters.Voter1>(incUtil, (GroupVoters.Voter1) node), getSelf());
		}
		if (node instanceof GroupVoters.Group) {
			incUtil.newMessage();
			name2actor.get("Group_object").tell(new ObjectDeleted<GroupVoters.Group>(incUtil, (GroupVoters.Group) node), getSelf());
		}
	}
}

