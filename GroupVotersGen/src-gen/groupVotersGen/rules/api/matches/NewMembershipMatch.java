package groupVotersGen.rules.api.matches;

import GroupVoters.Group;
import GroupVoters.Voter1;
import groupVotersGen.rules.api.rules.NewMembershipRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the rule <code>newMembership()</code>.
 */
public class NewMembershipMatch extends GraphTransformationMatch<NewMembershipMatch, NewMembershipRule> {
	private Group varG;
	private Voter1 varV;

	/**
	 * Creates a new match for the rule <code>newMembership()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public NewMembershipMatch(final NewMembershipRule pattern, final IMatch match) {
		super(pattern, match);
		varG = (Group) match.get("g");
		varV = (Voter1) match.get("v");
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
	 * Returns the v.
	 *
	 * @return the v
	 */
	public Voter1 getV() {
		return varV;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	g --> " + varG + System.lineSeparator();
		s += "	v --> " + varV + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
