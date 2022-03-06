package com.example.company.model.views;

import com.example.company.model.Developer_raboti_na_proekt;
import com.example.company.model.compositeKeys.ProektiId;
import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Immutable
@Table(name = "proekti")
@IdClass(ProektiId.class)
public class Proekti {

    @Id
    public Integer id_proekt;

    @Column(name = "ime_proekt")
    public String name;

    public LocalDate datum_pocetok;
    public LocalDate datum_kraj;

    @Id
    public String embg;

    public String ime_developer;
    public String prezime_developer;
    public LocalDate raboti_od;
    public LocalDate raboti_do;

    public Proekti() {}

    public Proekti(Integer id_proekt, String name, LocalDate datum_pocetok, LocalDate datum_kraj, String embg, String ime_developer, String prezime_developer, LocalDate raboti_od, LocalDate raboti_do) {
        this.id_proekt = id_proekt;
        this.name = name;
        this.datum_pocetok = datum_pocetok;
        this.datum_kraj = datum_kraj;
        this.embg = embg;
        this.ime_developer = ime_developer;
        this.prezime_developer = prezime_developer;
        this.raboti_od = raboti_od;
        this.raboti_do = raboti_do;
    }
}
