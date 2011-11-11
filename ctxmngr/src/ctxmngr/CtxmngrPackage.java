/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr;

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
 * @see ctxmngr.CtxmngrFactory
 * @model kind="package"
 * @generated
 */
public interface CtxmngrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ctxmngr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/ctxmngr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ctxmngr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtxmngrPackage eINSTANCE = ctxmngr.impl.CtxmngrPackageImpl.init();

	/**
	 * The meta object id for the '{@link ctxmngr.impl.ContextManagerImpl <em>Context Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctxmngr.impl.ContextManagerImpl
	 * @see ctxmngr.impl.CtxmngrPackageImpl#getContextManager()
	 * @generated
	 */
	int CONTEXT_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__OWNED_STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__INITIAL_STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__FINAL_STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__CONTEXT_PARAMETERS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Combined Manager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__COMBINED_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Remote Firings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__REMOTE_FIRINGS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__OWNED_TRANSITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Context Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ctxmngr.impl.CtxStateImpl <em>Ctx State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctxmngr.impl.CtxStateImpl
	 * @see ctxmngr.impl.CtxmngrPackageImpl#getCtxState()
	 * @generated
	 */
	int CTX_STATE = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__OUTGOING_TRANSITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__INCOMING_TRANSITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__IS_START = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__IS_END = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__CONTEXT_PARAMETERS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Manager States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE__MANAGER_STATES = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctx State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_STATE_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ctxmngr.impl.CtxTransitionImpl <em>Ctx Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctxmngr.impl.CtxTransitionImpl
	 * @see ctxmngr.impl.CtxmngrPackageImpl#getCtxTransition()
	 * @generated
	 */
	int CTX_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__SOURCE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__TARGET = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__INPUT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__OUTPUT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trans Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__TRANS_PROB = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Manager Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__MANAGER_TRANSITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__ACTION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__EVENT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__CONDITION = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Trans Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__TRANS_RATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION__IS_REMOTE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Ctx Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTX_TRANSITION_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link ctxmngr.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctxmngr.impl.ContextParameterImpl
	 * @see ctxmngr.impl.CtxmngrPackageImpl#getContextParameter()
	 * @generated
	 */
	int CONTEXT_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__STATE = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opaque Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Litteral Integer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__LITTERAL_INTEGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Litteral String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__LITTERAL_STRING = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Litteral Boolean</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__LITTERAL_BOOLEAN = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Litteral Unlimited Natural</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER__IS_INPUT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Context Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PARAMETER_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link ctxmngr.impl.RemoteFiringDependencyImpl <em>Remote Firing Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctxmngr.impl.RemoteFiringDependencyImpl
	 * @see ctxmngr.impl.CtxmngrPackageImpl#getRemoteFiringDependency()
	 * @generated
	 */
	int REMOTE_FIRING_DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__OWNED_ELEMENT = NamedPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__OWNER = NamedPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__NAME = NamedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__QUALIFIED_NAME = NamedPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__NAMESPACE = NamedPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Fired</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__FIRED = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__FIRING = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY__REPRESENTS = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Remote Firing Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FIRING_DEPENDENCY_FEATURE_COUNT = NamedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link ctxmngr.ContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Manager</em>'.
	 * @see ctxmngr.ContextManager
	 * @generated
	 */
	EClass getContextManager();

	/**
	 * Returns the meta object for the containment reference list '{@link ctxmngr.ContextManager#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see ctxmngr.ContextManager#getOwnedState()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_OwnedState();

	/**
	 * Returns the meta object for the reference '{@link ctxmngr.ContextManager#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see ctxmngr.ContextManager#getInitialState()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_InitialState();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.ContextManager#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final State</em>'.
	 * @see ctxmngr.ContextManager#getFinalState()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_FinalState();

	/**
	 * Returns the meta object for the containment reference list '{@link ctxmngr.ContextManager#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Parameters</em>'.
	 * @see ctxmngr.ContextManager#getContextParameters()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_ContextParameters();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.ContextManager#getCombinedManager <em>Combined Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combined Manager</em>'.
	 * @see ctxmngr.ContextManager#getCombinedManager()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_CombinedManager();

	/**
	 * Returns the meta object for the containment reference list '{@link ctxmngr.ContextManager#getRemoteFirings <em>Remote Firings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remote Firings</em>'.
	 * @see ctxmngr.ContextManager#getRemoteFirings()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_RemoteFirings();

	/**
	 * Returns the meta object for the containment reference list '{@link ctxmngr.ContextManager#getOwnedTransition <em>Owned Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transition</em>'.
	 * @see ctxmngr.ContextManager#getOwnedTransition()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_OwnedTransition();

	/**
	 * Returns the meta object for class '{@link ctxmngr.CtxState <em>Ctx State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctx State</em>'.
	 * @see ctxmngr.CtxState
	 * @generated
	 */
	EClass getCtxState();

	/**
	 * Returns the meta object for the container reference '{@link ctxmngr.CtxState#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see ctxmngr.CtxState#getOwningManager()
	 * @see #getCtxState()
	 * @generated
	 */
	EReference getCtxState_OwningManager();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.CtxState#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transition</em>'.
	 * @see ctxmngr.CtxState#getOutgoingTransition()
	 * @see #getCtxState()
	 * @generated
	 */
	EReference getCtxState_OutgoingTransition();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.CtxState#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see ctxmngr.CtxState#getIncomingTransition()
	 * @see #getCtxState()
	 * @generated
	 */
	EReference getCtxState_IncomingTransition();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.CtxState#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see ctxmngr.CtxState#isIsStart()
	 * @see #getCtxState()
	 * @generated
	 */
	EAttribute getCtxState_IsStart();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.CtxState#isIsEnd <em>Is End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is End</em>'.
	 * @see ctxmngr.CtxState#isIsEnd()
	 * @see #getCtxState()
	 * @generated
	 */
	EAttribute getCtxState_IsEnd();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.CtxState#getContextParameters <em>Context Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Parameters</em>'.
	 * @see ctxmngr.CtxState#getContextParameters()
	 * @see #getCtxState()
	 * @generated
	 */
	EReference getCtxState_ContextParameters();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.CtxState#getManagerStates <em>Manager States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manager States</em>'.
	 * @see ctxmngr.CtxState#getManagerStates()
	 * @see #getCtxState()
	 * @generated
	 */
	EReference getCtxState_ManagerStates();

	/**
	 * Returns the meta object for class '{@link ctxmngr.CtxTransition <em>Ctx Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctx Transition</em>'.
	 * @see ctxmngr.CtxTransition
	 * @generated
	 */
	EClass getCtxTransition();

	/**
	 * Returns the meta object for the container reference '{@link ctxmngr.CtxTransition#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see ctxmngr.CtxTransition#getOwningManager()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EReference getCtxTransition_OwningManager();

	/**
	 * Returns the meta object for the reference '{@link ctxmngr.CtxTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ctxmngr.CtxTransition#getSource()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EReference getCtxTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link ctxmngr.CtxTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ctxmngr.CtxTransition#getTarget()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EReference getCtxTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.CtxTransition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see ctxmngr.CtxTransition#getInput()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.CtxTransition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see ctxmngr.CtxTransition#getOutput()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_Output();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.CtxTransition#getTransProb <em>Trans Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Prob</em>'.
	 * @see ctxmngr.CtxTransition#getTransProb()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_TransProb();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.CtxTransition#getManagerTransition <em>Manager Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manager Transition</em>'.
	 * @see ctxmngr.CtxTransition#getManagerTransition()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EReference getCtxTransition_ManagerTransition();

	/**
	 * Returns the meta object for the attribute list '{@link ctxmngr.CtxTransition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action</em>'.
	 * @see ctxmngr.CtxTransition#getAction()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_Action();

	/**
	 * Returns the meta object for the attribute list '{@link ctxmngr.CtxTransition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event</em>'.
	 * @see ctxmngr.CtxTransition#getEvent()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_Event();

	/**
	 * Returns the meta object for the attribute list '{@link ctxmngr.CtxTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Condition</em>'.
	 * @see ctxmngr.CtxTransition#getCondition()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.CtxTransition#getTransRate <em>Trans Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Rate</em>'.
	 * @see ctxmngr.CtxTransition#getTransRate()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_TransRate();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.CtxTransition#isIsRemote <em>Is Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remote</em>'.
	 * @see ctxmngr.CtxTransition#isIsRemote()
	 * @see #getCtxTransition()
	 * @generated
	 */
	EAttribute getCtxTransition_IsRemote();

	/**
	 * Returns the meta object for class '{@link ctxmngr.ContextParameter <em>Context Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Parameter</em>'.
	 * @see ctxmngr.ContextParameter
	 * @generated
	 */
	EClass getContextParameter();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.ContextParameter#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>State</em>'.
	 * @see ctxmngr.ContextParameter#getState()
	 * @see #getContextParameter()
	 * @generated
	 */
	EReference getContextParameter_State();

	/**
	 * Returns the meta object for the containment reference list '{@link ctxmngr.ContextParameter#getOpaqueExpressions <em>Opaque Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opaque Expressions</em>'.
	 * @see ctxmngr.ContextParameter#getOpaqueExpressions()
	 * @see #getContextParameter()
	 * @generated
	 */
	EReference getContextParameter_OpaqueExpressions();

	/**
	 * Returns the meta object for the container reference '{@link ctxmngr.ContextParameter#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see ctxmngr.ContextParameter#getOwningManager()
	 * @see #getContextParameter()
	 * @generated
	 */
	EReference getContextParameter_OwningManager();

	/**
	 * Returns the meta object for the attribute list '{@link ctxmngr.ContextParameter#getLitteralInteger <em>Litteral Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral Integer</em>'.
	 * @see ctxmngr.ContextParameter#getLitteralInteger()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_LitteralInteger();

	/**
	 * Returns the meta object for the attribute list '{@link ctxmngr.ContextParameter#getLitteralString <em>Litteral String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral String</em>'.
	 * @see ctxmngr.ContextParameter#getLitteralString()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_LitteralString();

	/**
	 * Returns the meta object for the attribute list '{@link ctxmngr.ContextParameter#getLitteralBoolean <em>Litteral Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral Boolean</em>'.
	 * @see ctxmngr.ContextParameter#getLitteralBoolean()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_LitteralBoolean();

	/**
	 * Returns the meta object for the attribute list '{@link ctxmngr.ContextParameter#getLitteralUnlimitedNatural <em>Litteral Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Litteral Unlimited Natural</em>'.
	 * @see ctxmngr.ContextParameter#getLitteralUnlimitedNatural()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_LitteralUnlimitedNatural();

	/**
	 * Returns the meta object for the attribute '{@link ctxmngr.ContextParameter#isIsInput <em>Is Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Input</em>'.
	 * @see ctxmngr.ContextParameter#isIsInput()
	 * @see #getContextParameter()
	 * @generated
	 */
	EAttribute getContextParameter_IsInput();

	/**
	 * Returns the meta object for class '{@link ctxmngr.RemoteFiringDependency <em>Remote Firing Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Firing Dependency</em>'.
	 * @see ctxmngr.RemoteFiringDependency
	 * @generated
	 */
	EClass getRemoteFiringDependency();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.RemoteFiringDependency#getFired <em>Fired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fired</em>'.
	 * @see ctxmngr.RemoteFiringDependency#getFired()
	 * @see #getRemoteFiringDependency()
	 * @generated
	 */
	EReference getRemoteFiringDependency_Fired();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.RemoteFiringDependency#getFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Firing</em>'.
	 * @see ctxmngr.RemoteFiringDependency#getFiring()
	 * @see #getRemoteFiringDependency()
	 * @generated
	 */
	EReference getRemoteFiringDependency_Firing();

	/**
	 * Returns the meta object for the container reference '{@link ctxmngr.RemoteFiringDependency#getOwningManager <em>Owning Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Manager</em>'.
	 * @see ctxmngr.RemoteFiringDependency#getOwningManager()
	 * @see #getRemoteFiringDependency()
	 * @generated
	 */
	EReference getRemoteFiringDependency_OwningManager();

	/**
	 * Returns the meta object for the reference list '{@link ctxmngr.RemoteFiringDependency#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Represents</em>'.
	 * @see ctxmngr.RemoteFiringDependency#getRepresents()
	 * @see #getRemoteFiringDependency()
	 * @generated
	 */
	EReference getRemoteFiringDependency_Represents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CtxmngrFactory getCtxmngrFactory();

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
		 * The meta object literal for the '{@link ctxmngr.impl.ContextManagerImpl <em>Context Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctxmngr.impl.ContextManagerImpl
		 * @see ctxmngr.impl.CtxmngrPackageImpl#getContextManager()
		 * @generated
		 */
		EClass CONTEXT_MANAGER = eINSTANCE.getContextManager();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__OWNED_STATE = eINSTANCE.getContextManager_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__INITIAL_STATE = eINSTANCE.getContextManager_InitialState();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__FINAL_STATE = eINSTANCE.getContextManager_FinalState();

		/**
		 * The meta object literal for the '<em><b>Context Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__CONTEXT_PARAMETERS = eINSTANCE.getContextManager_ContextParameters();

		/**
		 * The meta object literal for the '<em><b>Combined Manager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__COMBINED_MANAGER = eINSTANCE.getContextManager_CombinedManager();

		/**
		 * The meta object literal for the '<em><b>Remote Firings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__REMOTE_FIRINGS = eINSTANCE.getContextManager_RemoteFirings();

		/**
		 * The meta object literal for the '<em><b>Owned Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__OWNED_TRANSITION = eINSTANCE.getContextManager_OwnedTransition();

		/**
		 * The meta object literal for the '{@link ctxmngr.impl.CtxStateImpl <em>Ctx State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctxmngr.impl.CtxStateImpl
		 * @see ctxmngr.impl.CtxmngrPackageImpl#getCtxState()
		 * @generated
		 */
		EClass CTX_STATE = eINSTANCE.getCtxState();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_STATE__OWNING_MANAGER = eINSTANCE.getCtxState_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_STATE__OUTGOING_TRANSITION = eINSTANCE.getCtxState_OutgoingTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_STATE__INCOMING_TRANSITION = eINSTANCE.getCtxState_IncomingTransition();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_STATE__IS_START = eINSTANCE.getCtxState_IsStart();

		/**
		 * The meta object literal for the '<em><b>Is End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_STATE__IS_END = eINSTANCE.getCtxState_IsEnd();

		/**
		 * The meta object literal for the '<em><b>Context Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_STATE__CONTEXT_PARAMETERS = eINSTANCE.getCtxState_ContextParameters();

		/**
		 * The meta object literal for the '<em><b>Manager States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_STATE__MANAGER_STATES = eINSTANCE.getCtxState_ManagerStates();

		/**
		 * The meta object literal for the '{@link ctxmngr.impl.CtxTransitionImpl <em>Ctx Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctxmngr.impl.CtxTransitionImpl
		 * @see ctxmngr.impl.CtxmngrPackageImpl#getCtxTransition()
		 * @generated
		 */
		EClass CTX_TRANSITION = eINSTANCE.getCtxTransition();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_TRANSITION__OWNING_MANAGER = eINSTANCE.getCtxTransition_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_TRANSITION__SOURCE = eINSTANCE.getCtxTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_TRANSITION__TARGET = eINSTANCE.getCtxTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__INPUT = eINSTANCE.getCtxTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__OUTPUT = eINSTANCE.getCtxTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Trans Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__TRANS_PROB = eINSTANCE.getCtxTransition_TransProb();

		/**
		 * The meta object literal for the '<em><b>Manager Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CTX_TRANSITION__MANAGER_TRANSITION = eINSTANCE.getCtxTransition_ManagerTransition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__ACTION = eINSTANCE.getCtxTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__EVENT = eINSTANCE.getCtxTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__CONDITION = eINSTANCE.getCtxTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Trans Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__TRANS_RATE = eINSTANCE.getCtxTransition_TransRate();

		/**
		 * The meta object literal for the '<em><b>Is Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CTX_TRANSITION__IS_REMOTE = eINSTANCE.getCtxTransition_IsRemote();

		/**
		 * The meta object literal for the '{@link ctxmngr.impl.ContextParameterImpl <em>Context Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctxmngr.impl.ContextParameterImpl
		 * @see ctxmngr.impl.CtxmngrPackageImpl#getContextParameter()
		 * @generated
		 */
		EClass CONTEXT_PARAMETER = eINSTANCE.getContextParameter();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETER__STATE = eINSTANCE.getContextParameter_State();

		/**
		 * The meta object literal for the '<em><b>Opaque Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETER__OPAQUE_EXPRESSIONS = eINSTANCE.getContextParameter_OpaqueExpressions();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PARAMETER__OWNING_MANAGER = eINSTANCE.getContextParameter_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Litteral Integer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__LITTERAL_INTEGER = eINSTANCE.getContextParameter_LitteralInteger();

		/**
		 * The meta object literal for the '<em><b>Litteral String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__LITTERAL_STRING = eINSTANCE.getContextParameter_LitteralString();

		/**
		 * The meta object literal for the '<em><b>Litteral Boolean</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__LITTERAL_BOOLEAN = eINSTANCE.getContextParameter_LitteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Litteral Unlimited Natural</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__LITTERAL_UNLIMITED_NATURAL = eINSTANCE.getContextParameter_LitteralUnlimitedNatural();

		/**
		 * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_PARAMETER__IS_INPUT = eINSTANCE.getContextParameter_IsInput();

		/**
		 * The meta object literal for the '{@link ctxmngr.impl.RemoteFiringDependencyImpl <em>Remote Firing Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctxmngr.impl.RemoteFiringDependencyImpl
		 * @see ctxmngr.impl.CtxmngrPackageImpl#getRemoteFiringDependency()
		 * @generated
		 */
		EClass REMOTE_FIRING_DEPENDENCY = eINSTANCE.getRemoteFiringDependency();

		/**
		 * The meta object literal for the '<em><b>Fired</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_FIRING_DEPENDENCY__FIRED = eINSTANCE.getRemoteFiringDependency_Fired();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_FIRING_DEPENDENCY__FIRING = eINSTANCE.getRemoteFiringDependency_Firing();

		/**
		 * The meta object literal for the '<em><b>Owning Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_FIRING_DEPENDENCY__OWNING_MANAGER = eINSTANCE.getRemoteFiringDependency_OwningManager();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_FIRING_DEPENDENCY__REPRESENTS = eINSTANCE.getRemoteFiringDependency_Represents();

	}

} //CtxmngrPackage
