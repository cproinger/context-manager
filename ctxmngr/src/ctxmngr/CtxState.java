/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr;

import mngr.ManagerState;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctx State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctxmngr.CtxState#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.CtxState#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link ctxmngr.CtxState#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link ctxmngr.CtxState#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link ctxmngr.CtxState#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link ctxmngr.CtxState#getContextParameters <em>Context Parameters</em>}</li>
 *   <li>{@link ctxmngr.CtxState#getManagerStates <em>Manager States</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctxmngr.CtxmngrPackage#getCtxState()
 * @model
 * @generated
 */
public interface CtxState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ctxmngr.ContextManager#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(ContextManager)
	 * @see ctxmngr.CtxmngrPackage#getCtxState_OwningManager()
	 * @see ctxmngr.ContextManager#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	ContextManager getOwningManager();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxState#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(ContextManager value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' reference list.
	 * The list contents are of type {@link ctxmngr.CtxTransition}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.CtxTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getCtxState_OutgoingTransition()
	 * @see ctxmngr.CtxTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<CtxTransition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link ctxmngr.CtxTransition}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.CtxTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getCtxState_IncomingTransition()
	 * @see ctxmngr.CtxTransition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<CtxTransition> getIncomingTransition();

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see ctxmngr.CtxmngrPackage#getCtxState_IsStart()
	 * @model
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxState#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is End</em>' attribute.
	 * @see #setIsEnd(boolean)
	 * @see ctxmngr.CtxmngrPackage#getCtxState_IsEnd()
	 * @model
	 * @generated
	 */
	boolean isIsEnd();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxState#isIsEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isIsEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Context Parameters</b></em>' reference list.
	 * The list contents are of type {@link ctxmngr.ContextParameter}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.ContextParameter#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Parameters</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getCtxState_ContextParameters()
	 * @see ctxmngr.ContextParameter#getState
	 * @model opposite="state"
	 * @generated
	 */
	EList<ContextParameter> getContextParameters();

	/**
	 * Returns the value of the '<em><b>Manager States</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager States</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getCtxState_ManagerStates()
	 * @model
	 * @generated
	 */
	EList<ManagerState> getManagerStates();

} // CtxState
