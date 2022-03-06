package com.example.company.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Chovek {
    @Id
    @Column(columnDefinition = "char(13)", length = 13)
    public String embg;

    public String ime;

    public String prezime;

    public Chovek() {
    }

    public Chovek(String embg, String ime, String prezime) {
        this.embg = embg;
        this.ime = ime;
        this.prezime = prezime;
    }
}
