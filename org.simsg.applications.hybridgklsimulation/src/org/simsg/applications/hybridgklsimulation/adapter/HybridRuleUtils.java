package org.simsg.applications.hybridgklsimulation.adapter;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import org.emoflon.ibex.common.operational.SimpleMatch;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.matches.KtXfwdMatch;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.matches.KtYfwdMatch;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.matches.PtXfwdMatch;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.matches.PtYfwdMatch;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.rules.KtXfwdRule;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.rules.KtYfwdRule;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.rules.PtXfwdRule;
import org.simsg.applications.hybridgklsimulation.hybridgkl.api.rules.PtYfwdRule;
import org.simsg.core.pm.engine.PatternMatchingEngine;
import org.simsg.core.pm.ibex.IBeXEngine;
import org.simsg.core.pm.ibex.IBeXMatch;
import org.simsg.core.pm.match.SimSGMatch;

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
	public final static Map<String, Function<PatternMatchingEngine, SimSGMatch>> MATCH_CONSTRUCTORS = getMatchConstructors();
	public final static Map<String, Function<PatternMatchingEngine, Integer>> MATCH_COUNTER = getMatchCounters();
	public final static Map<String, Consumer<SimSGMatch>> RULE_APPLICATORS = getRuleApplicators();
	
	public final static Map<String, Set<Object>> LEFT_SETS = getSet();
	public final static Map<String, Set<Object>> RIGHT_SETS = getSet();
	public final static Map<String, Set<Object>> CONFLICT_SETS = getSet();
	
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
	
	private static Map<String, Function<PatternMatchingEngine, SimSGMatch>> getMatchConstructors() {
		Map<String, Function<PatternMatchingEngine, SimSGMatch>> map = new LinkedHashMap<>();
		map.put(KTX_FWD, HybridRuleUtils::constructKTX_FWD_LHS);
		map.put(KTY_FWD, HybridRuleUtils::constructKTY_FWD_LHS);
		map.put(PTX_FWD, HybridRuleUtils::constructPTX_FWD_LHS);
		map.put(PTY_FWD, HybridRuleUtils::constructPTY_FWD_LHS);
		return map;
	}
	
	private static Map<String, Function<PatternMatchingEngine, Integer>> getMatchCounters() {
		Map<String, Function<PatternMatchingEngine, Integer>> map = new LinkedHashMap<>();
		map.put(KTX_FWD, HybridRuleUtils::countKTX_FWD_LHS);
		map.put(KTY_FWD, HybridRuleUtils::countKTY_FWD_LHS);
		map.put(PTX_FWD, HybridRuleUtils::countPTX_FWD_LHS);
		map.put(PTY_FWD, HybridRuleUtils::countPTY_FWD_LHS);
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
	
	private static Map<String, Set<Object>> getSet() {
		Map<String, Set<Object>> map = new LinkedHashMap<>();
		map.put(KTX_FWD, new HashSet<Object>());
		map.put(KTY_FWD, new HashSet<Object>());
		map.put(PTX_FWD, new HashSet<Object>());
		map.put(PTY_FWD, new HashSet<Object>());
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public static int countKTX_FWD_LHS(PatternMatchingEngine engine) {
		int kFree = engine.getMatchCount(K_FREE);
		int txFree = engine.getMatchCount(TX_FREE);
		
		if(kFree < 1)
			return 0;
		if(txFree < 1)
			return 0;
		
		return kFree*txFree;
	}
	
	public static int countKTY_FWD_LHS(PatternMatchingEngine engine) {	
		int kFree = engine.getMatchCount(K_FREE);
		int tyFree = engine.getMatchCount(TY_FREE);
		
		if(kFree<1)
			return 0;
		if(tyFree<1)
			return 0;
		
		return kFree*tyFree;
	}
	
	public static int countPTX_FWD_LHS(PatternMatchingEngine engine) {
		int pFree = engine.getMatchCount(P_FREE);
		int txFree = engine.getMatchCount(TX_FREE);
		
		if(pFree<1)
			return 0;
		if(txFree<1)
			return 0;
		
		return pFree*txFree;
	}
	
	public static int countPTY_FWD_LHS(PatternMatchingEngine engine) {
		int pFree = engine.getMatchCount(P_FREE);
		int tyFree = engine.getMatchCount(TY_FREE);
		
		if(pFree<1)
			return 0;
		if(tyFree<1)
			return 0;
		
		return pFree*tyFree;
	}
	
	public static SimSGMatch constructKTX_FWD_LHS(PatternMatchingEngine engine) {		
		GraphTransformationAPI api = ((IBeXEngine)engine).getApi();
		
		SimpleMatch match = new SimpleMatch(KTX_FWD);
		match.put(K_PARAM, engine.getRandomMatch(K_FREE).get(K_PARAM));
		match.put(T_PARAM, engine.getRandomMatch(TX_FREE).get(T_PARAM));
		GraphTransformationMatch<KtXfwdMatch, KtXfwdRule> gtMatch = null;
		try {
			gtMatch = new KtXfwdMatch((KtXfwdRule) api.getPattern(KTX_FWD), match);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		
		return sgtMatch;
	}
	
	public static SimSGMatch constructKTY_FWD_LHS(PatternMatchingEngine engine) {		
		GraphTransformationAPI api = ((IBeXEngine)engine).getApi();
		
		SimpleMatch match = new SimpleMatch(KTY_FWD);
		match.put(K_PARAM, engine.getRandomMatch(K_FREE).get(K_PARAM));
		match.put(T_PARAM, engine.getRandomMatch(TY_FREE).get(T_PARAM));
		GraphTransformationMatch<KtYfwdMatch, KtYfwdRule> gtMatch = null;
		try {
			gtMatch = new KtYfwdMatch((KtYfwdRule) api.getPattern(KTY_FWD), match);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		
		return sgtMatch;
	}
	
	public static SimSGMatch constructPTX_FWD_LHS(PatternMatchingEngine engine) {		
		GraphTransformationAPI api = ((IBeXEngine)engine).getApi();
		
		SimpleMatch match = new SimpleMatch(PTX_FWD);
		match.put(P_PARAM, engine.getRandomMatch(P_FREE).get(P_PARAM));
		match.put(T_PARAM, engine.getRandomMatch(TX_FREE).get(T_PARAM));
		GraphTransformationMatch<PtXfwdMatch, PtXfwdRule> gtMatch = null;
		try {
			gtMatch = new PtXfwdMatch((PtXfwdRule) api.getPattern(PTX_FWD), match);
		} catch (Exception e) {
			return null;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);
		
		return sgtMatch;
	}
	
	public static SimSGMatch constructPTY_FWD_LHS(PatternMatchingEngine engine) {
		GraphTransformationAPI api = ((IBeXEngine)engine).getApi();
		
		SimpleMatch match = new SimpleMatch(PTY_FWD);
		match.put(P_PARAM, engine.getRandomMatch(P_FREE).get(P_PARAM));
		match.put(T_PARAM, engine.getRandomMatch(TY_FREE).get(T_PARAM));
		GraphTransformationMatch<PtYfwdMatch, PtYfwdRule> gtMatch = null;
		try {
			gtMatch = new PtYfwdMatch((PtYfwdRule) api.getPattern(PTY_FWD), match);
		} catch (Exception e) {
			return null;
		}
		
		SimSGMatch sgtMatch = new IBeXMatch(gtMatch);	
		return sgtMatch;
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
