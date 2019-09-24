package org.simsg.adapter;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import org.emoflon.ibex.common.operational.SimpleMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.simsg.applications.hybridgksimulation.api.HybridgksimulationAPI;
import org.simsg.applications.hybridgksimulation.api.matches.KFreeMatch;
import org.simsg.applications.hybridgksimulation.api.matches.KtXfwdMatch;
import org.simsg.applications.hybridgksimulation.api.matches.KtYfwdMatch;
import org.simsg.applications.hybridgksimulation.api.matches.PtXfwdMatch;
import org.simsg.applications.hybridgksimulation.api.matches.PtYfwdMatch;
import org.simsg.applications.hybridgksimulation.api.matches.TxFreeMatch;
import org.simsg.applications.hybridgksimulation.api.rules.KtXfwdRule;
import org.simsg.applications.hybridgksimulation.api.rules.KtYfwdRule;
import org.simsg.applications.hybridgksimulation.api.rules.PtXfwdRule;
import org.simsg.applications.hybridgksimulation.api.rules.PtYfwdRule;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.ibex.IBeXMatch;
import org.simsg.core.pm.match.SimSGMatch;
import org.simsg.core.utils.IBeXApiWrapper;

import GoldbeterKoshland.K;
import GoldbeterKoshland.P;
import GoldbeterKoshland.T;

public final class HybridRuleUtils {
	
	public final static String KTX_FWD = "ktXfwd";
	public final static String KTY_FWD = "ktYfwd";
	public final static String PTX_FWD = "ptXfwd";
	public final static String PTY_FWD = "ptYfwd";
	
	public final static String K_FREE = "kFree";
	public final static String TX_FREE = "txFree";
	public final static String P_FREE = "pFree";
	public final static String TY_FREE = "tyFree";
	
	public final static String K_PARAM = "k";
	public final static String T_PARAM = "t";
	public final static String P_PARAM = "p";
	
	public final static Set<String> RULES = getRules();
	public final static Map<String, BiFunction<PatternMatchingEngine, Map<String, Collection<SimSGMatch>>, Integer>> MATCH_CONSTRUCTORS = getMatchConstructors();
	public final static Map<String, Consumer<SimSGMatch>> RULE_APPLICATORS = getRuleApplicators();
	
	public final static String ENGINE_TYPE_HIPE = "IBeXHiPEEngine";
	public final static String ENGINE_TYPE_DEMOCLES = "IBeXDemoclesEngine"; 

	private HybridRuleUtils() {};
	
	private static Set<String> getRules() {
		Set<String> set = new LinkedHashSet<>();
		set.add(KTX_FWD);
		set.add(KTY_FWD);
		set.add(PTX_FWD);
		set.add(PTY_FWD);
		return set;
	}
	
	private static Map<String, BiFunction<PatternMatchingEngine, Map<String, Collection<SimSGMatch>>, Integer>> getMatchConstructors() {
		Map<String, BiFunction<PatternMatchingEngine, Map<String, Collection<SimSGMatch>>, Integer>> map = new LinkedHashMap<>();
		map.put(KTX_FWD, HybridRuleUtils::constructKTX_FWD_LHS);
		map.put(KTY_FWD, HybridRuleUtils::constructKTY_FWD_LHS);
		map.put(PTX_FWD, HybridRuleUtils::constructPTX_FWD_LHS);
		map.put(PTY_FWD, HybridRuleUtils::constructPTY_FWD_LHS);
		return map;
	}
	
	private static Map<String, Consumer<SimSGMatch>> getRuleApplicators() {
		Map<String, Consumer<SimSGMatch>> map = new LinkedHashMap<>();
		map.put(KTX_FWD, HybridRuleUtils::applyRuleKTX_FWD);
		map.put(KTY_FWD, HybridRuleUtils::applyRuleKTY_FWD);
		map.put(PTX_FWD, HybridRuleUtils::applyRulePTX_FWD);
		map.put(PTY_FWD, HybridRuleUtils::applyRulePTY_FWD);
		return map;
	}
	
	public static int countKTX_FWD_LHS(PatternMatchingEngine engine) {
//		engine.updateMatches(K_FREE);
//		engine.updateMatches(TX_FREE);
		
		Collection<SimSGMatch> kFree = engine.getMatchesAndUpdate(K_FREE);
		Collection<SimSGMatch> txFree = engine.getMatchesAndUpdate(TX_FREE);
		
		if(kFree.isEmpty())
			return 0;
		if(txFree.isEmpty())
			return 0;
		
		return kFree.size()*txFree.size();
	}
	
	public static int countKTX_FWD_LHS(HybridgksimulationAPI api) {
		
		Collection<KFreeMatch> kFree = api.kFree().findMatches();
		Collection<TxFreeMatch> txFree = api.txFree().findMatches();
		
		if(kFree.isEmpty())
			return 0;
		if(txFree.isEmpty())
			return 0;
		
		return kFree.size()*txFree.size();
	}
	
	public static int constructKTX_FWD_LHS(PatternMatchingEngine engine,  Map<String, Collection<SimSGMatch>> matches) {
		int size = countKTX_FWD_LHS(engine);
		Collection<SimSGMatch> constructed = new LinkedList<>();
		if(size <= 0) {
			matches.replace(KTX_FWD, constructed);
			return size;
		}
		
		IBeXApiWrapper api = IBeXApiWrapper.getInstance();
		
		SimpleMatch match = new SimpleMatch(KTX_FWD);
		match.put(K_PARAM, engine.getMatches(K_FREE).iterator().next().get(K_PARAM));
		match.put(T_PARAM, engine.getMatches(TX_FREE).iterator().next().get(T_PARAM));
		GraphTransformationMatch<KtXfwdMatch, KtXfwdRule> gtMatch = null;
		try {
			gtMatch = new KtXfwdMatch((KtXfwdRule) api.getRules().get(KTX_FWD), match);
		} catch (Exception e) {
			e.printStackTrace();
			matches.replace(KTX_FWD, constructed);
			return 0;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		constructed.add(sgtMatch);
		matches.replace(KTX_FWD, constructed);
		
		return size;
	}
	
	public static SimSGMatch constructKTX_FWD_LHS(HybridgksimulationAPI api) {
		int size = countKTX_FWD_LHS(api);
		Collection<SimSGMatch> constructed = new LinkedList<>();
		if(size <= 0) {
			return null;
		}
		
		SimpleMatch match = new SimpleMatch(KTX_FWD);
		match.put(K_PARAM, api.kFree().findAnyMatch().get().getK());
		match.put(T_PARAM, api.txFree().findAnyMatch().get().getT());
		GraphTransformationMatch<KtXfwdMatch, KtXfwdRule> gtMatch = null;
		try {
			gtMatch = new KtXfwdMatch(api.ktXfwd(), match);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		
		return sgtMatch;
	}
	
	public static int countKTY_FWD_LHS(PatternMatchingEngine engine) {
//		engine.updateMatches(K_FREE);
//		engine.updateMatches(TY_FREE);
		
		Collection<SimSGMatch> kFree = engine.getMatchesAndUpdate(K_FREE);
		Collection<SimSGMatch> tyFree = engine.getMatchesAndUpdate(TY_FREE);
		
		if(kFree.isEmpty())
			return 0;
		if(tyFree.isEmpty())
			return 0;
		
		return kFree.size()*tyFree.size();
	}
	
	public static int constructKTY_FWD_LHS(PatternMatchingEngine engine,  Map<String, Collection<SimSGMatch>> matches) {
		int size = countKTY_FWD_LHS(engine);
		Collection<SimSGMatch> constructed = new LinkedList<>();
		if(size <= 0) {
			matches.replace(KTY_FWD, constructed);
			return size;
		}
		
		IBeXApiWrapper api = IBeXApiWrapper.getInstance();
		
		SimpleMatch match = new SimpleMatch(KTY_FWD);
		match.put(K_PARAM, engine.getMatches(K_FREE).iterator().next().get(K_PARAM));
		match.put(T_PARAM, engine.getMatches(TY_FREE).iterator().next().get(T_PARAM));
		GraphTransformationMatch<KtYfwdMatch, KtYfwdRule> gtMatch = null;
		try {
			gtMatch = new KtYfwdMatch((KtYfwdRule) api.getRules().get(KTY_FWD), match);
		} catch (Exception e) {
			e.printStackTrace();
			matches.replace(KTY_FWD, constructed);
			return 0;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		constructed.add(sgtMatch);
		matches.replace(KTY_FWD, constructed);
		
		return size;
	}
	
	public static int countPTX_FWD_LHS(PatternMatchingEngine engine) {
//		engine.updateMatches(P_FREE);
//		engine.updateMatches(TX_FREE);
		
		Collection<SimSGMatch> pFree = engine.getMatchesAndUpdate(P_FREE);
		Collection<SimSGMatch> txFree = engine.getMatchesAndUpdate(TX_FREE);
		
		if(pFree.isEmpty())
			return 0;
		if(txFree.isEmpty())
			return 0;
		
		return pFree.size()*txFree.size();
	}
	
	public static int constructPTX_FWD_LHS(PatternMatchingEngine engine,  Map<String, Collection<SimSGMatch>> matches) {
		int size = countPTX_FWD_LHS(engine);
		Collection<SimSGMatch> constructed = new LinkedList<>();
		if(size <= 0) {
			matches.replace(PTX_FWD, constructed);
			return size;
		}
		
		IBeXApiWrapper api = IBeXApiWrapper.getInstance();
		
		SimpleMatch match = new SimpleMatch(PTX_FWD);
		match.put(P_PARAM, engine.getMatches(P_FREE).iterator().next().get(P_PARAM));
		match.put(T_PARAM, engine.getMatches(TX_FREE).iterator().next().get(T_PARAM));
		GraphTransformationMatch<PtXfwdMatch, PtXfwdRule> gtMatch = null;
		try {
			gtMatch = new PtXfwdMatch((PtXfwdRule) api.getRules().get(PTX_FWD), match);
		} catch (Exception e) {
			e.printStackTrace();
			matches.replace(PTX_FWD, constructed);
			return 0;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		constructed.add(sgtMatch);
		matches.replace(PTX_FWD, constructed);
		
		return size;
	}
	
	public static int countPTY_FWD_LHS(PatternMatchingEngine engine) {
//		engine.updateMatches(P_FREE);
//		engine.updateMatches(TY_FREE);
		
		Collection<SimSGMatch> pFree = engine.getMatchesAndUpdate(P_FREE);
		Collection<SimSGMatch> tyFree = engine.getMatchesAndUpdate(TY_FREE);
		
		if(pFree.isEmpty())
			return 0;
		if(tyFree.isEmpty())
			return 0;
		
		return pFree.size()*tyFree.size();
	}
	
	public static int constructPTY_FWD_LHS(PatternMatchingEngine engine,  Map<String, Collection<SimSGMatch>> matches) {
		int size = countPTY_FWD_LHS(engine);
		Collection<SimSGMatch> constructed = new LinkedList<>();
		if(size <= 0) {
			matches.replace(PTY_FWD, constructed);
			return size;
		}
		
		IBeXApiWrapper api = IBeXApiWrapper.getInstance();
		
		SimpleMatch match = new SimpleMatch(PTY_FWD);
		match.put(P_PARAM, engine.getMatches(P_FREE).iterator().next().get(P_PARAM));
		match.put(T_PARAM, engine.getMatches(TY_FREE).iterator().next().get(T_PARAM));
		GraphTransformationMatch<PtYfwdMatch, PtYfwdRule> gtMatch = null;
		try {
			gtMatch = new PtYfwdMatch((PtYfwdRule) api.getRules().get(PTY_FWD), match);
		} catch (Exception e) {
			e.printStackTrace();
			matches.replace(PTY_FWD, constructed);
			return 0;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		constructed.add(sgtMatch);
		matches.replace(PTY_FWD, constructed);
		
		return size;
	}

	public static void applyRuleKTX_FWD(SimSGMatch match) {
		K k = (K) match.get("k");
		T t = (T) match.get("t");
		k.setA(t);
		t.setX(k);
	}
	
	public static void applyRuleKTY_FWD(SimSGMatch match) {
		K k = (K) match.get("k");
		T t = (T) match.get("t");
		k.setA(t);
		t.setY(k);
	}
	
	public static void applyRulePTX_FWD(SimSGMatch match) {
		P p = (P) match.get("p");
		T t = (T) match.get("t");
		p.setA(t);
		t.setX(p);
	}
	
	public static void applyRulePTY_FWD(SimSGMatch match) {
		P p = (P) match.get("p");
		T t = (T) match.get("t");
		p.setA(t);
		t.setY(p);
	}
}
