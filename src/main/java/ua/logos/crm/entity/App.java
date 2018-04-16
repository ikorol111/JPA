package ua.logos.crm.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("mysql");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		em.getTransaction().begin();
		
//		TeatcerDetails teatcerDetails = new TeatcerDetails();
//		teatcerDetails.setEmail("Teatcher@com");
//		teatcerDetails.setHobby("Programing");
//		em.persist(teatcerDetails);
//		
//		
//		Teatcher teatcher = new Teatcher();
//		teatcher.setFirstName("Jone");
//		teatcher.setLastName("Gon");
//		teatcher.setAge(25);
//		teatcher.setTeatcerDetails(teatcerDetails);
////		em.persist(teatcher);
//		em.persist(teatcher);

//		Teatcher teatcher = em.find(Teatcher.class, 1);
//		System.out.println("Teatcher: " + teatcher.getId() + " " + teatcher.getFirstName());
		

		
		
		em.getTransaction().commit();
		
		em.close();
		entityManagerFactory.close();
	}

}
