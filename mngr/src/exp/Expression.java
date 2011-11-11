/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package exp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exp.Expression#getOperand <em>Operand</em>}</li>
 *   <li>{@link exp.Expression#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see exp.ExpPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link exp.ValueSpecification}.
	 * It is bidirectional and its opposite is '{@link exp.ValueSpecification#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see exp.ExpPackage#getExpression_Operand()
	 * @see exp.ValueSpecification#getExpression
	 * @model opposite="expression" containment="true"
	 * @generated
	 */
	EList<ValueSpecification> getOperand();

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see exp.ExpPackage#getExpression_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link exp.Expression#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // Expression
