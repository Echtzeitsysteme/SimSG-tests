package groupVotersSim.rules.api.matches;

import GroupVoters.Group;
import groupVotersSim.rules.api.rules.HetGroupPattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>hetGroup()</code>.
 */
public class HetGroupMatch extends GraphTransformationMatch<HetGroupMatch, HetGroupPattern> {
	private Group varG;

	/**
	 * Creates a new match for the pattern <code>hetGroup()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public HetGroupMatch(final HetGroupPattern pattern, final IMatch match) {
		super(pattern, match);
		varG = (Group) match.get("g");
	}

	/**
	 * Returns the g.
	 *
	 * @return the g
	 */
	public Group getG() {
		return varG;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	g --> " + varG + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
