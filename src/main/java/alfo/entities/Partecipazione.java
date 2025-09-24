package alfo.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue
    private UUID partecipazione_id;

    @JoinColumn
    private Persona persona_id;
    @ManyToOne
    @JoinColumn
    private Evento evento_id;
    private stato stato;

@ManyToOne
        @JoinColumn(name = "persona_id")
    Persona persona;
}
