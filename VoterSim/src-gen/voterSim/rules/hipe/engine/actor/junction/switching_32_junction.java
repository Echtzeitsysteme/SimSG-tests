package voterSim.rules.hipe.engine.actor.junction;

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

public class switching_32_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> voter1AttrMap = HiPEMultiUtil.createMap();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_15);
		
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(node.getPorts().getPort().get(0), getSelf(), name2actor.get("switching_31_nacjunction"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> voter1_0_Matches = voter1AttrMap.get(matchObjects[0]);
		if(voter1_0_Matches == null) {
			voter1_0_Matches = new LinkedList<>();
			voter1AttrMap.put(matchObjects[0], voter1_0_Matches);
		}
		
		voter1_0_Matches.add(match);
		
		Collection<HMatch> voter1_1_Matches = voter1AttrMap.get(matchObjects[1]);
		if(voter1_1_Matches == null) {
			voter1_1_Matches = new LinkedList<>();
			voter1AttrMap.put(matchObjects[1], voter1_1_Matches);
		}
		
		voter1_1_Matches.add(match);
		
		Collection<HMatch> voter1_2_Matches = voter1AttrMap.get(matchObjects[2]);
		if(voter1_2_Matches == null) {
			voter1_2_Matches = new LinkedList<>();
			voter1AttrMap.put(matchObjects[2], voter1_2_Matches);
		}
		
		voter1_2_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = voter1AttrMap.get(matchObjects[0]);
		if(matches_0 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_1 = voter1AttrMap.get(matchObjects[1]);
		if(matches_1 != null) {
			matches.remove(match);
		}
		Collection<HMatch> matches_2 = voter1AttrMap.get(matchObjects[2]);
		if(matches_2 != null) {
			matches.remove(match);
		}
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof Voter.Voter1) {
			if(voter1AttrMap.containsKey(obj)) {
				for(HMatch attr_match : voter1AttrMap.get(obj)) {
					for(int i=0; i<ports.size(); i++) {
						Port<HMatch> port = ports.get(i);
						HMatch match = attr_match;
												
						if(match.isConstraintSatisfied(i)) {
							if(!constraints.get(i).apply(match, i))
								port.sendRemove(message.initialMessage, match);
						}
						else {
							if(constraints.get(i).apply(match, i))
								port.sendAdd(message.initialMessage, match);
						}
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_15(HMatch match, int index) {
		Voter.Voter1 v2 = (Voter.Voter1) match.getNodes()[2];
		Voter.Voter1 v3 = (Voter.Voter1) match.getNodes()[0];
		Voter.Voter1 v1 = (Voter.Voter1) match.getNodes()[1];
		boolean predicate = !v1.equals(v3) && !v2.equals(v3) && v1.isVote()==v3.isVote();
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

