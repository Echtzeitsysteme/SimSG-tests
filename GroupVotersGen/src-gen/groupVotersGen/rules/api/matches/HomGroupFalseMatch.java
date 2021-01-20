package groupVotersGen.rules.api.matches;

import GroupVoters.Group;
import groupVotersGen.rules.api.rules.HomGroupFalsePattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>homGroupFalse()</code>.
 */
public class HomGroupFalseMatch extends GraphTransformationMatch<HomGroupFalseMatch, HomGroupFalsePattern> {
	private Group varG;

	/**
	 * Creates a new match for the pattern <code>homGroupFalse()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public HomGroupFalseMatch(final HomGroupFalsePattern pattern, final IMatch match) {
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
