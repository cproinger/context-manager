/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owner;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owner.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link owner.Element#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see owner.OwnerPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends elem.Element {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link owner.Element}.
	 * It is bidirectional and its opposite is '{@link owner.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see owner.OwnerPackage#getElement_OwnedElement()
	 * @see owner.Element#getOwner
	 * @model opposite="owner" derived="true"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link owner.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Element)
	 * @see owner.OwnerPackage#getElement_Owner()
	 * @see owner.Element#getOwnedElement
	 * @model opposite="ownedElement" derived="true"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Sets the value of the '{@link owner.Element#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Element value);

} // Element
