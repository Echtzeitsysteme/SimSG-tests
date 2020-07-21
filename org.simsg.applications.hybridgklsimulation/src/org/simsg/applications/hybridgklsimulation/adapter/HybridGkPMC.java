package org.simsg.applications.hybridgklsimulation.adapter;

import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.pmc.IBeXPMC;

public class HybridGkPMC extends IBeXPMC {
	
	@Override
	public void collectMatches(String patternName) {
		engine.updateMatches(patternName);
		if(HybridRuleUtils.RULES.contains(patternName)) {
			matchCount.replace(patternName, HybridRuleUtils.MATCH_COUNTER.get(patternName).apply(engine));
		}else {
			matchCount.replace(patternName, engine.getMatchCount(patternName));
		}
	}
	
	@Override
	public void collectAllMatches() {
		engine.updateAllMatches();
		patternNames.parallelStream().forEach(patternName -> {
			if(HybridRuleUtils.RULES.contains(patternName)) {
				matchCount.replace(patternName, HybridRuleUtils.MATCH_COUNTER.get(patternName).apply(engine));
			}else {
				matchCount.replace(patternName, engine.getMatchCount(patternName));
			}
		});
	}
	
	@Override
	public SimSGMatch getRandomMatch(String patternName) {
		if(HybridRuleUtils.RULES.contains(patternName)) {
			return HybridRuleUtils.MATCH_CONSTRUCTORS.get(patternName).apply(engine);
		} else {
			return super.getRandomMatch(patternName);
		}
	}
	
}
