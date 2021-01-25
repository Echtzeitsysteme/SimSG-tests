/**
 */
package Voter2GroupVoters.impl;

import GroupVoters.Group;

import Voter.Voter1;

import Voter2GroupVoters.Voter2Group;
import Voter2GroupVoters.Voter2GroupVoter;
import Voter2GroupVoters.Voter2GroupVotersPackage;
import Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voter Relation2 Voter Group Relation Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCONTEXT__SRC__v <em>CONTEXT SRC v</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCONTEXT__SRC__v2 <em>CONTEXT SRC v2</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCONTEXT__TRG__gV <em>CONTEXT TRG gV</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCONTEXT__TRG__gV2 <em>CONTEXT TRG gV2</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCREATE__TRG__group <em>CREATE TRG group</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCREATE__CORR__v2g1 <em>CREATE CORR v2g1</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCREATE__CORR__v2g2 <em>CREATE CORR v2g2</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCONTEXT__CORR__v2gv <em>CONTEXT CORR v2gv</em>}</li>
 *   <li>{@link Voter2GroupVoters.impl.VoterRelation2VoterGroupRelation__MarkerImpl#getCONTEXT__CORR__v2gv2 <em>CONTEXT CORR v2gv2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoterRelation2VoterGroupRelation__MarkerImpl extends TGGRuleApplicationImpl implements VoterRelation2VoterGroupRelation__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__v() <em>CONTEXT SRC v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__v()
	 * @generated
	 * @ordered
	 */
	protected Voter1 contexT__SRC__v;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__v2() <em>CONTEXT SRC v2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__v2()
	 * @generated
	 * @ordered
	 */
	protected Voter1 contexT__SRC__v2;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__gV() <em>CONTEXT TRG gV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__gV()
	 * @generated
	 * @ordered
	 */
	protected GroupVoters.Voter1 contexT__TRG__gV;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__gV2() <em>CONTEXT TRG gV2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__gV2()
	 * @generated
	 * @ordered
	 */
	protected GroupVoters.Voter1 contexT__TRG__gV2;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__group() <em>CREATE TRG group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__group()
	 * @generated
	 * @ordered
	 */
	protected Group creatE__TRG__group;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__v2g1() <em>CREATE CORR v2g1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__v2g1()
	 * @generated
	 * @ordered
	 */
	protected Voter2Group creatE__CORR__v2g1;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__v2g2() <em>CREATE CORR v2g2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__v2g2()
	 * @generated
	 * @ordered
	 */
	protected Voter2Group creatE__CORR__v2g2;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__v2gv() <em>CONTEXT CORR v2gv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__v2gv()
	 * @generated
	 * @ordered
	 */
	protected Voter2GroupVoter contexT__CORR__v2gv;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__v2gv2() <em>CONTEXT CORR v2gv2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__v2gv2()
	 * @generated
	 * @ordered
	 */
	protected Voter2GroupVoter contexT__CORR__v2gv2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoterRelation2VoterGroupRelation__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Voter2GroupVotersPackage.Literals.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 getCONTEXT__SRC__v() {
		if (contexT__SRC__v != null && contexT__SRC__v.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__v = (InternalEObject)contexT__SRC__v;
			contexT__SRC__v = (Voter1)eResolveProxy(oldCONTEXT__SRC__v);
			if (contexT__SRC__v != oldCONTEXT__SRC__v) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V, oldCONTEXT__SRC__v, contexT__SRC__v));
			}
		}
		return contexT__SRC__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 basicGetCONTEXT__SRC__v() {
		return contexT__SRC__v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__v(Voter1 newCONTEXT__SRC__v) {
		Voter1 oldCONTEXT__SRC__v = contexT__SRC__v;
		contexT__SRC__v = newCONTEXT__SRC__v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V, oldCONTEXT__SRC__v, contexT__SRC__v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 getCONTEXT__SRC__v2() {
		if (contexT__SRC__v2 != null && contexT__SRC__v2.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__v2 = (InternalEObject)contexT__SRC__v2;
			contexT__SRC__v2 = (Voter1)eResolveProxy(oldCONTEXT__SRC__v2);
			if (contexT__SRC__v2 != oldCONTEXT__SRC__v2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V2, oldCONTEXT__SRC__v2, contexT__SRC__v2));
			}
		}
		return contexT__SRC__v2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 basicGetCONTEXT__SRC__v2() {
		return contexT__SRC__v2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__v2(Voter1 newCONTEXT__SRC__v2) {
		Voter1 oldCONTEXT__SRC__v2 = contexT__SRC__v2;
		contexT__SRC__v2 = newCONTEXT__SRC__v2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V2, oldCONTEXT__SRC__v2, contexT__SRC__v2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 getCONTEXT__TRG__gV() {
		if (contexT__TRG__gV != null && contexT__TRG__gV.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__gV = (InternalEObject)contexT__TRG__gV;
			contexT__TRG__gV = (GroupVoters.Voter1)eResolveProxy(oldCONTEXT__TRG__gV);
			if (contexT__TRG__gV != oldCONTEXT__TRG__gV) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV, oldCONTEXT__TRG__gV, contexT__TRG__gV));
			}
		}
		return contexT__TRG__gV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 basicGetCONTEXT__TRG__gV() {
		return contexT__TRG__gV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__gV(GroupVoters.Voter1 newCONTEXT__TRG__gV) {
		GroupVoters.Voter1 oldCONTEXT__TRG__gV = contexT__TRG__gV;
		contexT__TRG__gV = newCONTEXT__TRG__gV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV, oldCONTEXT__TRG__gV, contexT__TRG__gV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 getCONTEXT__TRG__gV2() {
		if (contexT__TRG__gV2 != null && contexT__TRG__gV2.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__gV2 = (InternalEObject)contexT__TRG__gV2;
			contexT__TRG__gV2 = (GroupVoters.Voter1)eResolveProxy(oldCONTEXT__TRG__gV2);
			if (contexT__TRG__gV2 != oldCONTEXT__TRG__gV2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV2, oldCONTEXT__TRG__gV2, contexT__TRG__gV2));
			}
		}
		return contexT__TRG__gV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVoters.Voter1 basicGetCONTEXT__TRG__gV2() {
		return contexT__TRG__gV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__gV2(GroupVoters.Voter1 newCONTEXT__TRG__gV2) {
		GroupVoters.Voter1 oldCONTEXT__TRG__gV2 = contexT__TRG__gV2;
		contexT__TRG__gV2 = newCONTEXT__TRG__gV2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV2, oldCONTEXT__TRG__gV2, contexT__TRG__gV2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getCREATE__TRG__group() {
		if (creatE__TRG__group != null && creatE__TRG__group.eIsProxy()) {
			InternalEObject oldCREATE__TRG__group = (InternalEObject)creatE__TRG__group;
			creatE__TRG__group = (Group)eResolveProxy(oldCREATE__TRG__group);
			if (creatE__TRG__group != oldCREATE__TRG__group) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_TRG_GROUP, oldCREATE__TRG__group, creatE__TRG__group));
			}
		}
		return creatE__TRG__group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetCREATE__TRG__group() {
		return creatE__TRG__group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__group(Group newCREATE__TRG__group) {
		Group oldCREATE__TRG__group = creatE__TRG__group;
		creatE__TRG__group = newCREATE__TRG__group;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_TRG_GROUP, oldCREATE__TRG__group, creatE__TRG__group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2Group getCREATE__CORR__v2g1() {
		if (creatE__CORR__v2g1 != null && creatE__CORR__v2g1.eIsProxy()) {
			InternalEObject oldCREATE__CORR__v2g1 = (InternalEObject)creatE__CORR__v2g1;
			creatE__CORR__v2g1 = (Voter2Group)eResolveProxy(oldCREATE__CORR__v2g1);
			if (creatE__CORR__v2g1 != oldCREATE__CORR__v2g1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G1, oldCREATE__CORR__v2g1, creatE__CORR__v2g1));
			}
		}
		return creatE__CORR__v2g1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2Group basicGetCREATE__CORR__v2g1() {
		return creatE__CORR__v2g1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__v2g1(Voter2Group newCREATE__CORR__v2g1) {
		Voter2Group oldCREATE__CORR__v2g1 = creatE__CORR__v2g1;
		creatE__CORR__v2g1 = newCREATE__CORR__v2g1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G1, oldCREATE__CORR__v2g1, creatE__CORR__v2g1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2Group getCREATE__CORR__v2g2() {
		if (creatE__CORR__v2g2 != null && creatE__CORR__v2g2.eIsProxy()) {
			InternalEObject oldCREATE__CORR__v2g2 = (InternalEObject)creatE__CORR__v2g2;
			creatE__CORR__v2g2 = (Voter2Group)eResolveProxy(oldCREATE__CORR__v2g2);
			if (creatE__CORR__v2g2 != oldCREATE__CORR__v2g2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G2, oldCREATE__CORR__v2g2, creatE__CORR__v2g2));
			}
		}
		return creatE__CORR__v2g2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2Group basicGetCREATE__CORR__v2g2() {
		return creatE__CORR__v2g2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__v2g2(Voter2Group newCREATE__CORR__v2g2) {
		Voter2Group oldCREATE__CORR__v2g2 = creatE__CORR__v2g2;
		creatE__CORR__v2g2 = newCREATE__CORR__v2g2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G2, oldCREATE__CORR__v2g2, creatE__CORR__v2g2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter getCONTEXT__CORR__v2gv() {
		if (contexT__CORR__v2gv != null && contexT__CORR__v2gv.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__v2gv = (InternalEObject)contexT__CORR__v2gv;
			contexT__CORR__v2gv = (Voter2GroupVoter)eResolveProxy(oldCONTEXT__CORR__v2gv);
			if (contexT__CORR__v2gv != oldCONTEXT__CORR__v2gv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV, oldCONTEXT__CORR__v2gv, contexT__CORR__v2gv));
			}
		}
		return contexT__CORR__v2gv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter basicGetCONTEXT__CORR__v2gv() {
		return contexT__CORR__v2gv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__v2gv(Voter2GroupVoter newCONTEXT__CORR__v2gv) {
		Voter2GroupVoter oldCONTEXT__CORR__v2gv = contexT__CORR__v2gv;
		contexT__CORR__v2gv = newCONTEXT__CORR__v2gv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV, oldCONTEXT__CORR__v2gv, contexT__CORR__v2gv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter getCONTEXT__CORR__v2gv2() {
		if (contexT__CORR__v2gv2 != null && contexT__CORR__v2gv2.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__v2gv2 = (InternalEObject)contexT__CORR__v2gv2;
			contexT__CORR__v2gv2 = (Voter2GroupVoter)eResolveProxy(oldCONTEXT__CORR__v2gv2);
			if (contexT__CORR__v2gv2 != oldCONTEXT__CORR__v2gv2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV2, oldCONTEXT__CORR__v2gv2, contexT__CORR__v2gv2));
			}
		}
		return contexT__CORR__v2gv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter basicGetCONTEXT__CORR__v2gv2() {
		return contexT__CORR__v2gv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__v2gv2(Voter2GroupVoter newCONTEXT__CORR__v2gv2) {
		Voter2GroupVoter oldCONTEXT__CORR__v2gv2 = contexT__CORR__v2gv2;
		contexT__CORR__v2gv2 = newCONTEXT__CORR__v2gv2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV2, oldCONTEXT__CORR__v2gv2, contexT__CORR__v2gv2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V:
				if (resolve) return getCONTEXT__SRC__v();
				return basicGetCONTEXT__SRC__v();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V2:
				if (resolve) return getCONTEXT__SRC__v2();
				return basicGetCONTEXT__SRC__v2();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV:
				if (resolve) return getCONTEXT__TRG__gV();
				return basicGetCONTEXT__TRG__gV();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV2:
				if (resolve) return getCONTEXT__TRG__gV2();
				return basicGetCONTEXT__TRG__gV2();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_TRG_GROUP:
				if (resolve) return getCREATE__TRG__group();
				return basicGetCREATE__TRG__group();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G1:
				if (resolve) return getCREATE__CORR__v2g1();
				return basicGetCREATE__CORR__v2g1();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G2:
				if (resolve) return getCREATE__CORR__v2g2();
				return basicGetCREATE__CORR__v2g2();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV:
				if (resolve) return getCONTEXT__CORR__v2gv();
				return basicGetCONTEXT__CORR__v2gv();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV2:
				if (resolve) return getCONTEXT__CORR__v2gv2();
				return basicGetCONTEXT__CORR__v2gv2();
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
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V:
				setCONTEXT__SRC__v((Voter1)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V2:
				setCONTEXT__SRC__v2((Voter1)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV:
				setCONTEXT__TRG__gV((GroupVoters.Voter1)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV2:
				setCONTEXT__TRG__gV2((GroupVoters.Voter1)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_TRG_GROUP:
				setCREATE__TRG__group((Group)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G1:
				setCREATE__CORR__v2g1((Voter2Group)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G2:
				setCREATE__CORR__v2g2((Voter2Group)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV:
				setCONTEXT__CORR__v2gv((Voter2GroupVoter)newValue);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV2:
				setCONTEXT__CORR__v2gv2((Voter2GroupVoter)newValue);
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
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V:
				setCONTEXT__SRC__v((Voter1)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V2:
				setCONTEXT__SRC__v2((Voter1)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV:
				setCONTEXT__TRG__gV((GroupVoters.Voter1)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV2:
				setCONTEXT__TRG__gV2((GroupVoters.Voter1)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_TRG_GROUP:
				setCREATE__TRG__group((Group)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G1:
				setCREATE__CORR__v2g1((Voter2Group)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G2:
				setCREATE__CORR__v2g2((Voter2Group)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV:
				setCONTEXT__CORR__v2gv((Voter2GroupVoter)null);
				return;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV2:
				setCONTEXT__CORR__v2gv2((Voter2GroupVoter)null);
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
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V:
				return contexT__SRC__v != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_SRC_V2:
				return contexT__SRC__v2 != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV:
				return contexT__TRG__gV != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_TRG_GV2:
				return contexT__TRG__gV2 != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_TRG_GROUP:
				return creatE__TRG__group != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G1:
				return creatE__CORR__v2g1 != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CREATE_CORR_V2G2:
				return creatE__CORR__v2g2 != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV:
				return contexT__CORR__v2gv != null;
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER__CONTEXT_CORR_V2GV2:
				return contexT__CORR__v2gv2 != null;
		}
		return super.eIsSet(featureID);
	}

} //VoterRelation2VoterGroupRelation__MarkerImpl
