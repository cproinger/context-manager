/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ctxmngr.CtxmngrPackage
 * @generated
 */
public interface CtxmngrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtxmngrFactory eINSTANCE = ctxmngr.impl.CtxmngrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Manager</em>'.
	 * @generated
	 */
	ContextManager createContextManager();

	/**
	 * Returns a new object of class '<em>Ctx State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ctx State</em>'.
	 * @generated
	 */
	CtxState createCtxState();

	/**
	 * Returns a new object of class '<em>Ctx Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ctx Transition</em>'.
	 * @generated
	 */
	CtxTransition createCtxTransition();

	/**
	 * Returns a new object of class '<em>Context Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Parameter</em>'.
	 * @generated
	 */
	ContextParameter createContextParameter();

	/**
	 * Returns a new object of class '<em>Remote Firing Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote Firing Dependency</em>'.
	 * @generated
	 */
	RemoteFiringDependency createRemoteFiringDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CtxmngrPackage getCtxmngrPackage();

} //CtxmngrFactory
