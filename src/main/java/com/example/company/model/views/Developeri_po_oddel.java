package com.example.company.model.views;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Immutable
public class Developeri_po_oddel {
    @Id
    public String embg;
    public String ime_dev;
    public String prezime_dev;

    public Integer id_oddel;

    public String ime_oddel;
    public String ime_menadzer;
    public String prezime_menadzer;

    public Developeri_po_oddel() {
    }
}
