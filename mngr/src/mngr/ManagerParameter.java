/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr;

import exp.OpaqueExpression;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mngr.ManagerParameter#getState <em>State</em>}</li>
 *   <li>{@link mngr.ManagerParameter#getOpaqueExpressions <em>Opaque Expressions</em>}</li>
 *   <li>{@link mngr.ManagerParameter#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link mngr.ManagerParameter#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link mngr.ManagerParameter#getLitteralInteger <em>Litteral Integer</em>}</li>
 *   <li>{@link mngr.ManagerParameter#getLitteralString <em>Litteral String</em>}</li>
 *   <li>{@link mngr.ManagerParameter#getLitteralBoolean <em>Litteral Boolean</em>}</li>
 *   <li>{@link mngr.ManagerParameter#getLitteralUnlimitedNatural <em>Litteral Unlimited Natural</em>}</li>
 * </ul>
 * </p>
 *
 * @see mngr.MngrPackage#getManagerParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ManagerParameterUndefinedName'"
 *        annotation="gmf.node figure='figures.ManagerParameterFigure' label='name' label.icon='false' label.placement='external' tool.name='ManagerParameter' tool.description='Create a new ManagerParameter' tool.small.bundle='mngr.figures' tool.small.path='icons/ManagerParameterS.png'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ManagerParameterUndefinedName='not name.oclIsUndefined()'"
 * @generated
 */
public interface ManagerParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link mngr.ManagerState}.
	 * It is bidirectional and its opposite is '{@link mngr.ManagerState#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see mngr.MngrPackage#getManagerParameter_State()
	 * @see mngr.ManagerState#getContextParameters
	 * @model opposite="contextParameters"
	 * @generated
	 */
	EList<ManagerState> getState();

	/**
	 * Returns the value of the '<em><b>Opaque Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link exp.OpaqueExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opaque Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opaque Expressions</em>' containment reference list.
	 * @see mngr.MngrPackage#getManagerParameter_OpaqueExpressions()
	 * @model containment="true"
	 *        annotation="gmf.link style='dot' width='2' color='97,94,63' tool.name='OpaqueExpression' tool.description='Create a new link form an OpaqueExpression and a ManagerParameter' tool.small.bundle='mngr.figures' tool.small.path='icons/OpaqueExpressionS.png'"
	 * @generated
	 */
	EList<OpaqueExpression> getOpaqueExpressions();

	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mngr.Manager#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(Manager)
	 * @see mngr.MngrPackage#getManagerParameter_OwningManager()
	 * @see mngr.Manager#getContextParameters
	 * @model opposite="contextParameters" required="true" transient="false"
	 * @generated
	 */
	Manager getOwningManager();

	/**
	 * Sets the value of the '{@link mngr.ManagerParameter#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input</em>' attribute.
	 * @see #setIsInput(boolean)
	 * @see mngr.MngrPackage#getManagerParameter_IsInput()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInput();

	/**
	 * Sets the value of the '{@link mngr.ManagerParameter#isIsInput <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input</em>' attribute.
	 * @see #isIsInput()
	 * @generated
	 */
	void setIsInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Litteral Integer</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Litteral Integer</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Litteral Integer</em>' attribute list.
	 * @see mngr.MngrPackage#getManagerParameter_LitteralInteger()
	 * @model
	 * @generated
	 */
	EList<Integer> getLitteralInteger();

	/**
	 * Returns the value of the '<em><b>Litteral String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Litteral String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Litteral String</em>' attribute list.
	 * @see mngr.MngrPackage#getManagerParameter_LitteralString()
	 * @model
	 * @generated
	 */
	EList<String> getLitteralString();

	/**
	 * Returns the value of the '<em><b>Litteral Boolean</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Litteral Boolean</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Litteral Boolean</em>' attribute list.
	 * @see mngr.MngrPackage#getManagerParameter_LitteralBoolean()
	 * @model
	 * @generated
	 */
	EList<Boolean> getLitteralBoolean();

	/**
	 * Returns the value of the '<em><b>Litteral Unlimited Natural</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Litteral Unlimited Natural</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Litteral Unlimited Natural</em>' attribute list.
	 * @see mngr.MngrPackage#getManagerParameter_LitteralUnlimitedNatural()
	 * @model
	 * @generated
	 */
	EList<Double> getLitteralUnlimitedNatural();

} // ManagerParameter
