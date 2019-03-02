package rand.TestProject;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import rand.TestProject.domain.Employee;
import rand.TestProject.domain.EmployeeBeam;

public class OnePage extends Window{
	
	private static final long serialVersionUID = 1L;
	//private Grid<EmployeeBeam> grid = new Grid<>();

	public OnePage() {
		HorizontalLayout horizontalLayout_init = new HorizontalLayout();
		VerticalLayout layout_1 = new VerticalLayout();
		horizontalLayout_init.addComponent(layout_1);
		
		//layout for grid
		HorizontalLayout layout_2 = new HorizontalLayout();
		layout_1.addComponent(layout_2);
		layout_2.addComponent(this.createTable());
		
		/*
		//label text 
		Label insertName = new Label("insert a name");
		insertName.setVisible(true);
		layout_2.addComponent(insertName);
		
		
		//label text 
				Label insertName2 = new Label(this.getFromJPA(1));
				insertName.setVisible(true);
				layout_2.addComponent(insertName2);
				
				*/
		//this.addComponent(horizontalLayout_init);
	}
	
	private Table createTable() {
		//BeanContainer<Integer, EmployeeBeam> a = new BeanContainer<Integer, EmployeeBeam>(EmployeeBeam.class);
		//a.setBeanIdProperty("eid");
		//a.addBean(new EmployeeBeam("veronika", 123.8, "ne6to"));
		/*BeanContainer beans = new BeanContainer(EmployeeBeam.class);
		beans.setBeanIdProperty("name");
		beans.addBean(new EmployeeBeam("veronika", 123.8, "ne6to"));
		beans.addBean(new EmployeeBeam("gasan", 123.8, "ne6to"));
		
		Table table = new Table("Table", beans);
		//table.setWidth("300px");
		table.setHeight("200px");
		table.setVisibleColumns(new Object[]{"name","surname", "osUsed.os"});
		table.setVisible(true);*/
		
		
		
		return null;
		
	}
	
	private String getFromJPA(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rand.TestProject");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee = em.find(Employee.class, id);
		
		return "The employee is: " + employee.getEid() + " " + employee.getEname(); 
	}
}
