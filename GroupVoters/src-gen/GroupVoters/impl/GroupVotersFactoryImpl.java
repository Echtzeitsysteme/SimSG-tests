/**
 */
package GroupVoters.impl;

import GroupVoters.*;

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
public class GroupVotersFactoryImpl extends EFactoryImpl implements GroupVotersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GroupVotersFactory init() {
		try {
			GroupVotersFactory theGroupVotersFactory = (GroupVotersFactory) EPackage.Registry.INSTANCE
					.getEFactory(GroupVotersPackage.eNS_URI);
			if (theGroupVotersFactory != null) {
				return theGroupVotersFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GroupVotersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersFactoryImpl() {
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
		case GroupVotersPackage.GROUP_VOTERS_CONTAINER:
			return createGroupVotersContainer();
		case GroupVotersPackage.VOTER1:
			return createVoter1();
		case GroupVotersPackage.GROUP:
			return createGroup();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersContainer createGroupVotersContainer() {
		GroupVotersContainerImpl groupVotersContainer = new GroupVotersContainerImpl();
		return groupVotersContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voter1 createVoter1() {
		Voter1Impl voter1 = new Voter1Impl();
		return voter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVotersPackage getGroupVotersPackage() {
		return (GroupVotersPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GroupVotersPackage getPackage() {
		return GroupVotersPackage.eINSTANCE;
	}

} //GroupVotersFactoryImpl
