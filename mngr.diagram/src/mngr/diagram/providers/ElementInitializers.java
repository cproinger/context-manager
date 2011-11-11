/*
 * 
 */
package mngr.diagram.providers;

import mngr.diagram.part.MngrDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MngrDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MngrDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
