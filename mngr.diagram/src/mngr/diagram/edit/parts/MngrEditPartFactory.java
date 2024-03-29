package mngr.diagram.edit.parts;

import mngr.diagram.part.MngrVisualIDRegistry;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class MngrEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MngrVisualIDRegistry.getVisualID(view)) {

			case ManagerEditPart.VISUAL_ID:
				return new ManagerEditPart(view);

			case ManagerStateEditPart.VISUAL_ID:
				return new ManagerStateEditPart(view);

			case ManagerStateNameEditPart.VISUAL_ID:
				return new ManagerStateNameEditPart(view);

			case ManagerParameterEditPart.VISUAL_ID:
				return new ManagerParameterEditPart(view);

			case ManagerParameterNameEditPart.VISUAL_ID:
				return new ManagerParameterNameEditPart(view);

			case ManagedElementEditPart.VISUAL_ID:
				return new ManagedElementEditPart(view);

			case ManagedElementNameEditPart.VISUAL_ID:
				return new ManagedElementNameEditPart(view);

			case OpaqueExpressionEditPart.VISUAL_ID:
				return new OpaqueExpressionEditPart(view);

			case OpaqueExpressionBodyEditPart.VISUAL_ID:
				return new OpaqueExpressionBodyEditPart(view);

			case ManagerTransitionEditPart.VISUAL_ID:
				return new ManagerTransitionEditPart(view);

			case ManagerTransitionTransProbEditPart.VISUAL_ID:
				return new ManagerTransitionTransProbEditPart(view);

			case ManagerTransitionActionEditPart.VISUAL_ID:
				return new ManagerTransitionActionEditPart(view);

			case ManagerTransitionConditionEditPart.VISUAL_ID:
				return new ManagerTransitionConditionEditPart(view);

			case ManagerTransitionEventEditPart.VISUAL_ID:
				return new ManagerTransitionEventEditPart(view);

			case ManagerStateContextParametersEditPart.VISUAL_ID:
				return new ManagerStateContextParametersEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ManagerParameterOpaqueExpressionsEditPart.VISUAL_ID:
				return new ManagerParameterOpaqueExpressionsEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
