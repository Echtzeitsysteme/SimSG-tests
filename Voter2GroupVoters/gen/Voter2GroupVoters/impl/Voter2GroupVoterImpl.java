/**
 */
package Voter2GroupVoters.impl;

import Voter.Voter1;

import Voter2GroupVoters.Voter2GroupVoter;
import Voter2GroupVoters.Voter2GroupVotersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voter2 Group Voter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoterImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoterImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Voter2GroupVoterImpl extends MinimalEObjectImpl.Container implements Voter2GroupVoter {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Voter1 source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected GroupVoters.Voter1 target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Voter2GroupVoterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Voter2GroupVotersPackage.Literals.VOTER2_GROUP_VOTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Voter1)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Voter1 newSource) {
		Voter1 oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (GroupVoters.Voter1)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(GroupVoters.Voter1 newTarget) {
		GroupVoters.Voter1 oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__SOURCE:
				setSource((Voter1)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__TARGET:
				setTarget((GroupVoters.Voter1)newValue);
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
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__SOURCE:
				setSource((Voter1)null);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__TARGET:
				setTarget((GroupVoters.Voter1)null);
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
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__SOURCE:
				return source != null;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //Voter2GroupVoterImpl
