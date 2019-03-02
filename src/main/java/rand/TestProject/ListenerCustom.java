package rand.TestProject;

import java.io.Serializable;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.HorizontalSplitPanel;

import rand.TestProject.ui.BasicCrudView;

public class ListenerCustom implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValueChangeListener getListener(final HorizontalSplitPanel horizontalSplitPanel) {
		
		ValueChangeListener l = new Property.ValueChangeListener() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				@SuppressWarnings("rawtypes")
				BasicCrudView cv = (BasicCrudView) event.getProperty()
						.getValue();
				cv.refreshContainer();
				horizontalSplitPanel.setSecondComponent(cv);
			}
		};
		return l;
	}
}
