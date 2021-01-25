/**
 */
package Voter2GroupVoters;

import GroupVoters.Group;

import Voter.Voter1;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voter Relation2 Voter Group Relation Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__SRC__v <em>CONTEXT SRC v</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__SRC__v2 <em>CONTEXT SRC v2</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__TRG__gV <em>CONTEXT TRG gV</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__TRG__gV2 <em>CONTEXT TRG gV2</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCREATE__TRG__group <em>CREATE TRG group</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCREATE__CORR__v2g1 <em>CREATE CORR v2g1</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCREATE__CORR__v2g2 <em>CREATE CORR v2g2</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__CORR__v2gv <em>CONTEXT CORR v2gv</em>}</li>
 *   <li>{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__CORR__v2gv2 <em>CONTEXT CORR v2gv2</em>}</li>
 * </ul>
 *
 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker()
 * @model
 * @generated
 */
public interface VoterRelation2VoterGroupRelation__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC v</em>' reference.
	 * @see #setCONTEXT__SRC__v(Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v()
	 * @model required="true"
	 * @generated
	 */
	Voter1 getCONTEXT__SRC__v();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__SRC__v <em>CONTEXT SRC v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC v</em>' reference.
	 * @see #getCONTEXT__SRC__v()
	 * @generated
	 */
	void setCONTEXT__SRC__v(Voter1 value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC v2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC v2</em>' reference.
	 * @see #setCONTEXT__SRC__v2(Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CONTEXT__SRC__v2()
	 * @model required="true"
	 * @generated
	 */
	Voter1 getCONTEXT__SRC__v2();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__SRC__v2 <em>CONTEXT SRC v2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC v2</em>' reference.
	 * @see #getCONTEXT__SRC__v2()
	 * @generated
	 */
	void setCONTEXT__SRC__v2(Voter1 value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG gV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG gV</em>' reference.
	 * @see #setCONTEXT__TRG__gV(GroupVoters.Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV()
	 * @model required="true"
	 * @generated
	 */
	GroupVoters.Voter1 getCONTEXT__TRG__gV();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__TRG__gV <em>CONTEXT TRG gV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG gV</em>' reference.
	 * @see #getCONTEXT__TRG__gV()
	 * @generated
	 */
	void setCONTEXT__TRG__gV(GroupVoters.Voter1 value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG gV2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG gV2</em>' reference.
	 * @see #setCONTEXT__TRG__gV2(GroupVoters.Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CONTEXT__TRG__gV2()
	 * @model required="true"
	 * @generated
	 */
	GroupVoters.Voter1 getCONTEXT__TRG__gV2();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__TRG__gV2 <em>CONTEXT TRG gV2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG gV2</em>' reference.
	 * @see #getCONTEXT__TRG__gV2()
	 * @generated
	 */
	void setCONTEXT__TRG__gV2(GroupVoters.Voter1 value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG group</em>' reference.
	 * @see #setCREATE__TRG__group(Group)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CREATE__TRG__group()
	 * @model required="true"
	 * @generated
	 */
	Group getCREATE__TRG__group();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCREATE__TRG__group <em>CREATE TRG group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG group</em>' reference.
	 * @see #getCREATE__TRG__group()
	 * @generated
	 */
	void setCREATE__TRG__group(Group value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR v2g1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR v2g1</em>' reference.
	 * @see #setCREATE__CORR__v2g1(Voter2Group)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g1()
	 * @model required="true"
	 * @generated
	 */
	Voter2Group getCREATE__CORR__v2g1();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCREATE__CORR__v2g1 <em>CREATE CORR v2g1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR v2g1</em>' reference.
	 * @see #getCREATE__CORR__v2g1()
	 * @generated
	 */
	void setCREATE__CORR__v2g1(Voter2Group value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR v2g2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR v2g2</em>' reference.
	 * @see #setCREATE__CORR__v2g2(Voter2Group)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CREATE__CORR__v2g2()
	 * @model required="true"
	 * @generated
	 */
	Voter2Group getCREATE__CORR__v2g2();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCREATE__CORR__v2g2 <em>CREATE CORR v2g2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR v2g2</em>' reference.
	 * @see #getCREATE__CORR__v2g2()
	 * @generated
	 */
	void setCREATE__CORR__v2g2(Voter2Group value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR v2gv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR v2gv</em>' reference.
	 * @see #setCONTEXT__CORR__v2gv(Voter2GroupVoter)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv()
	 * @model required="true"
	 * @generated
	 */
	Voter2GroupVoter getCONTEXT__CORR__v2gv();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__CORR__v2gv <em>CONTEXT CORR v2gv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR v2gv</em>' reference.
	 * @see #getCONTEXT__CORR__v2gv()
	 * @generated
	 */
	void setCONTEXT__CORR__v2gv(Voter2GroupVoter value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR v2gv2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR v2gv2</em>' reference.
	 * @see #setCONTEXT__CORR__v2gv2(Voter2GroupVoter)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoterRelation2VoterGroupRelation__Marker_CONTEXT__CORR__v2gv2()
	 * @model required="true"
	 * @generated
	 */
	Voter2GroupVoter getCONTEXT__CORR__v2gv2();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.VoterRelation2VoterGroupRelation__Marker#getCONTEXT__CORR__v2gv2 <em>CONTEXT CORR v2gv2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR v2gv2</em>' reference.
	 * @see #getCONTEXT__CORR__v2gv2()
	 * @generated
	 */
	void setCONTEXT__CORR__v2gv2(Voter2GroupVoter value);

} // VoterRelation2VoterGroupRelation__Marker
