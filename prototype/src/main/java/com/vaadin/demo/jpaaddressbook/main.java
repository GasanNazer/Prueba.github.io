package com.vaadin.demo.jpaaddressbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.vaadin.demo.jpaaddressbook.domain.Name;

public class main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("addressbook");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Name name = new Name(1, "Gasan");
        
        em.persist( name );
        em.getTransaction( ).commit( );
        
        System.out.println(name.getName() + "  created.");
        em.close( );
        emf.close( );
	}
	

}
