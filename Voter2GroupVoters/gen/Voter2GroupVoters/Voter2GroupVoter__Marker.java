/**
 */
package Voter2GroupVoters;

import GroupVoters.GroupVotersContainer;

import Voter.Container;
import Voter.Voter1;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voter2 Group Voter Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCONTEXT__SRC__c <em>CONTEXT SRC c</em>}</li>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCREATE__SRC__v <em>CREATE SRC v</em>}</li>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCREATE__TRG__gV <em>CREATE TRG gV</em>}</li>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCONTEXT__TRG__gvc <em>CONTEXT TRG gvc</em>}</li>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCONTEXT__CORR__c2gvc <em>CONTEXT CORR c2gvc</em>}</li>
 *   <li>{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCREATE__CORR__v2gv <em>CREATE CORR v2gv</em>}</li>
 * </ul>
 *
 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter__Marker()
 * @model
 * @generated
 */
public interface Voter2GroupVoter__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC c</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC c</em>' reference.
	 * @see #setCONTEXT__SRC__c(Container)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter__Marker_CONTEXT__SRC__c()
	 * @model required="true"
	 * @generated
	 */
	Container getCONTEXT__SRC__c();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCONTEXT__SRC__c <em>CONTEXT SRC c</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC c</em>' reference.
	 * @see #getCONTEXT__SRC__c()
	 * @generated
	 */
	void setCONTEXT__SRC__c(Container value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC v</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC v</em>' reference.
	 * @see #setCREATE__SRC__v(Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter__Marker_CREATE__SRC__v()
	 * @model required="true"
	 * @generated
	 */
	Voter1 getCREATE__SRC__v();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCREATE__SRC__v <em>CREATE SRC v</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC v</em>' reference.
	 * @see #getCREATE__SRC__v()
	 * @generated
	 */
	void setCREATE__SRC__v(Voter1 value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG gV</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG gV</em>' reference.
	 * @see #setCREATE__TRG__gV(GroupVoters.Voter1)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter__Marker_CREATE__TRG__gV()
	 * @model required="true"
	 * @generated
	 */
	GroupVoters.Voter1 getCREATE__TRG__gV();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCREATE__TRG__gV <em>CREATE TRG gV</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG gV</em>' reference.
	 * @see #getCREATE__TRG__gV()
	 * @generated
	 */
	void setCREATE__TRG__gV(GroupVoters.Voter1 value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG gvc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG gvc</em>' reference.
	 * @see #setCONTEXT__TRG__gvc(GroupVotersContainer)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter__Marker_CONTEXT__TRG__gvc()
	 * @model required="true"
	 * @generated
	 */
	GroupVotersContainer getCONTEXT__TRG__gvc();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCONTEXT__TRG__gvc <em>CONTEXT TRG gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG gvc</em>' reference.
	 * @see #getCONTEXT__TRG__gvc()
	 * @generated
	 */
	void setCONTEXT__TRG__gvc(GroupVotersContainer value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR c2gvc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR c2gvc</em>' reference.
	 * @see #setCONTEXT__CORR__c2gvc(Container2GroupVotersContainer)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter__Marker_CONTEXT__CORR__c2gvc()
	 * @model required="true"
	 * @generated
	 */
	Container2GroupVotersContainer getCONTEXT__CORR__c2gvc();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCONTEXT__CORR__c2gvc <em>CONTEXT CORR c2gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR c2gvc</em>' reference.
	 * @see #getCONTEXT__CORR__c2gvc()
	 * @generated
	 */
	void setCONTEXT__CORR__c2gvc(Container2GroupVotersContainer value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR v2gv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR v2gv</em>' reference.
	 * @see #setCREATE__CORR__v2gv(Voter2GroupVoter)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getVoter2GroupVoter__Marker_CREATE__CORR__v2gv()
	 * @model required="true"
	 * @generated
	 */
	Voter2GroupVoter getCREATE__CORR__v2gv();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Voter2GroupVoter__Marker#getCREATE__CORR__v2gv <em>CREATE CORR v2gv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR v2gv</em>' reference.
	 * @see #getCREATE__CORR__v2gv()
	 * @generated
	 */
	void setCREATE__CORR__v2gv(Voter2GroupVoter value);

} // Voter2GroupVoter__Marker
