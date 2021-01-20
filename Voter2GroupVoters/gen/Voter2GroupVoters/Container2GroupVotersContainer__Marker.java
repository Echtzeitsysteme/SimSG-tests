/**
 */
package Voter2GroupVoters;

import GroupVoters.GroupVotersContainer;

import Voter.Container;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container2 Group Voters Container Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__SRC__c <em>CREATE SRC c</em>}</li>
 *   <li>{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__TRG__gvc <em>CREATE TRG gvc</em>}</li>
 *   <li>{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__CORR__c2gvc <em>CREATE CORR c2gvc</em>}</li>
 * </ul>
 *
 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getContainer2GroupVotersContainer__Marker()
 * @model
 * @generated
 */
public interface Container2GroupVotersContainer__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC c</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC c</em>' reference.
	 * @see #setCREATE__SRC__c(Container)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getContainer2GroupVotersContainer__Marker_CREATE__SRC__c()
	 * @model required="true"
	 * @generated
	 */
	Container getCREATE__SRC__c();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__SRC__c <em>CREATE SRC c</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC c</em>' reference.
	 * @see #getCREATE__SRC__c()
	 * @generated
	 */
	void setCREATE__SRC__c(Container value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG gvc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG gvc</em>' reference.
	 * @see #setCREATE__TRG__gvc(GroupVotersContainer)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getContainer2GroupVotersContainer__Marker_CREATE__TRG__gvc()
	 * @model required="true"
	 * @generated
	 */
	GroupVotersContainer getCREATE__TRG__gvc();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__TRG__gvc <em>CREATE TRG gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG gvc</em>' reference.
	 * @see #getCREATE__TRG__gvc()
	 * @generated
	 */
	void setCREATE__TRG__gvc(GroupVotersContainer value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR c2gvc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR c2gvc</em>' reference.
	 * @see #setCREATE__CORR__c2gvc(Container2GroupVotersContainer)
	 * @see Voter2GroupVoters.Voter2GroupVotersPackage#getContainer2GroupVotersContainer__Marker_CREATE__CORR__c2gvc()
	 * @model required="true"
	 * @generated
	 */
	Container2GroupVotersContainer getCREATE__CORR__c2gvc();

	/**
	 * Sets the value of the '{@link Voter2GroupVoters.Container2GroupVotersContainer__Marker#getCREATE__CORR__c2gvc <em>CREATE CORR c2gvc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR c2gvc</em>' reference.
	 * @see #getCREATE__CORR__c2gvc()
	 * @generated
	 */
	void setCREATE__CORR__c2gvc(Container2GroupVotersContainer value);

} // Container2GroupVotersContainer__Marker
