/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr;

import mngr.ManagerTransition;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Firing Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctxmngr.RemoteFiringDependency#getFired <em>Fired</em>}</li>
 *   <li>{@link ctxmngr.RemoteFiringDependency#getFiring <em>Firing</em>}</li>
 *   <li>{@link ctxmngr.RemoteFiringDependency#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.RemoteFiringDependency#getRepresents <em>Represents</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctxmngr.CtxmngrPackage#getRemoteFiringDependency()
 * @model
 * @generated
 */
public interface RemoteFiringDependency extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fired</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fired</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fired</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getRemoteFiringDependency_Fired()
	 * @model required="true"
	 * @generated
	 */
	EList<ManagerTransition> getFired();

	/**
	 * Returns the value of the '<em><b>Firing</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getRemoteFiringDependency_Firing()
	 * @model required="true"
	 * @generated
	 */
	EList<ManagerTransition> getFiring();

	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ctxmngr.ContextManager#getRemoteFirings <em>Remote Firings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(ContextManager)
	 * @see ctxmngr.CtxmngrPackage#getRemoteFiringDependency_OwningManager()
	 * @see ctxmngr.ContextManager#getRemoteFirings
	 * @model opposite="remoteFirings" required="true" transient="false"
	 * @generated
	 */
	ContextManager getOwningManager();

	/**
	 * Sets the value of the '{@link ctxmngr.RemoteFiringDependency#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(ContextManager value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference list.
	 * The list contents are of type {@link ctxmngr.CtxTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getRemoteFiringDependency_Represents()
	 * @model required="true"
	 * @generated
	 */
	EList<CtxTransition> getRepresents();

} // RemoteFiringDependency
