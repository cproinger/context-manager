package mngr.diagram.part;

import java.util.Collections;
import java.util.List;

import mngr.diagram.providers.MngrElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MngrPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createManagedElement1CreationTool());
		paletteContainer.add(createManagerParameter2CreationTool());
		paletteContainer.add(createManagerState3CreationTool());
		paletteContainer.add(createOpaqueExpression4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createManagerParameter1CreationTool());
		paletteContainer.add(createManagerTransition2CreationTool());
		paletteContainer.add(createOpaqueExpression3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createManagedElement1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ManagedElement1CreationTool_title,
				Messages.ManagedElement1CreationTool_desc,
				Collections.singletonList(MngrElementTypes.ManagedElement_2003));
		entry.setId("createManagedElement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MngrDiagramEditorPlugin
				.findImageDescriptor("/mngr.diagram/icons/ManagedElementS.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createManagerParameter2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ManagerParameter2CreationTool_title,
				Messages.ManagerParameter2CreationTool_desc,
				Collections
						.singletonList(MngrElementTypes.ManagerParameter_2002));
		entry.setId("createManagerParameter2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MngrDiagramEditorPlugin
				.findImageDescriptor("/mngr.diagram/icons/ManagerParameterS.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createManagerState3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ManagerState3CreationTool_title,
				Messages.ManagerState3CreationTool_desc,
				Collections.singletonList(MngrElementTypes.ManagerState_2001));
		entry.setId("createManagerState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MngrDiagramEditorPlugin
				.findImageDescriptor("/mngr.diagram/icons/ManagerStateS.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpaqueExpression4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OpaqueExpression4CreationTool_title,
				Messages.OpaqueExpression4CreationTool_desc,
				Collections
						.singletonList(MngrElementTypes.OpaqueExpression_2004));
		entry.setId("createOpaqueExpression4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MngrDiagramEditorPlugin
				.findImageDescriptor("/mngr.diagram/icons/OpaqueExpressionS.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createManagerParameter1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ManagerParameter1CreationTool_title,
				Messages.ManagerParameter1CreationTool_desc,
				Collections
						.singletonList(MngrElementTypes.ManagerStateContextParameters_4002));
		entry.setId("createManagerParameter1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MngrDiagramEditorPlugin
				.findImageDescriptor("/mngr.diagram/icons/ParameterLinkS.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createManagerTransition2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ManagerTransition2CreationTool_title,
				Messages.ManagerTransition2CreationTool_desc,
				Collections
						.singletonList(MngrElementTypes.ManagerTransition_4001));
		entry.setId("createManagerTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MngrDiagramEditorPlugin
				.findImageDescriptor("/mngr.diagram/icons/transitionS.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpaqueExpression3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OpaqueExpression3CreationTool_title,
				Messages.OpaqueExpression3CreationTool_desc,
				Collections
						.singletonList(MngrElementTypes.ManagerParameterOpaqueExpressions_4003));
		entry.setId("createOpaqueExpression3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MngrDiagramEditorPlugin
				.findImageDescriptor("/mngr.diagram/icons/OpaqueExpressionS.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
