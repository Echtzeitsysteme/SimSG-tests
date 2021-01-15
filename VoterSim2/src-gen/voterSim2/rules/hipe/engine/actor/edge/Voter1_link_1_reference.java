package voterSim2.rules.hipe.engine.actor.edge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import hipe.engine.util.HiPESet;
import hipe.engine.actor.Port;
import hipe.engine.match.EdgeMatch;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NewInput;
import hipe.engine.actor.edge.PortEdge;
import hipe.engine.actor.edge.PortEdgeLeft;
import hipe.engine.actor.edge.PortEdgeRight;

import hipe.network.ReferenceNode;

import hipe.generic.actor.GenericReferenceActor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

public class Voter1_link_1_reference extends GenericReferenceActor<Voter.Voter1,Voter.Voter1> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeRight(node.getPorts().getPort().get(0), getSelf(), name2actor.get("agreeFalse_1_junction"), this::check_constraint_4 , 0   ));
	}	

	public boolean check_constraint_4(EdgeMatch edge, int index) {
		Voter.Voter1 v2 = (Voter.Voter1) edge.source();
		Voter.Voter1 v1 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()==v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

