/**
 */
package Voter2GroupVoters.impl;

import GroupVoters.GroupVotersContainer;

import Voter.Container;

import Voter2GroupVoters.Container2GroupVotersContainer;
import Voter2GroupVoters.Container2GroupVotersContainer__Marker;
import Voter2GroupVoters.Voter2GroupVotersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container2 Group Voters Container Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.impl.Container2GroupVotersContainer__MarkerImpl#getCREATE__SRC__c <em>CREATE SRC c</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Container2GroupVotersContainer__MarkerImpl#getCREATE__TRG__gvc <em>CREATE TRG gvc</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Container2GroupVotersContainer__MarkerImpl#getCREATE__CORR__c2gvc <em>CREATE CORR c2gvc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Container2GroupVotersContainer__MarkerImpl extends TGGRuleApplicationImpl implements Container2GroupVotersContainer__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__c() <em>CREATE SRC c</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__c()
	 * @generated
	 * @ordered
	 */
	protected Container creatE__SRC__c;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__gvc() <em>CREATE TRG gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__gvc()
	 * @generated
	 * @ordered
	 */
	protected GroupVotersContainer creatE__TRG__gvc;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__c2gvc() <em>CREATE CORR c2gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__c2gvc()
	 * @generated
	 * @ordered
	 */
	protected Container2GroupVotersContainer creatE__CORR__c2gvc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Container2GroupVotersContainer__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Voter2GroupVotersPackage.Literals.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getCREATE__SRC__c() {
		if (creatE__SRC__c != null && creatE__SRC__c.eIsProxy()) {
			InternalEObject oldCREATE__SRC__c = (InternalEObject)creatE__SRC__c;
			creatE__SRC__c = (Container)eResolveProxy(oldCREATE__SRC__c);
			if (creatE__SRC__c != oldCREATE__SRC__c) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C, oldCREATE__SRC__c, creatE__SRC__c));
			}
		}
		return creatE__SRC__c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container basicGetCREATE__SRC__c() {
		return creatE__SRC__c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__c(Container newCREATE__SRC__c) {
		Container oldCREATE__SRC__c = creatE__SRC__c;
		creatE__SRC__c = newCREATE__SRC__c;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C, oldCREATE__SRC__c, creatE__SRC__c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersContainer getCREATE__TRG__gvc() {
		if (creatE__TRG__gvc != null && creatE__TRG__gvc.eIsProxy()) {
			InternalEObject oldCREATE__TRG__gvc = (InternalEObject)creatE__TRG__gvc;
			creatE__TRG__gvc = (GroupVotersContainer)eResolveProxy(oldCREATE__TRG__gvc);
			if (creatE__TRG__gvc != oldCREATE__TRG__gvc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC, oldCREATE__TRG__gvc, creatE__TRG__gvc));
			}
		}
		return creatE__TRG__gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersContainer basicGetCREATE__TRG__gvc() {
		return creatE__TRG__gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__gvc(GroupVotersContainer newCREATE__TRG__gvc) {
		GroupVotersContainer oldCREATE__TRG__gvc = creatE__TRG__gvc;
		creatE__TRG__gvc = newCREATE__TRG__gvc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC, oldCREATE__TRG__gvc, creatE__TRG__gvc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container2GroupVotersContainer getCREATE__CORR__c2gvc() {
		if (creatE__CORR__c2gvc != null && creatE__CORR__c2gvc.eIsProxy()) {
			InternalEObject oldCREATE__CORR__c2gvc = (InternalEObject)creatE__CORR__c2gvc;
			creatE__CORR__c2gvc = (Container2GroupVotersContainer)eResolveProxy(oldCREATE__CORR__c2gvc);
			if (creatE__CORR__c2gvc != oldCREATE__CORR__c2gvc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC, oldCREATE__CORR__c2gvc, creatE__CORR__c2gvc));
			}
		}
		return creatE__CORR__c2gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container2GroupVotersContainer basicGetCREATE__CORR__c2gvc() {
		return creatE__CORR__c2gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__c2gvc(Container2GroupVotersContainer newCREATE__CORR__c2gvc) {
		Container2GroupVotersContainer oldCREATE__CORR__c2gvc = creatE__CORR__c2gvc;
		creatE__CORR__c2gvc = newCREATE__CORR__c2gvc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC, oldCREATE__CORR__c2gvc, creatE__CORR__c2gvc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C:
				if (resolve) return getCREATE__SRC__c();
				return basicGetCREATE__SRC__c();
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC:
				if (resolve) return getCREATE__TRG__gvc();
				return basicGetCREATE__TRG__gvc();
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC:
				if (resolve) return getCREATE__CORR__c2gvc();
				return basicGetCREATE__CORR__c2gvc();
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
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C:
				setCREATE__SRC__c((Container)newValue);
				return;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC:
				setCREATE__TRG__gvc((GroupVotersContainer)newValue);
				return;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC:
				setCREATE__CORR__c2gvc((Container2GroupVotersContainer)newValue);
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
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C:
				setCREATE__SRC__c((Container)null);
				return;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC:
				setCREATE__TRG__gvc((GroupVotersContainer)null);
				return;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC:
				setCREATE__CORR__c2gvc((Container2GroupVotersContainer)null);
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
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_SRC_C:
				return creatE__SRC__c != null;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_TRG_GVC:
				return creatE__TRG__gvc != null;
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER__CREATE_CORR_C2GVC:
				return creatE__CORR__c2gvc != null;
		}
		return super.eIsSet(featureID);
	}

} //Container2GroupVotersContainer__MarkerImpl
