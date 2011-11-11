/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ctxmngr.impl;

import ctxmngr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtxmngrFactoryImpl extends EFactoryImpl implements CtxmngrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CtxmngrFactory init() {
		try {
			CtxmngrFactory theCtxmngrFactory = (CtxmngrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.kermeta.org/ctxmngr"); 
			if (theCtxmngrFactory != null) {
				return theCtxmngrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CtxmngrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxmngrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CtxmngrPackage.CONTEXT_MANAGER: return createContextManager();
			case CtxmngrPackage.CTX_STATE: return createCtxState();
			case CtxmngrPackage.CTX_TRANSITION: return createCtxTransition();
			case CtxmngrPackage.CONTEXT_PARAMETER: return createContextParameter();
			case CtxmngrPackage.REMOTE_FIRING_DEPENDENCY: return createRemoteFiringDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager createContextManager() {
		ContextManagerImpl contextManager = new ContextManagerImpl();
		return contextManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxState createCtxState() {
		CtxStateImpl ctxState = new CtxStateImpl();
		return ctxState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxTransition createCtxTransition() {
		CtxTransitionImpl ctxTransition = new CtxTransitionImpl();
		return ctxTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextParameter createContextParameter() {
		ContextParameterImpl contextParameter = new ContextParameterImpl();
		return contextParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteFiringDependency createRemoteFiringDependency() {
		RemoteFiringDependencyImpl remoteFiringDependency = new RemoteFiringDependencyImpl();
		return remoteFiringDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxmngrPackage getCtxmngrPackage() {
		return (CtxmngrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CtxmngrPackage getPackage() {
		return CtxmngrPackage.eINSTANCE;
	}

} //CtxmngrFactoryImpl
