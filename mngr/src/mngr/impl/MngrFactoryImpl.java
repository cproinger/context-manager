/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr.impl;

import mngr.*;

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
public class MngrFactoryImpl extends EFactoryImpl implements MngrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MngrFactory init() {
		try {
			MngrFactory theMngrFactory = (MngrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/mngr"); 
			if (theMngrFactory != null) {
				return theMngrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MngrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MngrFactoryImpl() {
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
			case MngrPackage.MANAGER: return createManager();
			case MngrPackage.MANAGER_STATE: return createManagerState();
			case MngrPackage.MANAGER_TRANSITION: return createManagerTransition();
			case MngrPackage.MANAGER_PARAMETER: return createManagerParameter();
			case MngrPackage.MANAGED_ELEMENT: return createManagedElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerState createManagerState() {
		ManagerStateImpl managerState = new ManagerStateImpl();
		return managerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerTransition createManagerTransition() {
		ManagerTransitionImpl managerTransition = new ManagerTransitionImpl();
		return managerTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerParameter createManagerParameter() {
		ManagerParameterImpl managerParameter = new ManagerParameterImpl();
		return managerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagedElement createManagedElement() {
		ManagedElementImpl managedElement = new ManagedElementImpl();
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MngrPackage getMngrPackage() {
		return (MngrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MngrPackage getPackage() {
		return MngrPackage.eINSTANCE;
	}

} //MngrFactoryImpl
