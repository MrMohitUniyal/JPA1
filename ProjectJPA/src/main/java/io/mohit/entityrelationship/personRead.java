package io.mohit.entityrelationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class personRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("rohit");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Person p = entitymanager.find(Person.class, 7088);
		
		System.out.println(p);
//		Course cc = entitymanager.find(Course.class, 8);
//		
//		System.out.println(cc);
		for(Course c : p.getCourseList()) {
		 System.out.println(c.getCourseName());
	}
	}
}
