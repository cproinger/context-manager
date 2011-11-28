/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr;

import mngr.Manager;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctxmngr.ContextManager#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link ctxmngr.ContextManager#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link ctxmngr.ContextManager#getFinalState <em>Final State</em>}</li>
 *   <li>{@link ctxmngr.ContextManager#getContextParameters <em>Context Parameters</em>}</li>
 *   <li>{@link ctxmngr.ContextManager#getCombinedManager <em>Combined Manager</em>}</li>
 *   <li>{@link ctxmngr.ContextManager#getRemoteFirings <em>Remote Firings</em>}</li>
 *   <li>{@link ctxmngr.ContextManager#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctxmngr.CtxmngrPackage#getContextManager()
 * @model
 * @generated
 */
public interface ContextManager extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link ctxmngr.CtxState}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.CtxState#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see ctxmngr.CtxmngrPackage#getContextManager_OwnedState()
	 * @see ctxmngr.CtxState#getOwningManager
	 * @model opposite="owningManager" containment="true"
	 * @generated
	 */
	EList<CtxState> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(CtxState)
	 * @see ctxmngr.CtxmngrPackage#getContextManager_InitialState()
	 * @model required="true"
	 * @generated
	 */
	CtxState getInitialState();

	/**
	 * Sets the value of the '{@link ctxmngr.ContextManager#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(CtxState value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link ctxmngr.CtxState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getContextManager_FinalState()
	 * @model
	 * @generated
	 */
	EList<CtxState> getFinalState();

	/**
	 * Returns the value of the '<em><b>Context Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ctxmngr.ContextParameter}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.ContextParameter#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Parameters</em>' containment reference list.
	 * @see ctxmngr.CtxmngrPackage#getContextManager_ContextParameters()
	 * @see ctxmngr.ContextParameter#getOwningManager
	 * @model opposite="owningManager" containment="true"
	 * @generated
	 */
	EList<ContextParameter> getContextParameters();

	/**
	 * Returns the value of the '<em><b>Combined Manager</b></em>' reference list.
	 * The list contents are of type {@link mngr.Manager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Manager</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Manager</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getContextManager_CombinedManager()
	 * @model
	 * @generated
	 */
	EList<Manager> getCombinedManager();

	/**
	 * Returns the value of the '<em><b>Remote Firings</b></em>' containment reference list.
	 * The list contents are of type {@link ctxmngr.RemoteFiringDependency}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.RemoteFiringDependency#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Firings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Firings</em>' containment reference list.
	 * @see ctxmngr.CtxmngrPackage#getContextManager_RemoteFirings()
	 * @see ctxmngr.RemoteFiringDependency#getOwningManager
	 * @model opposite="owningManager" containment="true"
	 * @generated
	 */
	EList<RemoteFiringDependency> getRemoteFirings();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' containment reference list.
	 * The list contents are of type {@link ctxmngr.CtxTransition}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.CtxTransition#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' containment reference list.
	 * @see ctxmngr.CtxmngrPackage#getContextManager_OwnedTransition()
	 * @see ctxmngr.CtxTransition#getOwningManager
	 * @model opposite="owningManager" containment="true"
	 * @generated
	 */
	EList<CtxTransition> getOwnedTransition();

} // ContextManager
