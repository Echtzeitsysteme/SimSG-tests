package voterSim.rules.hipe.engine.actor;

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
		explorationConsumer.put(Voter.VoterPackage.eINSTANCE.getContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			Voter.Container _container = (Voter.Container) obj;
			children.addAll(_container.getVoters());
			return children;
		});
	}
}

