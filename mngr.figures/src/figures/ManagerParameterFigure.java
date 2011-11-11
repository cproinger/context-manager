package figures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;


public class ManagerParameterFigure extends ImageFigure {

	public ManagerParameterFigure() { 
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/ManagerParameter.png").createImage(), 0);
	}

}
