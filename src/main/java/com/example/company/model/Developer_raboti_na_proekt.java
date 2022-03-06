package com.example.company.model;

import com.example.company.model.compositeKeys.DeveloperProektId;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Data
@Entity
@IdClass(DeveloperProektId.class)
public class Developer_raboti_na_proekt {

    @Id
    @JoinColumn(name="embg_developer")
    @OneToOne(fetch = FetchType.LAZY)
    private Developer embg_developer;

    @Id
    @JoinColumn(name="id_proekt")
    @OneToOne(fetch = FetchType.LAZY)
    private Proekt id_proekt;

    private LocalDate raboti_od;

    private LocalDate raboti_do;

    public Developer_raboti_na_proekt() {
    }


    public Developer_raboti_na_proekt(Developer embg_developer, Proekt id_proekt, LocalDate raboti_od, LocalDate raboti_do) {
        this.embg_developer = embg_developer;
        this.id_proekt = id_proekt;
        this.raboti_od = raboti_od;
        this.raboti_do = raboti_do;
    }
}
