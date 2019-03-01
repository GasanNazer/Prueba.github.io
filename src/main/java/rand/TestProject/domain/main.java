package rand.TestProject.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
	public static void main(String[] arg) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rand.TestProject");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Employee employee = new Employee( ); 
        employee.setEid( 1201 );
        employee.setEname( "Gopal" );
        employee.setSalary( 40000 );
        employee.setDeg( "Technical Manager" );
        
        em.persist( employee );
        em.getTransaction( ).commit( );

        
        em.close( );
        emf.close( );
	}
}
