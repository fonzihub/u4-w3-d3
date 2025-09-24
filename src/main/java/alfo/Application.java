package alfo;

import alfo.dao.EventoDAO;
import alfo.entities.Evento;
import alfo.entities.tipoEvento;
import alfo.exeptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.UUID;

public class Application {


    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d3");


    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Evento e1 = new Evento("Concerto Rock", LocalDate.of(2025, 9, 23), "Concerto rock in piazza", tipoEvento.PUBBLICO);
        Evento e2 = new Evento("Fiera del Libro", LocalDate.of(2025, 10, 5), "Evento culturale con scrittori internazionali", tipoEvento.PRIVATO);
        Evento e3 = new Evento("Maratona Cittadina", LocalDate.of(2025, 11, 12), "Gara podistica di beneficenza", tipoEvento.PUBBLICO);


        // gli oggetti nuovi non fanno parte degli oggetti gestiti da EntityManager,
        // bisogna usare il .persist() per rendere gli oggetti MANAGED e quindi committabili nel DB.
//        o viceversa gli oggetti che prendiamo dal DB devono passare comunque tramite il manager.

ed.save(e1);
        ed.save(e2);
        ed.save(e3);

//        try {
//            Evento eFromDb = ed.getById(UUID.fromString("002dcb97-2d4f-4972-85a8-a3af66d7014e"));
//            System.out.println(eFromDb);
//        } catch (NotFoundException ex) {
//            System.out.println((ex.getMessage()));
//        }



//        try {
//            ed.findIdAndDelete(2);
//        } catch (NotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }

        em.close();
        emf.close();
    }


}
