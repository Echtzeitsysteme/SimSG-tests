package groupVotersSim.rules.api.matches;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersSim.rules.api.rules.SwitchSameRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>switchSame()</code>.
 */
public class SwitchSameMatch extends GraphTransformationMatch<SwitchSameMatch, SwitchSameRule> {
	private Group varG1;
	private Group varG2;
	private Voter1 varV1;
	private Voter1 varV2;
	private Voter1 varV3;

	/**
	 * Creates a new match for the rule <code>switchSame()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SwitchSameMatch(final SwitchSameRule pattern, final IMatch match) {
		super(pattern, match);
		varG1 = (Group) match.get("g1");
		varG2 = (Group) match.get("g2");
		varV1 = (Voter1) match.get("v1");
		varV2 = (Voter1) match.get("v2");
		varV3 = (Voter1) match.get("v3");
	}

	/**
	 * Returns the g1.
	 *
	 * @return the g1
	 */
	public Group getG1() {
		return varG1;
	}

	/**
	 * Returns the g2.
	 *
	 * @return the g2
	 */
	public Group getG2() {
		return varG2;
	}

	/**
	 * Returns the v1.
	 *
	 * @return the v1
	 */
	public Voter1 getV1() {
		return varV1;
	}

	/**
	 * Returns the v2.
	 *
	 * @return the v2
	 */
	public Voter1 getV2() {
		return varV2;
	}

	/**
	 * Returns the v3.
	 *
	 * @return the v3
	 */
	public Voter1 getV3() {
		return varV3;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	g1 --> " + varG1 + System.lineSeparator();
		s += "	g2 --> " + varG2 + System.lineSeparator();
		s += "	v1 --> " + varV1 + System.lineSeparator();
		s += "	v2 --> " + varV2 + System.lineSeparator();
		s += "	v3 --> " + varV3 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
