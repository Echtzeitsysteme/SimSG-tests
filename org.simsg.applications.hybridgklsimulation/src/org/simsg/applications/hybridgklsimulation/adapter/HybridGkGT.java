package org.simsg.applications.hybridgklsimulation.adapter;

import org.simsg.core.gt.IBeXGT;
import org.simsg.core.pm.match.SimSGMatch;

public class HybridGkGT extends IBeXGT {

	@Override
	protected void applyRule(SimSGMatch match) {
		if(HybridRuleUtils.RULES.contains(match.getPatternName())) {
			HybridRuleUtils.RULE_APPLICATORS.get(match.getPatternName()).accept(match);
		}else {
			rules.get(match.getPatternName()).applyGeneric(match.asGtMatch());
		}
	}
	
}
