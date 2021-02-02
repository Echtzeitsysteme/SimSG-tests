package Voter2GroupVoters.sync.hipe.engine.actor;

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
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter(), obj -> {
			Voter2GroupVoters.Voter2GroupVoter _voter2groupvoter = (Voter2GroupVoters.Voter2GroupVoter) obj;
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter_object_SP0").tell(new ObjectAdded<Voter2GroupVoters.Voter2GroupVoter>(incUtil, _voter2groupvoter), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter_object_SP1").tell(new ObjectAdded<Voter2GroupVoters.Voter2GroupVoter>(incUtil, _voter2groupvoter), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker(), obj -> {
			Voter2GroupVoters.Voter2GroupVoter__Marker _voter2groupvoter__marker = (Voter2GroupVoters.Voter2GroupVoter__Marker) obj;
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__Marker_object").tell(new ObjectAdded<Voter2GroupVoters.Voter2GroupVoter__Marker>(incUtil, _voter2groupvoter__marker), getSelf());
		});
		type2addConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroup(), obj -> {
			GroupVoters.Group _group = (GroupVoters.Group) obj;
			incUtil.newMessage();
			name2actor.get("Group_object_SP0").tell(new ObjectAdded<GroupVoters.Group>(incUtil, _group), getSelf());
			incUtil.newMessage();
			name2actor.get("Group_object_SP1").tell(new ObjectAdded<GroupVoters.Group>(incUtil, _group), getSelf());
		});
		type2addConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1(), obj -> {
			GroupVoters.Voter1 _voter1 = (GroupVoters.Voter1) obj;
			incUtil.newMessage();
			name2actor.get("Voter1_object_SP0").tell(new ObjectAdded<GroupVoters.Voter1>(incUtil, _voter1), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter1_object_SP1").tell(new ObjectAdded<GroupVoters.Voter1>(incUtil, _voter1), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group(), obj -> {
			Voter2GroupVoters.Voter2Group _voter2group = (Voter2GroupVoters.Voter2Group) obj;
			incUtil.newMessage();
			name2actor.get("Voter2Group_object").tell(new ObjectAdded<Voter2GroupVoters.Voter2Group>(incUtil, _voter2group), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker(), obj -> {
			Voter2GroupVoters.Voter2Group__Marker _voter2group__marker = (Voter2GroupVoters.Voter2Group__Marker) obj;
			incUtil.newMessage();
			name2actor.get("Voter2Group__Marker_object").tell(new ObjectAdded<Voter2GroupVoters.Voter2Group__Marker>(incUtil, _voter2group__marker), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker(), obj -> {
			Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker _voterrelation2votergrouprelation__marker = (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) obj;
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__Marker_object").tell(new ObjectAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker>(incUtil, _voterrelation2votergrouprelation__marker), getSelf());
		});
		type2addConsumer.put(Voter.VoterPackage.eINSTANCE.getVoter1(), obj -> {
			Voter.Voter1 _voter1 = (Voter.Voter1) obj;
			incUtil.newMessage();
			name2actor.get("Voter1_1_object_SP0").tell(new ObjectAdded<Voter.Voter1>(incUtil, _voter1), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter1_1_object_SP1").tell(new ObjectAdded<Voter.Voter1>(incUtil, _voter1), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker(), obj -> {
			Voter2GroupVoters.Container2GroupVotersContainer__Marker _container2groupvoterscontainer__marker = (Voter2GroupVoters.Container2GroupVotersContainer__Marker) obj;
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__Marker_object").tell(new ObjectAdded<Voter2GroupVoters.Container2GroupVotersContainer__Marker>(incUtil, _container2groupvoterscontainer__marker), getSelf());
		});
		type2addConsumer.put(Voter.VoterPackage.eINSTANCE.getContainer(), obj -> {
			Voter.Container _container = (Voter.Container) obj;
			incUtil.newMessage();
			name2actor.get("Container_object_SP0").tell(new ObjectAdded<Voter.Container>(incUtil, _container), getSelf());
			incUtil.newMessage();
			name2actor.get("Container_object_SP1").tell(new ObjectAdded<Voter.Container>(incUtil, _container), getSelf());
		});
		type2addConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer(), obj -> {
			Voter2GroupVoters.Container2GroupVotersContainer _container2groupvoterscontainer = (Voter2GroupVoters.Container2GroupVotersContainer) obj;
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer_object").tell(new ObjectAdded<Voter2GroupVoters.Container2GroupVotersContainer>(incUtil, _container2groupvoterscontainer), getSelf());
		});
		type2addConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer(), obj -> {
			GroupVoters.GroupVotersContainer _groupvoterscontainer = (GroupVoters.GroupVotersContainer) obj;
			incUtil.newMessage();
			name2actor.get("GroupVotersContainer_object_SP0").tell(new ObjectAdded<GroupVoters.GroupVotersContainer>(incUtil, _groupvoterscontainer), getSelf());
			incUtil.newMessage();
			name2actor.get("GroupVotersContainer_object_SP1").tell(new ObjectAdded<GroupVoters.GroupVotersContainer>(incUtil, _groupvoterscontainer), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(Voter.VoterPackage.eINSTANCE.getVoter1_Vote(), notification -> {
			if(notification.getNotifier() instanceof Voter.Voter1) {
				incUtil.newMessage();
				name2actor.get("Voter1_1_object_SP1").tell(new AttributeChanged<Voter.Voter1>(incUtil, (Voter.Voter1) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof Voter.Voter1) {
				incUtil.newMessage();
				name2actor.get("Voter1_1_object_SP0").tell(new AttributeChanged<Voter.Voter1>(incUtil, (Voter.Voter1) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1_Vote(), notification -> {
			if(notification.getNotifier() instanceof GroupVoters.Voter1) {
				incUtil.newMessage();
				name2actor.get("Voter1_object_SP1").tell(new AttributeChanged<GroupVoters.Voter1>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof GroupVoters.Voter1) {
				incUtil.newMessage();
				name2actor.get("Voter1_object_SP0").tell(new AttributeChanged<GroupVoters.Voter1>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getNewValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_8_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getNewValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getNewValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__FWD_21_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getNewValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CREATE__TRG__gV(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter__Marker, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter__Marker_CREATE__TRG__gV_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CREATE__SRC__v(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter__Marker_CREATE__SRC__v_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer_Voter(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_8_localSearch").tell(new ReferenceAdded<GroupVoters.GroupVotersContainer, GroupVoters.Voter1>(incUtil,(GroupVoters.GroupVotersContainer) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "GroupVotersContainer_voter_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<GroupVoters.GroupVotersContainer, GroupVoters.Voter1>(incUtil,(GroupVoters.GroupVotersContainer) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "GroupVotersContainer_voter_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__TRG__gV(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__TRG__gV_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter.VoterPackage.eINSTANCE.getVoter1_Link(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter.Voter1, Voter.Voter1>(incUtil,(Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter1_link_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<Voter.Voter1, Voter.Voter1>(incUtil,(Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter1_link_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter.Voter1, Voter.Voter1>(incUtil,(Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter1_link_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceAdded<Voter.Voter1, Voter.Voter1>(incUtil,(Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter1_link_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CREATE__CORR__v2g2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2Group>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getNewValue(), "Voter2Group__Marker_CREATE__CORR__v2g2_Voter2Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv2_Voter2GroupVoter"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter.Voter1>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter.VoterPackage.eINSTANCE.getContainer_Voters(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter.Container, Voter.Voter1>(incUtil,(Voter.Container) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Container_voters_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__FWD_21_localSearch").tell(new ReferenceAdded<Voter.Container, Voter.Voter1>(incUtil,(Voter.Container) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Container_voters_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getNewValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_8_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getNewValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getNewValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__FWD_21_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getNewValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__SRC__c(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer__Marker, Voter.Container>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer__Marker) notification.getNotifier(), (Voter.Container) notification.getNewValue(), "Container2GroupVotersContainer__Marker_CREATE__SRC__c_Container"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__TRG__gV2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__TRG__gV2_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CREATE__CORR__v2gv(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil,(Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getNewValue(), "Voter2GroupVoter__Marker_CREATE__CORR__v2gv_Voter2GroupVoter"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CONTEXT__TRG__gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter__Marker, GroupVoters.GroupVotersContainer>(incUtil,(Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getNewValue(), "Voter2GroupVoter__Marker_CONTEXT__TRG__gvc_GroupVotersContainer"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__CORR__v2gv(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__CORR__v2gv_Voter2GroupVoter"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer__Marker, GroupVoters.GroupVotersContainer>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer__Marker) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getNewValue(), "Container2GroupVotersContainer__Marker_CREATE__TRG__gvc_GroupVotersContainer"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Container2GroupVotersContainer__Marker, Voter2GroupVoters.Container2GroupVotersContainer>(incUtil,(Voter2GroupVoters.Container2GroupVotersContainer__Marker) notification.getNotifier(), (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNewValue(), "Container2GroupVotersContainer__Marker_CREATE__CORR__c2gvc_Container2GroupVotersContainer"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV2_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2Group>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g2_Voter2Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv_Voter2GroupVoter"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter.Voter1>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v2_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CREATE__TRG__group(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, GroupVoters.Group>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CREATE__TRG__group_Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CONTEXT__CORR__c2gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter2GroupVoters.Container2GroupVotersContainer>(incUtil,(Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNewValue(), "Voter2GroupVoter__Marker_CONTEXT__CORR__c2gvc_Container2GroupVotersContainer"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__CORR__v2gv2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__CORR__v2gv2_Voter2GroupVoter"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__SRC__v2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__SRC__v2_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getNewValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group_source_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__CORR__v2g1(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2Group>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__CORR__v2g1_Voter2Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__TRG__group(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__TRG__group_Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1_Member(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<GroupVoters.Voter1, GroupVoters.Group>(incUtil,(GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter1_member_Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g1(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2Group>(incUtil,(Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getNewValue(), "VoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g1_Voter2Group"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CONTEXT__SRC__c(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter.Container>(incUtil,(Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter.Container) notification.getNewValue(), "Voter2GroupVoter__Marker_CONTEXT__SRC__c_Container"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__SRC__v(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group__Marker, Voter.Voter1>(incUtil,(Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter.Voter1) notification.getNewValue(), "Voter2Group__Marker_CONTEXT__SRC__v_Voter1"), getSelf());
		});
		feature2addEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil,(Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getNewValue(), "Voter2Group_target_Group"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getOldValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_8_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getOldValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getOldValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__FWD_21_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, GroupVoters.GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getOldValue(), "Container2GroupVotersContainer_target_GroupVotersContainer"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CREATE__TRG__gV(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter__Marker, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter__Marker_CREATE__TRG__gV_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CREATE__SRC__v(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter__Marker_CREATE__SRC__v_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer_Voter(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_8_localSearch").tell(new ReferenceDeleted<GroupVoters.GroupVotersContainer, GroupVoters.Voter1>(incUtil, (GroupVoters.GroupVotersContainer) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "GroupVotersContainer_voter_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<GroupVoters.GroupVotersContainer, GroupVoters.Voter1>(incUtil, (GroupVoters.GroupVotersContainer) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "GroupVotersContainer_voter_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__TRG__gV(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__TRG__gV_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter.VoterPackage.eINSTANCE.getVoter1_Link(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter.Voter1, Voter.Voter1>(incUtil, (Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter1_link_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<Voter.Voter1, Voter.Voter1>(incUtil, (Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter1_link_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter.Voter1, Voter.Voter1>(incUtil, (Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter1_link_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceDeleted<Voter.Voter1, Voter.Voter1>(incUtil, (Voter.Voter1) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter1_link_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CREATE__CORR__v2g2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2Group>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getOldValue(), "Voter2Group__Marker_CREATE__CORR__v2g2_Voter2Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv2_Voter2GroupVoter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter.Voter1>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter.VoterPackage.eINSTANCE.getContainer_Voters(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter.Container, Voter.Voter1>(incUtil, (Voter.Container) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Container_voters_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__FWD_21_localSearch").tell(new ReferenceDeleted<Voter.Container, Voter.Voter1>(incUtil, (Voter.Container) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Container_voters_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getOldValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__BWD_8_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getOldValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getOldValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__FWD_21_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer, Voter.Container>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer) notification.getNotifier(), (Voter.Container) notification.getOldValue(), "Container2GroupVotersContainer_source_Container"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__SRC__c(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer__Marker, Voter.Container>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer__Marker) notification.getNotifier(), (Voter.Container) notification.getOldValue(), "Container2GroupVotersContainer__Marker_CREATE__SRC__c_Container"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__TRG__gV2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__TRG__gV2_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CREATE__CORR__v2gv(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getOldValue(), "Voter2GroupVoter__Marker_CREATE__CORR__v2gv_Voter2GroupVoter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CONTEXT__TRG__gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter__Marker, GroupVoters.GroupVotersContainer>(incUtil, (Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getOldValue(), "Voter2GroupVoter__Marker_CONTEXT__TRG__gvc_GroupVotersContainer"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__CORR__v2gv(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__CORR__v2gv_Voter2GroupVoter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer__Marker, GroupVoters.GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer__Marker) notification.getNotifier(), (GroupVoters.GroupVotersContainer) notification.getOldValue(), "Container2GroupVotersContainer__Marker_CREATE__TRG__gvc_GroupVotersContainer"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__CONSISTENCY_2_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Container2GroupVotersContainer__Marker, Voter2GroupVoters.Container2GroupVotersContainer>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer__Marker) notification.getNotifier(), (Voter2GroupVoters.Container2GroupVotersContainer) notification.getOldValue(), "Container2GroupVotersContainer__Marker_CREATE__CORR__c2gvc_Container2GroupVotersContainer"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV2_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2Group>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g2_Voter2Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv_Voter2GroupVoter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v2(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter.Voter1>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v2_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CREATE__TRG__group(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, GroupVoters.Group>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CREATE__TRG__group_Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CONTEXT__CORR__c2gvc(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter2GroupVoters.Container2GroupVotersContainer>(incUtil, (Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter2GroupVoters.Container2GroupVotersContainer) notification.getOldValue(), "Voter2GroupVoter__Marker_CONTEXT__CORR__c2gvc_Container2GroupVotersContainer"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__CORR__v2gv2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2GroupVoter) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__CORR__v2gv2_Voter2GroupVoter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__SRC__v2(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__SRC__v2_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, GroupVoters.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (GroupVoters.Voter1) notification.getOldValue(), "Voter2GroupVoter_target_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group_source_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__CORR__v2g1(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, Voter2GroupVoters.Voter2Group>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__CORR__v2g1_Voter2Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__TRG__group(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__TRG__group_Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__FWD_74_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2GroupVoter_source_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1_Member(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__BWD_55_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<GroupVoters.Voter1, GroupVoters.Group>(incUtil, (GroupVoters.Voter1) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter1_member_Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g1(), notification -> {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker, Voter2GroupVoters.Voter2Group>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) notification.getNotifier(), (Voter2GroupVoters.Voter2Group) notification.getOldValue(), "VoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g1_Voter2Group"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2GroupVoter__Marker_CONTEXT__SRC__c(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__CONSISTENCY_13_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2GroupVoter__Marker, Voter.Container>(incUtil, (Voter2GroupVoters.Voter2GroupVoter__Marker) notification.getNotifier(), (Voter.Container) notification.getOldValue(), "Voter2GroupVoter__Marker_CONTEXT__SRC__c_Container"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group__Marker_CONTEXT__SRC__v(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group__Marker, Voter.Voter1>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) notification.getNotifier(), (Voter.Voter1) notification.getOldValue(), "Voter2Group__Marker_CONTEXT__SRC__v_Voter1"), getSelf());
		});
		feature2removeEdgeConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getVoter2Group_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("Voter2Group__BWD_26_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__CONSISTENCY_35_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("Voter2Group__FWD_46_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group_target_Group"), getSelf());
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Voter2GroupVoters.Voter2Group, GroupVoters.Group>(incUtil, (Voter2GroupVoters.Voter2Group) notification.getNotifier(), (GroupVoters.Group) notification.getOldValue(), "Voter2Group_target_Group"), getSelf());
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
		if (node instanceof Voter2GroupVoters.Container2GroupVotersContainer__Marker) {
			incUtil.newMessage();
			name2actor.get("Container2GroupVotersContainer__Marker_object").tell(new ObjectDeleted<Voter2GroupVoters.Container2GroupVotersContainer__Marker>(incUtil, (Voter2GroupVoters.Container2GroupVotersContainer__Marker) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.Voter2GroupVoter__Marker) {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter__Marker_object").tell(new ObjectDeleted<Voter2GroupVoters.Voter2GroupVoter__Marker>(incUtil, (Voter2GroupVoters.Voter2GroupVoter__Marker) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.Voter2Group) {
			incUtil.newMessage();
			name2actor.get("Voter2Group_object").tell(new ObjectDeleted<Voter2GroupVoters.Voter2Group>(incUtil, (Voter2GroupVoters.Voter2Group) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.Voter2Group__Marker) {
			incUtil.newMessage();
			name2actor.get("Voter2Group__Marker_object").tell(new ObjectDeleted<Voter2GroupVoters.Voter2Group__Marker>(incUtil, (Voter2GroupVoters.Voter2Group__Marker) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) {
			incUtil.newMessage();
			name2actor.get("VoterRelation2VoterGroupRelation__Marker_object").tell(new ObjectDeleted<Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker>(incUtil, (Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.Voter2GroupVoter) {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter_object_SP0").tell(new ObjectDeleted<Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) node), getSelf());
		}
		if (node instanceof Voter2GroupVoters.Voter2GroupVoter) {
			incUtil.newMessage();
			name2actor.get("Voter2GroupVoter_object_SP1").tell(new ObjectDeleted<Voter2GroupVoters.Voter2GroupVoter>(incUtil, (Voter2GroupVoters.Voter2GroupVoter) node), getSelf());
		}
		if (node instanceof Voter.Container) {
			incUtil.newMessage();
			name2actor.get("Container_object_SP0").tell(new ObjectDeleted<Voter.Container>(incUtil, (Voter.Container) node), getSelf());
		}
		if (node instanceof Voter.Container) {
			incUtil.newMessage();
			name2actor.get("Container_object_SP1").tell(new ObjectDeleted<Voter.Container>(incUtil, (Voter.Container) node), getSelf());
		}
		if (node instanceof Voter.Voter1) {
			incUtil.newMessage();
			name2actor.get("Voter1_1_object_SP0").tell(new ObjectDeleted<Voter.Voter1>(incUtil, (Voter.Voter1) node), getSelf());
		}
		if (node instanceof Voter.Voter1) {
			incUtil.newMessage();
			name2actor.get("Voter1_1_object_SP1").tell(new ObjectDeleted<Voter.Voter1>(incUtil, (Voter.Voter1) node), getSelf());
		}
		if (node instanceof GroupVoters.GroupVotersContainer) {
			incUtil.newMessage();
			name2actor.get("GroupVotersContainer_object_SP0").tell(new ObjectDeleted<GroupVoters.GroupVotersContainer>(incUtil, (GroupVoters.GroupVotersContainer) node), getSelf());
		}
		if (node instanceof GroupVoters.GroupVotersContainer) {
			incUtil.newMessage();
			name2actor.get("GroupVotersContainer_object_SP1").tell(new ObjectDeleted<GroupVoters.GroupVotersContainer>(incUtil, (GroupVoters.GroupVotersContainer) node), getSelf());
		}
		if (node instanceof GroupVoters.Voter1) {
			incUtil.newMessage();
			name2actor.get("Voter1_object_SP0").tell(new ObjectDeleted<GroupVoters.Voter1>(incUtil, (GroupVoters.Voter1) node), getSelf());
		}
		if (node instanceof GroupVoters.Voter1) {
			incUtil.newMessage();
			name2actor.get("Voter1_object_SP1").tell(new ObjectDeleted<GroupVoters.Voter1>(incUtil, (GroupVoters.Voter1) node), getSelf());
		}
		if (node instanceof GroupVoters.Group) {
			incUtil.newMessage();
			name2actor.get("Group_object_SP0").tell(new ObjectDeleted<GroupVoters.Group>(incUtil, (GroupVoters.Group) node), getSelf());
		}
		if (node instanceof GroupVoters.Group) {
			incUtil.newMessage();
			name2actor.get("Group_object_SP1").tell(new ObjectDeleted<GroupVoters.Group>(incUtil, (GroupVoters.Group) node), getSelf());
		}
	}
}

