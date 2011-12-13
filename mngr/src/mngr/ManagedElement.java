/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr;

import named.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mngr.ManagedElement#getOwningManager <em>Owning Manager</em>}</li>
 *   <li>{@link mngr.ManagedElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see mngr.MngrPackage#getManagedElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ManagedElementUndefinedName'"
 *        annotation="gmf.node figure='figures.ManagedElementFigure' label='name' label.icon='false' label.placement='external' tool.name='ManagedElement' tool.description='Creates a new ManagedElement' tool.small.bundle='mngr.diagram' tool.small.path='icons/ManagedElementS.png'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ManagedElementUndefinedName='not name.oclIsUndefined()'"
 * @generated
 */
public interface ManagedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mngr.Manager#getManagedElement <em>Managed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Manager</em>' container reference.
	 * @see #setOwningManager(Manager)
	 * @see mngr.MngrPackage#getManagedElement_OwningManager()
	 * @see mngr.Manager#getManagedElement
	 * @model opposite="managedElement" required="true" transient="false"
	 * @generated
	 */
	Manager getOwningManager();

	/**
	 * Sets the value of the '{@link mngr.ManagedElement#getOwningManager <em>Owning Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Manager</em>' container reference.
	 * @see #getOwningManager()
	 * @generated
	 */
	void setOwningManager(Manager value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mngr.MngrPackage#getManagedElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mngr.ManagedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ManagedElement
