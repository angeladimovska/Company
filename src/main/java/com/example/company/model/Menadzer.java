package com.example.company.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "embg_menadzer")
public class Menadzer extends Chovek {

    public Menadzer() {
    }

    public Menadzer(String embg, String ime, String prezime) {
        super(embg, ime, prezime);
    }
}
