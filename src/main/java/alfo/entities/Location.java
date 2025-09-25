package alfo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue
    private UUID location_id;
    private String location_nome;
    private String location_citta;


public Location(){};
    public Location(String location_nome, String location_citta){
        this.location_nome = location_nome;
        this.location_citta = location_citta;
    }


    public UUID getLocation_id() {
        return location_id;
    }

    public String getLocation_nome() {
        return location_nome;
    }

    public void setLocation_nome(String location_nome) {
        this.location_nome = location_nome;
    }

    public String getLocation_citta() {
        return location_citta;
    }

    public void setLocation_citta(String location_citta) {
        this.location_citta = location_citta;
    }
}

