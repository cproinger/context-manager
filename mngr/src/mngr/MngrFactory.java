/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mngr.MngrPackage
 * @generated
 */
public interface MngrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MngrFactory eINSTANCE = mngr.impl.MngrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	Manager createManager();

	/**
	 * Returns a new object of class '<em>Manager State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager State</em>'.
	 * @generated
	 */
	ManagerState createManagerState();

	/**
	 * Returns a new object of class '<em>Manager Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager Transition</em>'.
	 * @generated
	 */
	ManagerTransition createManagerTransition();

	/**
	 * Returns a new object of class '<em>Manager Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager Parameter</em>'.
	 * @generated
	 */
	ManagerParameter createManagerParameter();

	/**
	 * Returns a new object of class '<em>Managed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Managed Element</em>'.
	 * @generated
	 */
	ManagedElement createManagedElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MngrPackage getMngrPackage();

} //MngrFactory
