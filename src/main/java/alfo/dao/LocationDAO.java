package alfo.dao;

import alfo.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    private final EntityManager entityManager;


    public LocationDAO(EntityManager em){
        this.entityManager = em;
    }

    public void save(Location locationDaSalvare){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(locationDaSalvare);
        transaction.commit();
        System.out.println("la location " + locationDaSalvare.getLocation_nome() + " è stata salvata");


    }






}
