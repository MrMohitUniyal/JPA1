package io.mohit.entityrelationship;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class personCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person  p1 = new Person();
		p1.setName("Mohit");
		p1.setNumber(7088);
		
		Person p2 = new Person();
		p2.setName("Rohit");
		p2.setNumber(9639);
		
		PersonId pi = new PersonId();
		pi.setPanNum(1);
		pi.setLastName("Uniyal");
		
		PersonId pii = new PersonId();
		pii.setPanNum(2);
		pii.setLastName("Uniyal");
		
		p1.setId(pi);
		p2.setId(pii);
		
		
		
	 Course cc1 = new Course();
	 cc1.setCourseName("C Programming");
	 cc1.setCourseid(7);
	 cc1.setPerson(p1);
	 
	 Course cc2 = new Course();
	 cc2.setCourseName("DBMS");
	 cc2.setCourseid(8);
	 cc2.setPerson(p1);
	 
	 
	 p1.setCourseList(List.of(cc1,cc2));
	 p2.setCourseList(List.of(cc1));
		 EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("rohit");
	     EntityManager entitymanager = entitymanagerfactory.createEntityManager();
	     EntityTransaction entitytransaction = entitymanager.getTransaction();
	     
	     entitytransaction.begin();
	     entitymanager.persist(p1);
	     entitymanager.persist(p2);
	     entitymanager.persist(pi);
	     entitymanager.persist(pii);
	     entitymanager.persist(cc1);
	     entitymanager.persist(cc2);
	     entitytransaction.commit();
	     
	     entitymanagerfactory.close();
	     entitymanager.close();
	}

}
