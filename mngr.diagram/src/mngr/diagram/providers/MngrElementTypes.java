/*
 * 
 */
package mngr.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import mngr.MngrPackage;
import mngr.diagram.edit.parts.ManagedElementEditPart;
import mngr.diagram.edit.parts.ManagerEditPart;
import mngr.diagram.edit.parts.ManagerParameterEditPart;
import mngr.diagram.edit.parts.ManagerParameterOpaqueExpressionsEditPart;
import mngr.diagram.edit.parts.ManagerStateContextParametersEditPart;
import mngr.diagram.edit.parts.ManagerStateEditPart;
import mngr.diagram.edit.parts.ManagerTransitionEditPart;
import mngr.diagram.edit.parts.OpaqueExpressionEditPart;
import mngr.diagram.part.MngrDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import exp.ExpPackage;

/**
 * @generated
 */
public class MngrElementTypes {

	/**
	 * @generated
	 */
	private MngrElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Manager_1000 = getElementType("mngr.diagram.Manager_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagerState_2001 = getElementType("mngr.diagram.ManagerState_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagerParameter_2002 = getElementType("mngr.diagram.ManagerParameter_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagedElement_2003 = getElementType("mngr.diagram.ManagedElement_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpaqueExpression_2004 = getElementType("mngr.diagram.OpaqueExpression_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagerTransition_4001 = getElementType("mngr.diagram.ManagerTransition_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagerStateContextParameters_4002 = getElementType("mngr.diagram.ManagerStateContextParameters_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ManagerParameterOpaqueExpressions_4003 = getElementType("mngr.diagram.ManagerParameterOpaqueExpressions_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MngrDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Manager_1000, MngrPackage.eINSTANCE.getManager());

			elements.put(ManagerState_2001,
					MngrPackage.eINSTANCE.getManagerState());

			elements.put(ManagerParameter_2002,
					MngrPackage.eINSTANCE.getManagerParameter());

			elements.put(ManagedElement_2003,
					MngrPackage.eINSTANCE.getManagedElement());

			elements.put(OpaqueExpression_2004,
					ExpPackage.eINSTANCE.getOpaqueExpression());

			elements.put(ManagerTransition_4001,
					MngrPackage.eINSTANCE.getManagerTransition());

			elements.put(ManagerStateContextParameters_4002,
					MngrPackage.eINSTANCE.getManagerState_ContextParameters());

			elements.put(ManagerParameterOpaqueExpressions_4003,
					MngrPackage.eINSTANCE
							.getManagerParameter_OpaqueExpressions());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Manager_1000);
			KNOWN_ELEMENT_TYPES.add(ManagerState_2001);
			KNOWN_ELEMENT_TYPES.add(ManagerParameter_2002);
			KNOWN_ELEMENT_TYPES.add(ManagedElement_2003);
			KNOWN_ELEMENT_TYPES.add(OpaqueExpression_2004);
			KNOWN_ELEMENT_TYPES.add(ManagerTransition_4001);
			KNOWN_ELEMENT_TYPES.add(ManagerStateContextParameters_4002);
			KNOWN_ELEMENT_TYPES.add(ManagerParameterOpaqueExpressions_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ManagerEditPart.VISUAL_ID:
			return Manager_1000;
		case ManagerStateEditPart.VISUAL_ID:
			return ManagerState_2001;
		case ManagerParameterEditPart.VISUAL_ID:
			return ManagerParameter_2002;
		case ManagedElementEditPart.VISUAL_ID:
			return ManagedElement_2003;
		case OpaqueExpressionEditPart.VISUAL_ID:
			return OpaqueExpression_2004;
		case ManagerTransitionEditPart.VISUAL_ID:
			return ManagerTransition_4001;
		case ManagerStateContextParametersEditPart.VISUAL_ID:
			return ManagerStateContextParameters_4002;
		case ManagerParameterOpaqueExpressionsEditPart.VISUAL_ID:
			return ManagerParameterOpaqueExpressions_4003;
		}
		return null;
	}

}
