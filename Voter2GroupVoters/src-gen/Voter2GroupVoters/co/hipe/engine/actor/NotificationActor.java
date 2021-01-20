package Voter2GroupVoters.co.hipe.engine.actor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;

import akka.actor.ActorRef;

import hipe.engine.actor.GenericNotificationActor;
import hipe.engine.util.IncUtil;

public class NotificationActor extends GenericNotificationActor {
	
	public NotificationActor(ActorRef dispatchActor, IncUtil incUtil) {
		super(dispatchActor, incUtil);
	}
	
	@Override
	protected void initializeExploration() {
		explorationConsumer.put(Voter.VoterPackage.eINSTANCE.getVoter1(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			GroupVoters.GroupVotersContainer _groupvoterscontainer = (GroupVoters.GroupVotersContainer) obj;
			children.addAll(_groupvoterscontainer.getVoter());
			children.addAll(_groupvoterscontainer.getGroup());
			return children;
		});
		explorationConsumer.put(Voter.VoterPackage.eINSTANCE.getContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			Voter.Container _container = (Voter.Container) obj;
			children.addAll(_container.getVoters());
			return children;
		});
		explorationConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getProtocol(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.Protocol _protocol = (runtime.Protocol) obj;
			children.addAll(_protocol.getSteps());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTGGRuleApplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroup(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTempContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.TempContainer _tempcontainer = (runtime.TempContainer) obj;
			children.addAll(_tempcontainer.getObjects());
			return children;
		});
		explorationConsumer.put(Voter2GroupVoters.Voter2GroupVotersPackage.eINSTANCE.getContainer2GroupVotersContainer__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

