package Voter2GroupVoters.modelgen.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.util.HiPEMultiUtil;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.JunctionNode;

public class Voter2Group__GEN_5_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_1);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Voter2Group__GEN_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_1(HMatch match, int index) {
		Voter.Voter1 v = (Voter.Voter1) match.getNodes()[4];
		GroupVoters.Voter1 gV = (GroupVoters.Voter1) match.getNodes()[6];
		Voter2GroupVoters.Voter2GroupVoter v2gv = (Voter2GroupVoters.Voter2GroupVoter) match.getNodes()[5];
		GroupVoters.Voter1 gV2 = (GroupVoters.Voter1) match.getNodes()[2];
		Voter.Voter1 v2 = (Voter.Voter1) match.getNodes()[1];
		Voter2GroupVoters.Voter2GroupVoter v2gv2 = (Voter2GroupVoters.Voter2GroupVoter) match.getNodes()[0];
		boolean predicate = !v.equals(v2) && !gV.equals(gV2) && !v2gv.equals(v2gv2);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

