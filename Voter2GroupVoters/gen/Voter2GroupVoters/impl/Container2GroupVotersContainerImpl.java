/**
 */
package Voter2GroupVoters.impl;

import GroupVoters.GroupVotersContainer;

import Voter2GroupVoters.Container2GroupVotersContainer;
import Voter2GroupVoters.Voter2GroupVotersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container2 Group Voters Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.impl.Container2GroupVotersContainerImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Container2GroupVotersContainerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Container2GroupVotersContainerImpl extends MinimalEObjectImpl.Container implements Container2GroupVotersContainer {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Voter.Container source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected GroupVotersContainer target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Container2GroupVotersContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Voter2GroupVotersPackage.Literals.CONTAINER2_GROUP_VOTERS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter.Container getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Voter.Container)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter.Container basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Voter.Container newSource) {
		Voter.Container oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersContainer getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (GroupVotersContainer)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersContainer basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(GroupVotersContainer newTarget) {
		GroupVotersContainer oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET:
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
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE:
				setSource((Voter.Container)newValue);
				return;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET:
				setTarget((GroupVotersContainer)newValue);
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
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE:
				setSource((Voter.Container)null);
				return;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET:
				setTarget((GroupVotersContainer)null);
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
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__SOURCE:
				return source != null;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //Container2GroupVotersContainerImpl
