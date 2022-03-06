package com.example.company.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Developer extends Chovek{


    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id_oddel")
    private Oddel oddel;

    public Developer(String embg, String ime, String prezime, Oddel oddel) {
        super(embg, ime, prezime);
        this.oddel=oddel;
    }

    public Developer() {
    }
}
