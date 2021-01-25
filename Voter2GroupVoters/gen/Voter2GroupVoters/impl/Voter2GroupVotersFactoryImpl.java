/**
 */
package Voter2GroupVoters.impl;

import Voter2GroupVoters.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Voter2GroupVotersFactoryImpl extends EFactoryImpl implements Voter2GroupVotersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Voter2GroupVotersFactory init() {
		try {
			Voter2GroupVotersFactory theVoter2GroupVotersFactory = (Voter2GroupVotersFactory)EPackage.Registry.INSTANCE.getEFactory(Voter2GroupVotersPackage.eNS_URI);
			if (theVoter2GroupVotersFactory != null) {
				return theVoter2GroupVotersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Voter2GroupVotersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVotersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER: return createContainer2GroupVotersContainer();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER: return createVoter2GroupVoter();
			case Voter2GroupVotersPackage.VOTER2_GROUP: return createVoter2Group();
			case Voter2GroupVotersPackage.CONTAINER2_GROUP_VOTERS_CONTAINER_MARKER: return createContainer2GroupVotersContainer__Marker();
			case Voter2GroupVotersPackage.VOTER2_GROUP_MARKER: return createVoter2Group__Marker();
			case Voter2GroupVotersPackage.VOTER2_GROUP_VOTER_MARKER: return createVoter2GroupVoter__Marker();
			case Voter2GroupVotersPackage.VOTER_RELATION2_VOTER_GROUP_RELATION_MARKER: return createVoterRelation2VoterGroupRelation__Marker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container2GroupVotersContainer createContainer2GroupVotersContainer() {
		Container2GroupVotersContainerImpl container2GroupVotersContainer = new Container2GroupVotersContainerImpl();
		return container2GroupVotersContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter createVoter2GroupVoter() {
		Voter2GroupVoterImpl voter2GroupVoter = new Voter2GroupVoterImpl();
		return voter2GroupVoter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2Group createVoter2Group() {
		Voter2GroupImpl voter2Group = new Voter2GroupImpl();
		return voter2Group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container2GroupVotersContainer__Marker createContainer2GroupVotersContainer__Marker() {
		Container2GroupVotersContainer__MarkerImpl container2GroupVotersContainer__Marker = new Container2GroupVotersContainer__MarkerImpl();
		return container2GroupVotersContainer__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2Group__Marker createVoter2Group__Marker() {
		Voter2Group__MarkerImpl voter2Group__Marker = new Voter2Group__MarkerImpl();
		return voter2Group__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVoter__Marker createVoter2GroupVoter__Marker() {
		Voter2GroupVoter__MarkerImpl voter2GroupVoter__Marker = new Voter2GroupVoter__MarkerImpl();
		return voter2GroupVoter__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoterRelation2VoterGroupRelation__Marker createVoterRelation2VoterGroupRelation__Marker() {
		VoterRelation2VoterGroupRelation__MarkerImpl voterRelation2VoterGroupRelation__Marker = new VoterRelation2VoterGroupRelation__MarkerImpl();
		return voterRelation2VoterGroupRelation__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter2GroupVotersPackage getVoter2GroupVotersPackage() {
		return (Voter2GroupVotersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Voter2GroupVotersPackage getPackage() {
		return Voter2GroupVotersPackage.eINSTANCE;
	}

} //Voter2GroupVotersFactoryImpl
