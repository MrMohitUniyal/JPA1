package io.mohit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PokemonsInitiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("rohan");
	      EntityManager entitymanager = entitymanagerfactory.createEntityManager();
	      Pokemons p = entitymanager.find(Pokemons.class , "Pikachu");
	      
	      
	      System.out.println(p);
	      
	}

}
