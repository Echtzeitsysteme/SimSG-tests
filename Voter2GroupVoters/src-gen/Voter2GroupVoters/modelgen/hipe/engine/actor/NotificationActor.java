package Voter2GroupVoters.modelgen.hipe.engine.actor;

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
	}
}

