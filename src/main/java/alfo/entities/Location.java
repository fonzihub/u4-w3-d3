package alfo.entities;

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


}

