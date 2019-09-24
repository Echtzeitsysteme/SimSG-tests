package org.simsg.adapter;

import org.simsg.core.pmc.IBeXPMC;

public class HybridGkPMC extends IBeXPMC {
	
	@Override
	public void collectMatches(String patternName) {
		engine.updateMatches(patternName);
		if(HybridRuleUtils.RULES.contains(patternName)) {
			int count = HybridRuleUtils.MATCH_CONSTRUCTORS.get(patternName).apply(engine, matches);
			matchCount.replace(patternName, count);
		}else {
			matches.replace(patternName, engine.getMatches(patternName));
			matchCount.replace(patternName, matches.get(patternName).size());
		}
	}

	@Override
	public void collectAllMatches() {
		engine.updateAllMatches();
		for(String pattern : engine.getAllMatches().keySet()) {
			this.collectMatches(pattern);
		}
	}
	
}
