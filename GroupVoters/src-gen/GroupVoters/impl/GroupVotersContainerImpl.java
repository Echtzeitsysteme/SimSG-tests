/**
 */
package GroupVoters.impl;

import GroupVoters.Group;
import GroupVoters.GroupVotersContainer;
import GroupVoters.GroupVotersPackage;
import GroupVoters.Voter1;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GroupVoters.impl.GroupVotersContainerImpl#getVoter <em>Voter</em>}</li>
 *   <li>{@link GroupVoters.impl.GroupVotersContainerImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupVotersContainerImpl extends MinimalEObjectImpl.Container implements GroupVotersContainer {
	/**
	 * The cached value of the '{@link #getVoter() <em>Voter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoter()
	 * @generated
	 * @ordered
	 */
	protected EList<Voter1> voter;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupVotersContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupVotersPackage.Literals.GROUP_VOTERS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Voter1> getVoter() {
		if (voter == null) {
			voter = new EObjectContainmentEList<Voter1>(Voter1.class, this,
					GroupVotersPackage.GROUP_VOTERS_CONTAINER__VOTER);
		}
		return voter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this,
					GroupVotersPackage.GROUP_VOTERS_CONTAINER__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__VOTER:
			return ((InternalEList<?>) getVoter()).basicRemove(otherEnd, msgs);
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__GROUP:
			return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__VOTER:
			return getVoter();
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__GROUP:
			return getGroup();
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
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__VOTER:
			getVoter().clear();
			getVoter().addAll((Collection<? extends Voter1>) newValue);
			return;
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__GROUP:
			getGroup().clear();
			getGroup().addAll((Collection<? extends Group>) newValue);
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
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__VOTER:
			getVoter().clear();
			return;
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__GROUP:
			getGroup().clear();
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
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__VOTER:
			return voter != null && !voter.isEmpty();
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER__GROUP:
			return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupVotersContainerImpl
