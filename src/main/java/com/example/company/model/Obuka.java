package com.example.company.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@Entity
public class Obuka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_obuka;

    private String opis;

    private Date datum_obuka;

    public Obuka() {
    }

    public Obuka(String opis, Date datum_obuka) {
        this.opis = opis;
        this.datum_obuka = datum_obuka;
    }
}
