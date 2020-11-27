package voterSim.rules.hipe.engine.actor.node;

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
		
public class Voter1_object_SP0 extends GenericObjectActor<Voter.Voter1> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeLeft<Voter.Voter1>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Voter1_link_0_reference"), this::returnTrue   ));
		ports.add(new PortNodeMatchRight<Voter.Voter1>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("newVoterFalse_23_junction"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatchRight<Voter.Voter1>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("newVoterTrue_28_junction"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<Voter.Voter1>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("voteFalse_production"), this::check_constraint_16 , 0   , node.getName() ));
	}
	
	public boolean check_constraint_16(Voter.Voter1 v, int index) {
		return v.isVote()==false;
	}
	
}


