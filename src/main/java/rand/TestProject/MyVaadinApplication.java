package rand.TestProject;

import com.vaadin.Application;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinApplication extends Application {
	private static final long serialVersionUID = 1L;
	
	public static final String PERSISTENCE_UNIT = "rand.TestProject";

	@Override
	public void init() {
		//setMainWindow(new AutoCrudView(PERSISTENCE_UNIT));
		//Window main = new Window("Hello world");
		//HorizontalSplitPanel p = new HorizontalSplitPanel();
		//p.setSplitPosition(200,
		//		HorizontalSplitPanel.UNITS_PIXELS);
		//Label l = new Label("ne6to");
		//HorizontalLayout h = new HorizontalLayout();
		//h.addComponent(l);
		//main.addComponent(h);
		//main.addComponent(p);
		setMainWindow(new OnePage());
	}

	

	/*static {
		EntityManager em = JPAContainerFactory
				.createEntityManagerForPersistenceUnit(PERSISTENCE_UNIT);

		long size = (Long) em.createQuery("SELECT COUNT(p) FROM Person p").getSingleResult();
		if (size == 0) {
			// create two Person objects as test data

			em.getTransaction().begin();
			Person boss = new Person();
			boss.setFirstName("John");
			boss.setLastName("Bigboss");
			boss.setCity("Turku");
			boss.setPhoneNumber("+358 02 555 221");
			boss.setZipCode("20200");
			boss.setStreet("Ruukinkatu 2-4");
			em.persist(boss);

			Person p = new Person();
			p.setFirstName("Marc");
			p.setLastName("Hardworker");
			p.setCity("Turku");
			p.setPhoneNumber("+358 02 555 222");
			p.setZipCode("20200");
			p.setStreet("Ruukinkatu 2-4");
			p.setBoss(boss);
			em.persist(p);

			em.getTransaction().commit();
		}

	}*/

}
