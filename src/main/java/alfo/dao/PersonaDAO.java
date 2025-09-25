package alfo.dao;

import alfo.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersonaDAO {
    private final EntityManager entityManager;


    public PersonaDAO ( EntityManager em){
        this.entityManager = em;
    }

    public void save(Persona personaDaSalvare){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(personaDaSalvare);
        transaction.commit();
        System.out.println("la persona " + personaDaSalvare.getNome() + " " + personaDaSalvare.getCognome() + " è stata salvata");
    }












}
