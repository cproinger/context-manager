/*
 * 
 */
package mngr.diagram.edit.commands;

import mngr.ManagerParameter;
import mngr.diagram.edit.policies.MngrBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import exp.OpaqueExpression;

/**
 * @generated
 */
public class ManagerParameterOpaqueExpressionsReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ManagerParameterOpaqueExpressionsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof ManagerParameter) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof OpaqueExpression && newEnd instanceof ManagerParameter)) {
			return false;
		}
		return MngrBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistManagerParameterOpaqueExpressions_4003(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof OpaqueExpression && newEnd instanceof OpaqueExpression)) {
			return false;
		}
		return MngrBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistManagerParameterOpaqueExpressions_4003(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getOpaqueExpressions().remove(getOldTarget());
		getNewSource().getOpaqueExpressions().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getOpaqueExpressions().remove(getOldTarget());
		getOldSource().getOpaqueExpressions().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ManagerParameter getOldSource() {
		return (ManagerParameter) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ManagerParameter getNewSource() {
		return (ManagerParameter) newEnd;
	}

	/**
	 * @generated
	 */
	protected OpaqueExpression getOldTarget() {
		return (OpaqueExpression) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OpaqueExpression getNewTarget() {
		return (OpaqueExpression) newEnd;
	}
}
