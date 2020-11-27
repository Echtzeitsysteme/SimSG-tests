package voterSim.rules.hipe.engine.actor.edge;

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

public class Voter1_link_0_reference extends GenericReferenceActor<Voter.Voter1,Voter.Voter1> {

	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ReferenceNode node) {
		ports = new LinkedList<>();
		ports.add(new PortEdgeLeft(node.getPorts().getPort().get(0), getSelf(), name2actor.get("agreeFalse_1_junction"), this::check_constraint_1 , 0   ));
		ports.add(new PortEdgeRight(node.getPorts().getPort().get(1), getSelf(), name2actor.get("agreeFalse_1_junction"), this::check_constraint_2 , 1   ));
		ports.add(new PortEdgeLeft(node.getPorts().getPort().get(2), getSelf(), name2actor.get("agreeTrue_6_junction"), this::check_constraint_3 , 2   ));
		ports.add(new PortEdgeRight(node.getPorts().getPort().get(3), getSelf(), name2actor.get("agreeTrue_6_junction"), this::check_constraint_4 , 3   ));
		ports.add(new PortEdgeLeft(node.getPorts().getPort().get(4), getSelf(), name2actor.get("connectedV1V3_11_junction"), this::check_constraint_5 , 4   ));
		ports.add(new PortEdgeRight(node.getPorts().getPort().get(5), getSelf(), name2actor.get("connectedV1V3_11_junction"), this::check_constraint_6 , 5   ));
		ports.add(new PortEdgeLeft(node.getPorts().getPort().get(6), getSelf(), name2actor.get("convert_16_junction"), this::check_constraint_7 , 6   ));
		ports.add(new PortEdgeRight(node.getPorts().getPort().get(7), getSelf(), name2actor.get("convert_16_junction"), this::check_constraint_8 , 7   ));
		ports.add(new PortEdgeLeft(node.getPorts().getPort().get(8), getSelf(), name2actor.get("disagree_21_junction"), this::check_constraint_9 , 8   ));
		ports.add(new PortEdgeRight(node.getPorts().getPort().get(9), getSelf(), name2actor.get("disagree_21_junction"), this::check_constraint_10 , 9   ));
		ports.add(new PortEdgeLeft(node.getPorts().getPort().get(10), getSelf(), name2actor.get("switchRandom_39_junction"), this::check_constraint_15 , 10   ));
		ports.add(new PortEdgeRight(node.getPorts().getPort().get(11), getSelf(), name2actor.get("switchRandom_39_junction"), this::check_constraint_16 , 11   ));
	}	

	public boolean check_constraint_1(EdgeMatch edge, int index) {
		Voter.Voter1 v1 = (Voter.Voter1) edge.source();
		Voter.Voter1 v2 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()==v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_2(EdgeMatch edge, int index) {
		Voter.Voter1 v2 = (Voter.Voter1) edge.source();
		Voter.Voter1 v1 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()==v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_3(EdgeMatch edge, int index) {
		Voter.Voter1 v1 = (Voter.Voter1) edge.source();
		Voter.Voter1 v2 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()==v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_4(EdgeMatch edge, int index) {
		Voter.Voter1 v2 = (Voter.Voter1) edge.source();
		Voter.Voter1 v1 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()==v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_5(EdgeMatch edge, int index) {
		Voter.Voter1 v1 = (Voter.Voter1) edge.source();
		Voter.Voter1 v3 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v3);
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_6(EdgeMatch edge, int index) {
		Voter.Voter1 v3 = (Voter.Voter1) edge.source();
		Voter.Voter1 v1 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v3);
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_7(EdgeMatch edge, int index) {
		Voter.Voter1 v1 = (Voter.Voter1) edge.source();
		Voter.Voter1 v2 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()!=v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_8(EdgeMatch edge, int index) {
		Voter.Voter1 v2 = (Voter.Voter1) edge.source();
		Voter.Voter1 v1 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()!=v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_9(EdgeMatch edge, int index) {
		Voter.Voter1 v1 = (Voter.Voter1) edge.source();
		Voter.Voter1 v2 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()!=v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_10(EdgeMatch edge, int index) {
		Voter.Voter1 v2 = (Voter.Voter1) edge.source();
		Voter.Voter1 v1 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()!=v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_15(EdgeMatch edge, int index) {
		Voter.Voter1 v1 = (Voter.Voter1) edge.source();
		Voter.Voter1 v2 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()!=v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
	public boolean check_constraint_16(EdgeMatch edge, int index) {
		Voter.Voter1 v2 = (Voter.Voter1) edge.source();
		Voter.Voter1 v1 = (Voter.Voter1) edge.target();
		boolean predicate = !v1.equals(v2) && v1.isVote()!=v2.isVote();
		edge.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

