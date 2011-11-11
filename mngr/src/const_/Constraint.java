/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package const_;

import exp.ValueSpecification;

import named.NamedElement;

import org.eclipse.emf.common.util.EList;

import owner.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link const_.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link const_.Constraint#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see const_.ConstPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link owner.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see const_.ConstPackage#getConstraint_ConstrainedElement()
	 * @model
	 * @generated
	 */
	EList<Element> getConstrainedElement();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see const_.ConstPackage#getConstraint_Specification()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link const_.Constraint#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

} // Constraint
