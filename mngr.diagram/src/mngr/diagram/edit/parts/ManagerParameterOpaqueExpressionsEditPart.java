package mngr.diagram.edit.parts;

import mngr.diagram.edit.policies.ManagerParameterOpaqueExpressionsItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ManagerParameterOpaqueExpressionsEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public ManagerParameterOpaqueExpressionsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ManagerParameterOpaqueExpressionsItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ManagerParameterOpaqueExpressionsFigure();
	}

	/**
	 * @generated
	 */
	public ManagerParameterOpaqueExpressionsFigure getPrimaryShape() {
		return (ManagerParameterOpaqueExpressionsFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ManagerParameterOpaqueExpressionsFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ManagerParameterOpaqueExpressionsFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 97, 94, 63);

}
