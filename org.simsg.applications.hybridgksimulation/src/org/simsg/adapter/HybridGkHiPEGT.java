package org.simsg.adapter;

import java.lang.reflect.InvocationTargetException;

import org.simsg.core.gt.IBeXHiPEGT;
import org.simsg.core.pm.match.SimSGMatch;

public class HybridGkHiPEGT extends IBeXHiPEGT {

	@Override
	protected void applyRule(SimSGMatch match) {
		try {
			if(HybridRuleUtils.RULES.contains(match.getPatternName())) {
				HybridRuleUtils.RULE_APPLICATORS.get(match.getPatternName()).accept(match);
			}else {
				ruleApplicationMethod.invoke(rules.get(match.getPatternName()), match.asGtMatch());
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
