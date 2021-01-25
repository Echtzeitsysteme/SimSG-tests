/**
 */
package Voter2GroupVoters.impl;

import GroupVoters.GroupVotersContainer;

import Voter.Container;
import Voter.Voter1;

import Voter2GroupVoters.Container2GroupVotersContainer;
import Voter2GroupVoters.Voter2GroupVoter;
import Voter2GroupVoters.Voter2GroupVoter__Marker;
import Voter2GroupVoters.Voter2GroupVotersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voter2 Group Voter Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoter__MarkerImpl#getCONTEXT__SRC__c <em>CONTEXT SRC c</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoter__MarkerImpl#getCREATE__SRC__v <em>CREATE SRC v</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoter__MarkerImpl#getCREATE__TRG__gV <em>CREATE TRG gV</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoter__MarkerImpl#getCONTEXT__TRG__gvc <em>CONTEXT TRG gvc</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoter__MarkerImpl#getCONTEXT__CORR__c2gvc <em>CONTEXT CORR c2gvc</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.Voter2GroupVoter__MarkerImpl#getCREATE__CORR__v2gv <em>CREATE CORR v2gv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Voter2GroupVoter__MarkerImpl extends TGGRuleApplicationImpl implements Voter2GroupVoter__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__c() <em>CONTEXT SRC c</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__c()
	 * @generated
	 * @ordered
	 */
	protected Container contexT__SRC__c;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__v() <em>CREATE SRC v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__v()
	 * @generated
	 * @ordered
	 */
	protected Voter1 creatE__SRC__v;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__gV() <em>CREATE TRG gV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__gV()
	 * @generated
	 * @ordered
	 */
	protected GroupVoters.Voter1 creatE__TRG__gV;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__gvc() <em>CONTEXT TRG gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__gvc()
	 * @generated
	 * @ordered
	 */
	protected GroupVotersContainer contexT__TRG__gvc;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__c2gvc() <em>CONTEXT CORR c2gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__c2gvc()
	 * @generated
	 * @ordered
	 */
	protected Container2GroupVotersContainer contexT__CORR__c2gvc;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__v2gv() <em>CREATE CORR v2gv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__v2gv()
	 * @generated
	 * @ordered
	 */
	protected Voter2GroupVoter creatE__CORR__v2gv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Voter2GroupVoter__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Voter2GroupVotersPackage.Literals.VOTER2_GROUP_VOTER_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container getCONTEXT__SRC__c() {
		if (contexT__SRC__c != null && contexT__SRC__c.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__c = (InternalEObject)contexT__SRC__c;
			contexT__SRC__c = (Container)eResolveProxy(oldCONTEXT__SRC__c);
			if (contexT__SRC__c != oldCONTEXT__SRC__c) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_SRC_C, oldCONTEXT__SRC__c, contexT__SRC__c));
			}
		}
		return contexT__SRC__c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container basicGetCONTEXT__SRC__c() {
		return contexT__SRC__c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__c(Container newCONTEXT__SRC__c) {
		Container oldCONTEXT__SRC__c = contexT__SRC__c;
		contexT__SRC__c = newCONTEXT__SRC__c;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_SRC_C, oldCONTEXT__SRC__c, contexT__SRC__c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 getCREATE__SRC__v() {
		if (creatE__SRC__v != null && creatE__SRC__v.eIsProxy()) {
			InternalEObject oldCREATE__SRC__v = (InternalEObject)creatE__SRC__v;
			creatE__SRC__v = (Voter1)eResolveProxy(oldCREATE__SRC__v);
			if (creatE__SRC__v != oldCREATE__SRC__v) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_SRC_V, oldCREATE__SRC__v, creatE__SRC__v));
			}
		}
		return creatE__SRC__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 basicGetCREATE__SRC__v() {
		return creatE__SRC__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__v(Voter1 newCREATE__SRC__v) {
		Voter1 oldCREATE__SRC__v = creatE__SRC__v;
		creatE__SRC__v = newCREATE__SRC__v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_SRC_V, oldCREATE__SRC__v, creatE__SRC__v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 getCREATE__TRG__gV() {
		if (creatE__TRG__gV != null && creatE__TRG__gV.eIsProxy()) {
			InternalEObject oldCREATE__TRG__gV = (InternalEObject)creatE__TRG__gV;
			creatE__TRG__gV = (GroupVoters.Voter1)eResolveProxy(oldCREATE__TRG__gV);
			if (creatE__TRG__gV != oldCREATE__TRG__gV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_TRG_GV, oldCREATE__TRG__gV, creatE__TRG__gV));
			}
		}
		return creatE__TRG__gV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 basicGetCREATE__TRG__gV() {
		return creatE__TRG__gV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__gV(GroupVoters.Voter1 newCREATE__TRG__gV) {
		GroupVoters.Voter1 oldCREATE__TRG__gV = creatE__TRG__gV;
		creatE__TRG__gV = newCREATE__TRG__gV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_TRG_GV, oldCREATE__TRG__gV, creatE__TRG__gV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersContainer getCONTEXT__TRG__gvc() {
		if (contexT__TRG__gvc != null && contexT__TRG__gvc.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__gvc = (InternalEObject)contexT__TRG__gvc;
			contexT__TRG__gvc = (GroupVotersContainer)eResolveProxy(oldCONTEXT__TRG__gvc);
			if (contexT__TRG__gvc != oldCONTEXT__TRG__gvc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_TRG_GVC, oldCONTEXT__TRG__gvc, contexT__TRG__gvc));
			}
		}
		return contexT__TRG__gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersContainer basicGetCONTEXT__TRG__gvc() {
		return contexT__TRG__gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__gvc(GroupVotersContainer newCONTEXT__TRG__gvc) {
		GroupVotersContainer oldCONTEXT__TRG__gvc = contexT__TRG__gvc;
		contexT__TRG__gvc = newCONTEXT__TRG__gvc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_TRG_GVC, oldCONTEXT__TRG__gvc, contexT__TRG__gvc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container2GroupVotersContainer getCONTEXT__CORR__c2gvc() {
		if (contexT__CORR__c2gvc != null && contexT__CORR__c2gvc.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__c2gvc = (InternalEObject)contexT__CORR__c2gvc;
			contexT__CORR__c2gvc = (Container2GroupVotersContainer)eResolveProxy(oldCONTEXT__CORR__c2gvc);
			if (contexT__CORR__c2gvc != oldCONTEXT__CORR__c2gvc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_CORR_C2GVC, oldCONTEXT__CORR__c2gvc, contexT__CORR__c2gvc));
			}
		}
		return contexT__CORR__c2gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container2GroupVotersContainer basicGetCONTEXT__CORR__c2gvc() {
		return contexT__CORR__c2gvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__c2gvc(Container2GroupVotersContainer newCONTEXT__CORR__c2gvc) {
		Container2GroupVotersContainer oldCONTEXT__CORR__c2gvc = contexT__CORR__c2gvc;
		contexT__CORR__c2gvc = newCONTEXT__CORR__c2gvc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_CORR_C2GVC, oldCONTEXT__CORR__c2gvc, contexT__CORR__c2gvc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter getCREATE__CORR__v2gv() {
		if (creatE__CORR__v2gv != null && creatE__CORR__v2gv.eIsProxy()) {
			InternalEObject oldCREATE__CORR__v2gv = (InternalEObject)creatE__CORR__v2gv;
			creatE__CORR__v2gv = (Voter2GroupVoter)eResolveProxy(oldCREATE__CORR__v2gv);
			if (creatE__CORR__v2gv != oldCREATE__CORR__v2gv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_CORR_V2GV, oldCREATE__CORR__v2gv, creatE__CORR__v2gv));
			}
		}
		return creatE__CORR__v2gv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter basicGetCREATE__CORR__v2gv() {
		return creatE__CORR__v2gv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__v2gv(Voter2GroupVoter newCREATE__CORR__v2gv) {
		Voter2GroupVoter oldCREATE__CORR__v2gv = creatE__CORR__v2gv;
		creatE__CORR__v2gv = newCREATE__CORR__v2gv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_CORR_V2GV, oldCREATE__CORR__v2gv, creatE__CORR__v2gv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_SRC_C:
				if (resolve) return getCONTEXT__SRC__c();
				return basicGetCONTEXT__SRC__c();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_SRC_V:
				if (resolve) return getCREATE__SRC__v();
				return basicGetCREATE__SRC__v();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_TRG_GV:
				if (resolve) return getCREATE__TRG__gV();
				return basicGetCREATE__TRG__gV();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_TRG_GVC:
				if (resolve) return getCONTEXT__TRG__gvc();
				return basicGetCONTEXT__TRG__gvc();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_CORR_C2GVC:
				if (resolve) return getCONTEXT__CORR__c2gvc();
				return basicGetCONTEXT__CORR__c2gvc();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_CORR_V2GV:
				if (resolve) return getCREATE__CORR__v2gv();
				return basicGetCREATE__CORR__v2gv();
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
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_SRC_C:
				setCONTEXT__SRC__c((Container)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_SRC_V:
				setCREATE__SRC__v((Voter1)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_TRG_GV:
				setCREATE__TRG__gV((GroupVoters.Voter1)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_TRG_GVC:
				setCONTEXT__TRG__gvc((GroupVotersContainer)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_CORR_C2GVC:
				setCONTEXT__CORR__c2gvc((Container2GroupVotersContainer)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_CORR_V2GV:
				setCREATE__CORR__v2gv((Voter2GroupVoter)newValue);
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
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_SRC_C:
				setCONTEXT__SRC__c((Container)null);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_SRC_V:
				setCREATE__SRC__v((Voter1)null);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_TRG_GV:
				setCREATE__TRG__gV((GroupVoters.Voter1)null);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_TRG_GVC:
				setCONTEXT__TRG__gvc((GroupVotersContainer)null);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_CORR_C2GVC:
				setCONTEXT__CORR__c2gvc((Container2GroupVotersContainer)null);
				return;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_CORR_V2GV:
				setCREATE__CORR__v2gv((Voter2GroupVoter)null);
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
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_SRC_C:
				return contexT__SRC__c != null;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_SRC_V:
				return creatE__SRC__v != null;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_TRG_GV:
				return creatE__TRG__gV != null;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_TRG_GVC:
				return contexT__TRG__gvc != null;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CONTEXT_CORR_C2GVC:
				return contexT__CORR__c2gvc != null;
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER__CREATE_CORR_V2GV:
				return creatE__CORR__v2gv != null;
		}
		return super.eIsSet(featureID);
	}

} //Voter2GroupVoter__MarkerImpl
