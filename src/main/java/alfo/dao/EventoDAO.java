package alfo.dao;

import alfo.entities.Evento;
import alfo.exeptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {

    private final EntityManager entityManager;

    public EventoDAO(EntityManager em) {
        this.entityManager = em;
    }

    public void save(Evento eventoDaSalvare) {

//        1. chiediamo all entity manager di creare una trasazione
        EntityTransaction transaction = entityManager.getTransaction();
//        2. facciamo partire la transizione
        transaction.begin();
//        3. Aggiungiamo eventoDaSalvare al Persistence Context tramite metodo .persist() dell'Entity Manager (l'oggetto eventoDaSalvare diventa MANAGED ma
//		// non è ancora parte del database)
        entityManager.persist(eventoDaSalvare);

// 4. Per rendere effettivamente eventoDaSalvare una nuova riga della tabella, bisogna fare un'operazione di commit tramite la transazione
        transaction.commit();
// 5. log di salvataggio
        System.out.println("l'evento " + eventoDaSalvare.getTitolo() + " è stato salvato correttamente ");


    }

    public Evento getById(long eventoId) {
       Evento found = entityManager.find(Evento.class, eventoId);
       if(found == null) throw new NotFoundException(eventoId);
       return found;
    }


public void findIdAndDelete(long eventoId){
        Evento found = this.getById(eventoId);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(found);
        transaction.commit();
    System.out.println("l'evento " + eventoId + " è stato rimosso");
}

}
