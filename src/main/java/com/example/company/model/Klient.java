package com.example.company.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Klient {
    @Id
    public Integer id_klient;

    public String ime_firma;
    public String ulica;
    public Integer broj;
    public Integer id_odgovoren;

    public Klient() {
    }
}
