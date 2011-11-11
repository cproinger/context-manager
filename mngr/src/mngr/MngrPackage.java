/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mngr;

import named.NamedPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mngr.MngrFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MngrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mngr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/mngr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mngr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MngrPackage eINSTANCE = mngr.impl.MngrPackageImpl.init();

	/**
	 * The meta object id for the '{@link mngr.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mngr.impl.ManagerImpl
	 * @see mngr.impl.MngrPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__OWNED_STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__INITIAL_STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__FINAL_STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__CONTEXT_PARAMETERS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Managed Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__MANAGED_ELEMENT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__OWNED_TRANSITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link mngr.impl.ManagerStateImpl <em>Manager State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mngr.impl.ManagerStateImpl
	 * @see mngr.impl.MngrPackageImpl#getManagerState()
	 * @generated
	 */
	int MANAGER_STATE = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__OUTGOING_TRANSITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__INCOMING_TRANSITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__IS_START = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__IS_END = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__PROB = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Context Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE__CONTEXT_PARAMETERS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Manager State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_STATE_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link mngr.impl.ManagerTransitionImpl <em>Manager Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mngr.impl.ManagerTransitionImpl
	 * @see mngr.impl.MngrPackageImpl#getManagerTransition()
	 * @generated
	 */
	int MANAGER_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__SOURCE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__TARGET = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__INPUT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__OUTPUT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trans Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__TRANS_PROB = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trans Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__TRANS_RATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__EVENT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__CONDITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION__ACTION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Manager Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_TRANSITION_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link mngr.impl.ManagerParameterImpl <em>Manager Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mngr.impl.ManagerParameterImpl
	 * @see mngr.impl.MngrPackageImpl#getManagerParameter()
	 * @generated
	 */
	int MANAGER_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opaque Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__OPAQUE_EXPRESSIONS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__IS_INPUT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Litteral Integer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__LITTERAL_INTEGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Litteral String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__LITTERAL_STRING = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Litteral Boolean</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__LITTERAL_BOOLEAN = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Litteral Unlimited Natural</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Manager Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_PARAMETER_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link mngr.impl.ManagedElementImpl <em>Managed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mngr.impl.ManagedElementImpl
	 * @see mngr.impl.MngrPackageImpl#getManagedElement()
	 * @generated
	 */
	int MANAGED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT__DESCRIPTION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Managed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_ELEMENT_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link mngr.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see mngr.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the containment reference list '{@link mngr.Manager#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see mngr.Manager#getOwnedState()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_OwnedState();

	/**
	 * Returns the meta object for the reference '{@link mngr.Manager#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see mngr.Manager#getInitialState()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_InitialState();

	/**
	 * Returns the meta object for the reference list '{@link mngr.Manager#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final State</em>'.
	 * @see mngr.Manager#getFinalState()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_FinalState();

	/**
	 * Returns the meta object for the containment reference list '{@link mngr.Manager#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Parameters</em>'.
	 * @see mngr.Manager#getContextParameters()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ContextParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link mngr.Manager#getManagedElement <em>Managed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managed Element</em>'.
	 * @see mngr.Manager#getManagedElement()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ManagedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mngr.Manager#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transition</em>'.
	 * @see mngr.Manager#getOwnedTransition()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_OwnedTransition();

	/**
	 * Returns the meta object for class '{@link mngr.ManagerState <em>Manager State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager State</em>'.
	 * @see mngr.ManagerState
	 * @generated
	 */
	EClass getManagerState();

	/**
	 * Returns the meta object for the container reference '{@link mngr.ManagerState#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see mngr.ManagerState#getOwningManager()
	 * @see #getManagerState()
	 * @generated
	 */
	EReference getManagerState_OwningManager();

	/**
	 * Returns the meta object for the reference list '{@link mngr.ManagerState#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transition</em>'.
	 * @see mngr.ManagerState#getOutgoingTransition()
	 * @see #getManagerState()
	 * @generated
	 */
	EReference getManagerState_OutgoingTransition();

	/**
	 * Returns the meta object for the reference list '{@link mngr.ManagerState#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see mngr.ManagerState#getIncomingTransition()
	 * @see #getManagerState()
	 * @generated
	 */
	EReference getManagerState_IncomingTransition();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerState#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see mngr.ManagerState#isIsStart()
	 * @see #getManagerState()
	 * @generated
	 */
	EAttribute getManagerState_IsStart();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerState#isIsEnd <em>Is End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is End</em>'.
	 * @see mngr.ManagerState#isIsEnd()
	 * @see #getManagerState()
	 * @generated
	 */
	EAttribute getManagerState_IsEnd();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerState#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see mngr.ManagerState#getProb()
	 * @see #getManagerState()
	 * @generated
	 */
	EAttribute getManagerState_Prob();

	/**
	 * Returns the meta object for the reference list '{@link mngr.ManagerState#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Parameters</em>'.
	 * @see mngr.ManagerState#getContextParameters()
	 * @see #getManagerState()
	 * @generated
	 */
	EReference getManagerState_ContextParameters();

	/**
	 * Returns the meta object for class '{@link mngr.ManagerTransition <em>Manager Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Transition</em>'.
	 * @see mngr.ManagerTransition
	 * @generated
	 */
	EClass getManagerTransition();

	/**
	 * Returns the meta object for the container reference '{@link mngr.ManagerTransition#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see mngr.ManagerTransition#getOwningManager()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EReference getManagerTransition_OwningManager();

	/**
	 * Returns the meta object for the reference '{@link mngr.ManagerTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see mngr.ManagerTransition#getSource()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EReference getManagerTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link mngr.ManagerTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mngr.ManagerTransition#getTarget()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EReference getManagerTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerTransition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see mngr.ManagerTransition#getInput()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EAttribute getManagerTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerTransition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see mngr.ManagerTransition#getOutput()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EAttribute getManagerTransition_Output();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerTransition#getTransProb <em>Trans Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Prob</em>'.
	 * @see mngr.ManagerTransition#getTransProb()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EAttribute getManagerTransition_TransProb();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerTransition#getTransRate <em>Trans Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Rate</em>'.
	 * @see mngr.ManagerTransition#getTransRate()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EAttribute getManagerTransition_TransRate();

	/**
	 * Returns the meta object for the attribute list '{@link mngr.ManagerTransition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event</em>'.
	 * @see mngr.ManagerTransition#getEvent()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EAttribute getManagerTransition_Event();

	/**
	 * Returns the meta object for the attribute list '{@link mngr.ManagerTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Condition</em>'.
	 * @see mngr.ManagerTransition#getCondition()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EAttribute getManagerTransition_Condition();

	/**
	 * Returns the meta object for the attribute list '{@link mngr.ManagerTransition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action</em>'.
	 * @see mngr.ManagerTransition#getAction()
	 * @see #getManagerTransition()
	 * @generated
	 */
	EAttribute getManagerTransition_Action();

	/**
	 * Returns the meta object for class '{@link mngr.ManagerParameter <em>Manager Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Parameter</em>'.
	 * @see mngr.ManagerParameter
	 * @generated
	 */
	EClass getManagerParameter();

	/**
	 * Returns the meta object for the reference list '{@link mngr.ManagerParameter#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see mngr.ManagerParameter#getState()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EReference getManagerParameter_State();

	/**
	 * Returns the meta object for the containment reference list '{@link mngr.ManagerParameter#getOpaqueExpressions <em>Opaque Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opaque Expressions</em>'.
	 * @see mngr.ManagerParameter#getOpaqueExpressions()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EReference getManagerParameter_OpaqueExpressions();

	/**
	 * Returns the meta object for the container reference '{@link mngr.ManagerParameter#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see mngr.ManagerParameter#getOwningManager()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EReference getManagerParameter_OwningManager();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagerParameter#isIsInput <em>Is Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Input</em>'.
	 * @see mngr.ManagerParameter#isIsInput()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EAttribute getManagerParameter_IsInput();

	/**
	 * Returns the meta object for the attribute list '{@link mngr.ManagerParameter#getLitteralInteger <em>Litteral Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral Integer</em>'.
	 * @see mngr.ManagerParameter#getLitteralInteger()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EAttribute getManagerParameter_LitteralInteger();

	/**
	 * Returns the meta object for the attribute list '{@link mngr.ManagerParameter#getLitteralString <em>Litteral String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral String</em>'.
	 * @see mngr.ManagerParameter#getLitteralString()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EAttribute getManagerParameter_LitteralString();

	/**
	 * Returns the meta object for the attribute list '{@link mngr.ManagerParameter#getLitteralBoolean <em>Litteral Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral Boolean</em>'.
	 * @see mngr.ManagerParameter#getLitteralBoolean()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EAttribute getManagerParameter_LitteralBoolean();

	/**
	 * Returns the meta object for the attribute list '{@link mngr.ManagerParameter#getLitteralUnlimitedNatural <em>Litteral Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral Unlimited Natural</em>'.
	 * @see mngr.ManagerParameter#getLitteralUnlimitedNatural()
	 * @see #getManagerParameter()
	 * @generated
	 */
	EAttribute getManagerParameter_LitteralUnlimitedNatural();

	/**
	 * Returns the meta object for class '{@link mngr.ManagedElement <em>Managed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Managed Element</em>'.
	 * @see mngr.ManagedElement
	 * @generated
	 */
	EClass getManagedElement();

	/**
	 * Returns the meta object for the container reference '{@link mngr.ManagedElement#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see mngr.ManagedElement#getOwningManager()
	 * @see #getManagedElement()
	 * @generated
	 */
	EReference getManagedElement_OwningManager();

	/**
	 * Returns the meta object for the attribute '{@link mngr.ManagedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mngr.ManagedElement#getDescription()
	 * @see #getManagedElement()
	 * @generated
	 */
	EAttribute getManagedElement_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MngrFactory getMngrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mngr.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mngr.impl.ManagerImpl
		 * @see mngr.impl.MngrPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__OWNED_STATE = eINSTANCE.getManager_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__INITIAL_STATE = eINSTANCE.getManager_InitialState();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__FINAL_STATE = eINSTANCE.getManager_FinalState();

		/**
		 * The meta object literal for the '<em><b>Context Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__CONTEXT_PARAMETERS = eINSTANCE.getManager_ContextParameters();

		/**
		 * The meta object literal for the '<em><b>Managed Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__MANAGED_ELEMENT = eINSTANCE.getManager_ManagedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__OWNED_TRANSITION = eINSTANCE.getManager_OwnedTransition();

		/**
		 * The meta object literal for the '{@link mngr.impl.ManagerStateImpl <em>Manager State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mngr.impl.ManagerStateImpl
		 * @see mngr.impl.MngrPackageImpl#getManagerState()
		 * @generated
		 */
		EClass MANAGER_STATE = eINSTANCE.getManagerState();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_STATE__OWNING_MANAGER = eINSTANCE.getManagerState_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_STATE__OUTGOING_TRANSITION = eINSTANCE.getManagerState_OutgoingTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_STATE__INCOMING_TRANSITION = eINSTANCE.getManagerState_IncomingTransition();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_STATE__IS_START = eINSTANCE.getManagerState_IsStart();

		/**
		 * The meta object literal for the '<em><b>Is End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_STATE__IS_END = eINSTANCE.getManagerState_IsEnd();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_STATE__PROB = eINSTANCE.getManagerState_Prob();

		/**
		 * The meta object literal for the '<em><b>Context Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_STATE__CONTEXT_PARAMETERS = eINSTANCE.getManagerState_ContextParameters();

		/**
		 * The meta object literal for the '{@link mngr.impl.ManagerTransitionImpl <em>Manager Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mngr.impl.ManagerTransitionImpl
		 * @see mngr.impl.MngrPackageImpl#getManagerTransition()
		 * @generated
		 */
		EClass MANAGER_TRANSITION = eINSTANCE.getManagerTransition();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_TRANSITION__OWNING_MANAGER = eINSTANCE.getManagerTransition_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_TRANSITION__SOURCE = eINSTANCE.getManagerTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_TRANSITION__TARGET = eINSTANCE.getManagerTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_TRANSITION__INPUT = eINSTANCE.getManagerTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_TRANSITION__OUTPUT = eINSTANCE.getManagerTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Trans Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_TRANSITION__TRANS_PROB = eINSTANCE.getManagerTransition_TransProb();

		/**
		 * The meta object literal for the '<em><b>Trans Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_TRANSITION__TRANS_RATE = eINSTANCE.getManagerTransition_TransRate();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_TRANSITION__EVENT = eINSTANCE.getManagerTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_TRANSITION__CONDITION = eINSTANCE.getManagerTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_TRANSITION__ACTION = eINSTANCE.getManagerTransition_Action();

		/**
		 * The meta object literal for the '{@link mngr.impl.ManagerParameterImpl <em>Manager Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mngr.impl.ManagerParameterImpl
		 * @see mngr.impl.MngrPackageImpl#getManagerParameter()
		 * @generated
		 */
		EClass MANAGER_PARAMETER = eINSTANCE.getManagerParameter();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_PARAMETER__STATE = eINSTANCE.getManagerParameter_State();

		/**
		 * The meta object literal for the '<em><b>Opaque Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_PARAMETER__OPAQUE_EXPRESSIONS = eINSTANCE.getManagerParameter_OpaqueExpressions();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER_PARAMETER__OWNING_MANAGER = eINSTANCE.getManagerParameter_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_PARAMETER__IS_INPUT = eINSTANCE.getManagerParameter_IsInput();

		/**
		 * The meta object literal for the '<em><b>Litteral Integer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_PARAMETER__LITTERAL_INTEGER = eINSTANCE.getManagerParameter_LitteralInteger();

		/**
		 * The meta object literal for the '<em><b>Litteral String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_PARAMETER__LITTERAL_STRING = eINSTANCE.getManagerParameter_LitteralString();

		/**
		 * The meta object literal for the '<em><b>Litteral Boolean</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_PARAMETER__LITTERAL_BOOLEAN = eINSTANCE.getManagerParameter_LitteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Litteral Unlimited Natural</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER_PARAMETER__LITTERAL_UNLIMITED_NATURAL = eINSTANCE.getManagerParameter_LitteralUnlimitedNatural();

		/**
		 * The meta object literal for the '{@link mngr.impl.ManagedElementImpl <em>Managed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mngr.impl.ManagedElementImpl
		 * @see mngr.impl.MngrPackageImpl#getManagedElement()
		 * @generated
		 */
		EClass MANAGED_ELEMENT = eINSTANCE.getManagedElement();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGED_ELEMENT__OWNING_MANAGER = eINSTANCE.getManagedElement_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_ELEMENT__DESCRIPTION = eINSTANCE.getManagedElement_Description();

	}

} //MngrPackage
