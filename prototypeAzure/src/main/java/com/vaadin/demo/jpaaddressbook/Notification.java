package com.vaadin.demo.jpaaddressbook;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class Notification extends Window{
	Window a = this;
	
	public Notification(String caption, String text) {
		VerticalLayout horizontalLayout_init = new VerticalLayout();
		horizontalLayout_init.setMargin(true);
		horizontalLayout_init.setHeight("150px");
		horizontalLayout_init.setWidth("300px");
		horizontalLayout_init.setCaption(caption);
		horizontalLayout_init.setVisible(true);
		
		Label l = new Label(text);
		l.setVisible(true);
		
		Button b = new Button("OK");
		b.setVisible(true);
		b.addClickListener(e->{
			a.close();
		});
		
		horizontalLayout_init.addComponent(l);
		horizontalLayout_init.setComponentAlignment(l, Alignment.BOTTOM_CENTER);
		horizontalLayout_init.addComponent(b);
		horizontalLayout_init.setComponentAlignment(b, Alignment.BOTTOM_CENTER);
		this.setClosable(false);
		this.setResizable(false);
		this.setContent(horizontalLayout_init);
		this.center();
		setModal(true);
	}
}
