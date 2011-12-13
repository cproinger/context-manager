/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mngr.ManagerTransition#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getSource <em>Source</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getInput <em>Input</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getOutput <em>Output</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getTransProb <em>Trans Prob</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getTransRate <em>Trans Rate</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getEvent <em>Event</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getCondition <em>Condition</em>}</li>
 *   <li>{@link mngr.ManagerTransition#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mngr.MngrPackage#getManagerTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TransProbMax1 ManagerTransitionUndefinedName'"
 *        annotation="gmf.link label='transProb, Event, Action, Condition' label.pattern='{0}:{1}:{2}:{3}' target.decoration='closedarrow' width='2' source='source' target='target' style='dot' color='0,0,0' tool.name='ManagerTransition' tool.description='Creates a new transition from source state to target state' tool.small.bundle='mngr.diagram' tool.small.path='icons/transitionS.png'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TransProbMax1='transProb <= 1.0 and not transProb.oclIsUndefined()' ManagerTransitionUndefinedName='not name.oclIsUndefined()'"
 * @generated
 */
public interface ManagerTransition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mngr.Manager#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(Manager)
	 * @see mngr.MngrPackage#getManagerTransition_OwningManager()
	 * @see mngr.Manager#getOwnedTransition
	 * @model opposite="ownedTransition" required="true" transient="false"
	 * @generated
	 */
	Manager getOwningManager();

	/**
	 * Sets the value of the '{@link mngr.ManagerTransition#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerState#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ManagerState)
	 * @see mngr.MngrPackage#getManagerTransition_Source()
	 * @see mngr.ManagerState#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true"
	 * @generated
	 */
	ManagerState getSource();

	/**
	 * Sets the value of the '{@link mngr.ManagerTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ManagerState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerState#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ManagerState)
	 * @see mngr.MngrPackage#getManagerTransition_Target()
	 * @see mngr.ManagerState#getIncomingTransition
	 * @model opposite="incomingTransition" required="true"
	 * @generated
	 */
	ManagerState getTarget();

	/**
	 * Sets the value of the '{@link mngr.ManagerTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ManagerState value);

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
	 * @see mngr.MngrPackage#getManagerTransition_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link mngr.ManagerTransition#getInput <em>Input</em>}' attribute.
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
	 * @see mngr.MngrPackage#getManagerTransition_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link mngr.ManagerTransition#getOutput <em>Output</em>}' attribute.
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
	 * @see mngr.MngrPackage#getManagerTransition_TransProb()
	 * @model
	 * @generated
	 */
	double getTransProb();

	/**
	 * Sets the value of the '{@link mngr.ManagerTransition#getTransProb <em>Trans Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Prob</em>' attribute.
	 * @see #getTransProb()
	 * @generated
	 */
	void setTransProb(double value);

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
	 * @see mngr.MngrPackage#getManagerTransition_TransRate()
	 * @model
	 * @generated
	 */
	double getTransRate();

	/**
	 * Sets the value of the '{@link mngr.ManagerTransition#getTransRate <em>Trans Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Rate</em>' attribute.
	 * @see #getTransRate()
	 * @generated
	 */
	void setTransRate(double value);

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
	 * @see mngr.MngrPackage#getManagerTransition_Event()
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
	 * @see mngr.MngrPackage#getManagerTransition_Condition()
	 * @model
	 * @generated
	 */
	EList<String> getCondition();

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
	 * @see mngr.MngrPackage#getManagerTransition_Action()
	 * @model
	 * @generated
	 */
	EList<String> getAction();

} // ManagerTransition
