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
 * A representation of the model object '<em><b>Manager State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mngr.ManagerState#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link mngr.ManagerState#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link mngr.ManagerState#getIncomingTransition <em>Incoming Transition</em>}</li>
 *   <li>{@link mngr.ManagerState#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link mngr.ManagerState#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link mngr.ManagerState#getProb <em>Prob</em>}</li>
 *   <li>{@link mngr.ManagerState#getContextParameters <em>Context Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see mngr.MngrPackage#getManagerState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EndStateNofinalState UndefinedTransitions InitialStateNoFinalState StartStateNoInitialState OutgoingTransitionsProbabilitySumMustBe1 ManagerStateNameUndefined'"
 *        annotation="gmf.node figure='figures.ManagerStateFigure' label='name' label.icon='false' label.placement='external' tool.name='ManagerState' tool.description='Creates a new ManagerState' tool.small.bundle='mngr.diagram' tool.small.path='icons/ManagerStateS.png'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EndStateNofinalState='if isEnd then owningManager.finalState->includes(self) else true endif' UndefinedTransitions='if not owningManager.initialState.oclAsSet()->includes(self) and not owningManager.finalState->includes(self) then outgoingTransition->size() > 0 and incomingTransition->size() > 0 else true endif' InitialStateNoFinalState='not (isStart and isEnd)' StartStateNoInitialState='if isStart then owningManager.initialState.oclAsSet()->includes(self) else true endif' OutgoingTransitionsProbabilitySumMustBe1='if not owningManager.finalState->includes(self) then outgoingTransition->collect(transProb)->iterate(p : Real ; res : Real = 0 | res + p) = 1.0 else true endif' ManagerStateNameUndefined='not name.oclIsUndefined()'"
 * @generated
 */
public interface ManagerState extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mngr.Manager#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(Manager)
	 * @see mngr.MngrPackage#getManagerState_OwningManager()
	 * @see mngr.Manager#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	Manager getOwningManager();

	/**
	 * Sets the value of the '{@link mngr.ManagerState#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerTransition}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' reference list.
	 * @see mngr.MngrPackage#getManagerState_OutgoingTransition()
	 * @see mngr.ManagerTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ManagerTransition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerTransition}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see mngr.MngrPackage#getManagerState_IncomingTransition()
	 * @see mngr.ManagerTransition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ManagerTransition> getIncomingTransition();

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
	 * @see mngr.MngrPackage#getManagerState_IsStart()
	 * @model
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link mngr.ManagerState#isIsStart <em>Is Start</em>}' attribute.
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
	 * @see mngr.MngrPackage#getManagerState_IsEnd()
	 * @model
	 * @generated
	 */
	boolean isIsEnd();

	/**
	 * Sets the value of the '{@link mngr.ManagerState#isIsEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isIsEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #setProb(double)
	 * @see mngr.MngrPackage#getManagerState_Prob()
	 * @model
	 * @generated
	 */
	double getProb();

	/**
	 * Sets the value of the '{@link mngr.ManagerState#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(double value);

	/**
	 * Returns the value of the '<em><b>Context Parameters</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerParameter}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerParameter#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Parameters</em>' reference list.
	 * @see mngr.MngrPackage#getManagerState_ContextParameters()
	 * @see mngr.ManagerParameter#getState
	 * @model opposite="state"
	 *        annotation="gmf.link style='dot' width='2' color='190,190,190' tool.name='ManagerParameter' tool.description='Creates a new link form a ManagerState and a ManagerParameter' tool.small.bundle='mngr.diagram' tool.small.path='icons/ParameterLinkS.png'"
	 * @generated
	 */
	EList<ManagerParameter> getContextParameters();

} // ManagerState
