package alfo.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {

    @Id
    @GeneratedValue
    @Column(name = "partecipazione_id")
    private UUID partecipazioneId;
@ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;
    @ManyToOne
    @JoinColumn (name = "evento_id")
    private Evento evento;
    @Enumerated(EnumType.STRING)
    private stato stato;

public Partecipazione(){

}

public Partecipazione(Persona persona,Evento evento, stato stato){
    this.persona = persona;
    this.evento = evento;
    this.stato = stato;
    
}


    public UUID getPartecipazioneId() {
        return partecipazioneId;
    }

    public void setPartecipazioneId(UUID partecipazioneId) {
        this.partecipazioneId = partecipazioneId;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public stato getStato() {
        return stato;
    }

    public void setStato(stato stato) {
        this.stato = stato;
    }
}
