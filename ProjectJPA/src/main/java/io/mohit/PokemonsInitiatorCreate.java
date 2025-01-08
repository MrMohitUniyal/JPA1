package io.mohit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PokemonsInitiatorCreate {

    public static void main(String[] args) {
        // Create Pokemons objects and assign primary key (name) for each
        Pokemons p1 = new Pokemons();
        p1.setName("Pikachu");  // Primary key assigned
        p1.setPower(100);
        p1.setType("Electrical");
        p1.setColor(Color.Yellow);

        Pokemons p2 = new Pokemons();
        p2.setName("Charmander");  // Primary key assigned
        p2.setPower(200);
        p2.setType("Fire");
        p2.setColor(Color.Green);

        Pokemons p3 = new Pokemons();
        p3.setName("Meowth");  // Primary key assigned
        p3.setPower(80);
        p3.setType("Wind");
        p3.setColor(Color.red);

        // Set up EntityManager and begin transaction
        EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("rohan");
        EntityManager entitymanager = entitymanagerfactory.createEntityManager();
        EntityTransaction entitytransaction = entitymanager.getTransaction();
        
        entitytransaction.begin();
        entitymanager.persist(p1);
        entitymanager.persist(p2);
        entitymanager.persist(p3);
        entitytransaction.commit();
        
        // Clean up EntityManager
        entitymanager.close();
        entitymanagerfactory.close();
    }
}
