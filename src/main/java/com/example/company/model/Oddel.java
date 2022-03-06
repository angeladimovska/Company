package com.example.company.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Oddel {
    //id_oddel ime_oddel embg_menadzer
    @Id
    private Integer id_oddel;

    @NonNull
    private String ime_oddel;

    @NonNull
    private String embg_menadzer;

    public Oddel() {
    }

    public Oddel(Integer id_oddel, String ime_oddel, String embg_menadzer) {
        this.id_oddel = id_oddel;
        this.ime_oddel = ime_oddel;
        this.embg_menadzer = embg_menadzer;
    }
}