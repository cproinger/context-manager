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
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link exp.OpaqueExpression#getBody <em>Body</em>}</li>
 *   <li>{@link exp.OpaqueExpression#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see exp.ExpPackage#getOpaqueExpression()
 * @model annotation="gmf.node figure='figures.OpaqueExpressionFigure' label='body' label.icon='false' label.placement='external' tool.name='OpaqueExpression' tool.description='Creates a new OpaqueExpression' tool.small.bundle='mngr.diagram' tool.small.path='icons/OpaqueExpressionS.png' phantom='true'"
 * @generated
 */
public interface OpaqueExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see exp.ExpPackage#getOpaqueExpression_Body()
	 * @model
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see exp.ExpPackage#getOpaqueExpression_Language()
	 * @model
	 * @generated
	 */
	EList<String> getLanguage();

} // OpaqueExpression
