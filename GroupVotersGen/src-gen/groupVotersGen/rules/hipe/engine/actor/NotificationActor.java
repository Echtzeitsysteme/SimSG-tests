package groupVotersGen.rules.hipe.engine.actor;

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
		explorationConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroupVotersContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			GroupVoters.GroupVotersContainer _groupvoterscontainer = (GroupVoters.GroupVotersContainer) obj;
			children.addAll(_groupvoterscontainer.getVoter());
			children.addAll(_groupvoterscontainer.getGroup());
			return children;
		});
		explorationConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getVoter1(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(GroupVoters.GroupVotersPackage.eINSTANCE.getGroup(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

