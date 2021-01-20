package groupVotersSim.rules.api.matches;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersSim.rules.api.rules.TrueMemberVGPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>trueMemberVG()</code>.
 */
public class TrueMemberVGMatch extends GraphTransformationMatch<TrueMemberVGMatch, TrueMemberVGPattern> {
	private Group varG;
	private Voter1 varV1;

	/**
	 * Creates a new match for the pattern <code>trueMemberVG()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public TrueMemberVGMatch(final TrueMemberVGPattern pattern, final IMatch match) {
		super(pattern, match);
		varG = (Group) match.get("g");
		varV1 = (Voter1) match.get("v1");
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

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	g --> " + varG + System.lineSeparator();
		s += "	v1 --> " + varV1 + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
