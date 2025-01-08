package io.mohit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PokemonsInitiatorUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("rohan");
	     EntityManager entitymanager = entitymanagerfactory.createEntityManager();
	     EntityTransaction entitytransaction = entitymanager.getTransaction();
	     Pokemons p = entitymanager.find(Pokemons.class, "Meowth");
	     
	     if(p!=null) {
	    	 
	    	 p.setPower(150);
	    	 p.setName("Neon");
	    	 
	    	 entitytransaction.begin();
	    	 entitymanager.persist(p);
	    	 entitytransaction.commit();
	     }else {
	    	 System.out.println("No such entry found");
	     }
	        
	}

}
