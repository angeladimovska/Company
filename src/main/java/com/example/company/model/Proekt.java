package com.example.company.model;

import ch.qos.logback.core.net.server.Client;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
public class Proekt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proekt;

    private String ime_proekt;

    private LocalDate datum_pocetok;

    private LocalDate datum_kraj;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_klient")
    private Klient klient;

    public Proekt(String ime_proekt, LocalDate datum_pocetok, LocalDate datum_kraj, Klient klient) {
      //  this.id_proekt = id_proekt;
        this.ime_proekt = ime_proekt;
        this.datum_pocetok = datum_pocetok;
        this.datum_kraj = datum_kraj;
        this.klient=klient;
    }


    public Proekt() {
    }
}
