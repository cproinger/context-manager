package mngr.diagram.navigator;

import mngr.Manager;
import mngr.diagram.edit.parts.ManagedElementEditPart;
import mngr.diagram.edit.parts.ManagedElementNameEditPart;
import mngr.diagram.edit.parts.ManagerEditPart;
import mngr.diagram.edit.parts.ManagerParameterEditPart;
import mngr.diagram.edit.parts.ManagerParameterNameEditPart;
import mngr.diagram.edit.parts.ManagerParameterOpaqueExpressionsEditPart;
import mngr.diagram.edit.parts.ManagerStateContextParametersEditPart;
import mngr.diagram.edit.parts.ManagerStateEditPart;
import mngr.diagram.edit.parts.ManagerStateNameEditPart;
import mngr.diagram.edit.parts.ManagerTransitionEditPart;
import mngr.diagram.edit.parts.ManagerTransitionTransProbEditPart;
import mngr.diagram.edit.parts.OpaqueExpressionBodyEditPart;
import mngr.diagram.edit.parts.OpaqueExpressionEditPart;
import mngr.diagram.part.MngrDiagramEditorPlugin;
import mngr.diagram.part.MngrVisualIDRegistry;
import mngr.diagram.providers.MngrElementTypes;
import mngr.diagram.providers.MngrParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MngrNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MngrDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MngrDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MngrNavigatorItem
				&& !isOwnView(((MngrNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MngrNavigatorGroup) {
			MngrNavigatorGroup group = (MngrNavigatorGroup) element;
			return MngrDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MngrNavigatorItem) {
			MngrNavigatorItem navigatorItem = (MngrNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MngrVisualIDRegistry.getVisualID(view)) {
		case ManagerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.kermeta.org/mngr?Manager", MngrElementTypes.Manager_1000); //$NON-NLS-1$
		case ManagerStateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/mngr?ManagerState", MngrElementTypes.ManagerState_2001); //$NON-NLS-1$
		case ManagerParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/mngr?ManagerParameter", MngrElementTypes.ManagerParameter_2002); //$NON-NLS-1$
		case ManagedElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/mngr?ManagedElement", MngrElementTypes.ManagedElement_2003); //$NON-NLS-1$
		case OpaqueExpressionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kermeta.org/exp?OpaqueExpression", MngrElementTypes.OpaqueExpression_2004); //$NON-NLS-1$
		case ManagerParameterOpaqueExpressionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kermeta.org/mngr?ManagerParameter?opaqueExpressions", MngrElementTypes.ManagerParameterOpaqueExpressions_4003); //$NON-NLS-1$
		case ManagerTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kermeta.org/mngr?ManagerTransition", MngrElementTypes.ManagerTransition_4001); //$NON-NLS-1$
		case ManagerStateContextParametersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kermeta.org/mngr?ManagerState?contextParameters", MngrElementTypes.ManagerStateContextParameters_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MngrDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MngrElementTypes.isKnownElementType(elementType)) {
			image = MngrElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MngrNavigatorGroup) {
			MngrNavigatorGroup group = (MngrNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MngrNavigatorItem) {
			MngrNavigatorItem navigatorItem = (MngrNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MngrVisualIDRegistry.getVisualID(view)) {
		case ManagerEditPart.VISUAL_ID:
			return getManager_1000Text(view);
		case ManagerStateEditPart.VISUAL_ID:
			return getManagerState_2001Text(view);
		case ManagerParameterEditPart.VISUAL_ID:
			return getManagerParameter_2002Text(view);
		case ManagedElementEditPart.VISUAL_ID:
			return getManagedElement_2003Text(view);
		case OpaqueExpressionEditPart.VISUAL_ID:
			return getOpaqueExpression_2004Text(view);
		case ManagerParameterOpaqueExpressionsEditPart.VISUAL_ID:
			return getManagerParameterOpaqueExpressions_4003Text(view);
		case ManagerTransitionEditPart.VISUAL_ID:
			return getManagerTransition_4001Text(view);
		case ManagerStateContextParametersEditPart.VISUAL_ID:
			return getManagerStateContextParameters_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getManager_1000Text(View view) {
		Manager domainModelElement = (Manager) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getManagerState_2001Text(View view) {
		IParser parser = MngrParserProvider.getParser(
				MngrElementTypes.ManagerState_2001,
				view.getElement() != null ? view.getElement() : view,
				MngrVisualIDRegistry
						.getType(ManagerStateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getManagerParameter_2002Text(View view) {
		IParser parser = MngrParserProvider.getParser(
				MngrElementTypes.ManagerParameter_2002,
				view.getElement() != null ? view.getElement() : view,
				MngrVisualIDRegistry
						.getType(ManagerParameterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getManagedElement_2003Text(View view) {
		IParser parser = MngrParserProvider.getParser(
				MngrElementTypes.ManagedElement_2003,
				view.getElement() != null ? view.getElement() : view,
				MngrVisualIDRegistry
						.getType(ManagedElementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOpaqueExpression_2004Text(View view) {
		IParser parser = MngrParserProvider.getParser(
				MngrElementTypes.OpaqueExpression_2004,
				view.getElement() != null ? view.getElement() : view,
				MngrVisualIDRegistry
						.getType(OpaqueExpressionBodyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getManagerParameterOpaqueExpressions_4003Text(View view) {
		IParser parser = MngrParserProvider.getParser(
				MngrElementTypes.ManagerParameterOpaqueExpressions_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getManagerTransition_4001Text(View view) {
		IParser parser = MngrParserProvider.getParser(
				MngrElementTypes.ManagerTransition_4001,
				view.getElement() != null ? view.getElement() : view,
				MngrVisualIDRegistry
						.getType(ManagerTransitionTransProbEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getManagerStateContextParameters_4002Text(View view) {
		IParser parser = MngrParserProvider.getParser(
				MngrElementTypes.ManagerStateContextParameters_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MngrDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ManagerEditPart.MODEL_ID.equals(MngrVisualIDRegistry
				.getModelID(view));
	}

}
