package figures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;


public class OpaqueExpressionFigure extends ImageFigure {

	public OpaqueExpressionFigure() { 
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/OpaqueExpression.png").createImage(), 0);
	}

}
