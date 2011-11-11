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
 * A representation of the model object '<em><b>Ctx Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctxmngr.CtxTransition#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getSource <em>Source</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getInput <em>Input</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getOutput <em>Output</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getTransProb <em>Trans Prob</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getManagerTransition <em>Manager Transition</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getAction <em>Action</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getEvent <em>Event</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getCondition <em>Condition</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#getTransRate <em>Trans Rate</em>}</li>
 *   <li>{@link ctxmngr.CtxTransition#isIsRemote <em>Is Remote</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctxmngr.CtxmngrPackage#getCtxTransition()
 * @model
 * @generated
 */
public interface CtxTransition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ctxmngr.ContextManager#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(ContextManager)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_OwningManager()
	 * @see ctxmngr.ContextManager#getOwnedTransition
	 * @model opposite="ownedTransition" required="true" transient="false"
	 * @generated
	 */
	ContextManager getOwningManager();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(ContextManager value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ctxmngr.CtxState#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CtxState)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_Source()
	 * @see ctxmngr.CtxState#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true"
	 * @generated
	 */
	CtxState getSource();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CtxState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ctxmngr.CtxState#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CtxState)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_Target()
	 * @see ctxmngr.CtxState#getIncomingTransition
	 * @model opposite="incomingTransition" required="true"
	 * @generated
	 */
	CtxState getTarget();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CtxState value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Trans Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Prob</em>' attribute.
	 * @see #setTransProb(double)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_TransProb()
	 * @model
	 * @generated
	 */
	double getTransProb();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#getTransProb <em>Trans Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Prob</em>' attribute.
	 * @see #getTransProb()
	 * @generated
	 */
	void setTransProb(double value);

	/**
	 * Returns the value of the '<em><b>Manager Transition</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Transition</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_ManagerTransition()
	 * @model required="true"
	 * @generated
	 */
	EList<ManagerTransition> getManagerTransition();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute list.
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_Action()
	 * @model
	 * @generated
	 */
	EList<String> getAction();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute list.
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_Event()
	 * @model
	 * @generated
	 */
	EList<String> getEvent();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute list.
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_Condition()
	 * @model
	 * @generated
	 */
	EList<String> getCondition();

	/**
	 * Returns the value of the '<em><b>Trans Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Rate</em>' attribute.
	 * @see #setTransRate(double)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_TransRate()
	 * @model
	 * @generated
	 */
	double getTransRate();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#getTransRate <em>Trans Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Rate</em>' attribute.
	 * @see #getTransRate()
	 * @generated
	 */
	void setTransRate(double value);

	/**
	 * Returns the value of the '<em><b>Is Remote</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Remote</em>' attribute.
	 * @see #setIsRemote(boolean)
	 * @see ctxmngr.CtxmngrPackage#getCtxTransition_IsRemote()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsRemote();

	/**
	 * Sets the value of the '{@link ctxmngr.CtxTransition#isIsRemote <em>Is Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remote</em>' attribute.
	 * @see #isIsRemote()
	 * @generated
	 */
	void setIsRemote(boolean value);

} // CtxTransition
