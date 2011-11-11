/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link named.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link named.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see named.NamedPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link named.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see named.NamedPackage#getNamespace_Member()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' containment reference list.
	 * The list contents are of type {@link named.NamedElement}.
	 * It is bidirectional and its opposite is '{@link named.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' containment reference list.
	 * @see named.NamedPackage#getNamespace_OwnedMember()
	 * @see named.NamedElement#getNamespace
	 * @model opposite="namespace" containment="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

} // Namespace
