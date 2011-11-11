/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr;

import exp.OpaqueExpression;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ctxmngr.ContextParameter#getState <em>State</em>}</li>
 *   <li>{@link ctxmngr.ContextParameter#getOpaqueExpressions <em>Opaque Expressions</em>}</li>
 *   <li>{@link ctxmngr.ContextParameter#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link ctxmngr.ContextParameter#getLitteralInteger <em>Litteral Integer</em>}</li>
 *   <li>{@link ctxmngr.ContextParameter#getLitteralString <em>Litteral String</em>}</li>
 *   <li>{@link ctxmngr.ContextParameter#getLitteralBoolean <em>Litteral Boolean</em>}</li>
 *   <li>{@link ctxmngr.ContextParameter#getLitteralUnlimitedNatural <em>Litteral Unlimited Natural</em>}</li>
 *   <li>{@link ctxmngr.ContextParameter#isIsInput <em>Is Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctxmngr.CtxmngrPackage#getContextParameter()
 * @model
 * @generated
 */
public interface ContextParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link ctxmngr.CtxState}.
	 * It is bidirectional and its opposite is '{@link ctxmngr.CtxState#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_State()
	 * @see ctxmngr.CtxState#getContextParameters
	 * @model opposite="contextParameters"
	 * @generated
	 */
	EList<CtxState> getState();

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
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_OpaqueExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpaqueExpression> getOpaqueExpressions();

	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ctxmngr.ContextManager#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(ContextManager)
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_OwningManager()
	 * @see ctxmngr.ContextManager#getContextParameters
	 * @model opposite="contextParameters" required="true" transient="false"
	 * @generated
	 */
	ContextManager getOwningManager();

	/**
	 * Sets the value of the '{@link ctxmngr.ContextParameter#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(ContextManager value);

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
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_LitteralInteger()
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
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_LitteralString()
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
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_LitteralBoolean()
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
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_LitteralUnlimitedNatural()
	 * @model
	 * @generated
	 */
	EList<Double> getLitteralUnlimitedNatural();

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
	 * @see ctxmngr.CtxmngrPackage#getContextParameter_IsInput()
	 * @model
	 * @generated
	 */
	boolean isIsInput();

	/**
	 * Sets the value of the '{@link ctxmngr.ContextParameter#isIsInput <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input</em>' attribute.
	 * @see #isIsInput()
	 * @generated
	 */
	void setIsInput(boolean value);

} // ContextParameter
