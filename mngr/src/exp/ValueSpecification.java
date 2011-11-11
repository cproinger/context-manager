/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package exp;

import const_.Constraint;

import owner.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exp.ValueSpecification#getExpression <em>Expression</em>}</li>
 *   <li>{@link exp.ValueSpecification#getOwningConstraint <em>Owning Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see exp.ExpPackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends Element {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link exp.Expression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' container reference.
	 * @see #setExpression(Expression)
	 * @see exp.ExpPackage#getValueSpecification_Expression()
	 * @see exp.Expression#getOperand
	 * @model opposite="operand" transient="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link exp.ValueSpecification#getExpression <em>Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' container reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Owning Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Constraint</em>' reference.
	 * @see #setOwningConstraint(Constraint)
	 * @see exp.ExpPackage#getValueSpecification_OwningConstraint()
	 * @model
	 * @generated
	 */
	Constraint getOwningConstraint();

	/**
	 * Sets the value of the '{@link exp.ValueSpecification#getOwningConstraint <em>Owning Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Constraint</em>' reference.
	 * @see #getOwningConstraint()
	 * @generated
	 */
	void setOwningConstraint(Constraint value);

} // ValueSpecification
