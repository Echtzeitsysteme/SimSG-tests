package groupVotersSim.rules.api.matches;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersSim.rules.api.rules.ConvertRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>convert()</code>.
 */
public class ConvertMatch extends GraphTransformationMatch<ConvertMatch, ConvertRule> {
	private Group varG;
	private Voter1 varV1;
	private Voter1 varV2;

	/**
	 * Creates a new match for the rule <code>convert()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public ConvertMatch(final ConvertRule pattern, final IMatch match) {
		super(pattern, match);
		varG = (Group) match.get("g");
		varV1 = (Voter1) match.get("v1");
		varV2 = (Voter1) match.get("v2");
	}

	/**
	 * Returns the g.
	 *
	 * @return the g
	 */
	public Group getG() {
		return varG;
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

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	g --> " + varG + System.lineSeparator();
		s += "	v1 --> " + varV1 + System.lineSeparator();
		s += "	v2 --> " + varV2 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
