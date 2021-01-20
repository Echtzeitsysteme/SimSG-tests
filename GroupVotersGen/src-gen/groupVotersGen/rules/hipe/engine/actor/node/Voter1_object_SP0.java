package groupVotersGen.rules.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.network.ObjectNode;

import hipe.generic.actor.GenericObjectActor;

import hipe.generic.actor.junction.util.HiPEConfig;
		
public class Voter1_object_SP0 extends GenericObjectActor<GroupVoters.Voter1> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeLeft<GroupVoters.Voter1>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Voter1_member_0_reference"), this::check_constraint_1 , 0   ));
		ports.add(new PortNodeLeft<GroupVoters.Voter1>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("Voter1_member_3_reference"), this::returnTrue   ));
		ports.add(new PortNodeMatchLeft<GroupVoters.Voter1>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("newMembership_31_junction"), this::returnTrue   , node.getName() ));
	}
	
	public boolean check_constraint_1(GroupVoters.Voter1 v1, int index) {
		return v1.isVote()==false;
	}
	
}


