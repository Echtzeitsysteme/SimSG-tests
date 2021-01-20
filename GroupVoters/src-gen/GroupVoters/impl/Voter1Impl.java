/**
 */
package GroupVoters.impl;

import GroupVoters.Group;
import GroupVoters.GroupVotersPackage;
import GroupVoters.Voter1;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voter1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GroupVoters.impl.Voter1Impl#getMember <em>Member</em>}</li>
 *   <li>{@link GroupVoters.impl.Voter1Impl#isVote <em>Vote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Voter1Impl extends MinimalEObjectImpl.Container implements Voter1 {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> member;

	/**
	 * The default value of the '{@link #isVote() <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVote() <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVote()
	 * @generated
	 * @ordered
	 */
	protected boolean vote = VOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Voter1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupVotersPackage.Literals.VOTER1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<Group>(Group.class, this, GroupVotersPackage.VOTER1__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVote() {
		return vote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVote(boolean newVote) {
		boolean oldVote = vote;
		vote = newVote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupVotersPackage.VOTER1__VOTE, oldVote, vote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GroupVotersPackage.VOTER1__MEMBER:
			return getMember();
		case GroupVotersPackage.VOTER1__VOTE:
			return isVote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GroupVotersPackage.VOTER1__MEMBER:
			getMember().clear();
			getMember().addAll((Collection<? extends Group>) newValue);
			return;
		case GroupVotersPackage.VOTER1__VOTE:
			setVote((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GroupVotersPackage.VOTER1__MEMBER:
			getMember().clear();
			return;
		case GroupVotersPackage.VOTER1__VOTE:
			setVote(VOTE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GroupVotersPackage.VOTER1__MEMBER:
			return member != null && !member.isEmpty();
		case GroupVotersPackage.VOTER1__VOTE:
			return vote != VOTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (vote: ");
		result.append(vote);
		result.append(')');
		return result.toString();
	}

} //Voter1Impl
