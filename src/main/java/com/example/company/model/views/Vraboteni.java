package com.example.company.model.views;

import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Immutable
@Table(name = "vraboteni")
public class Vraboteni implements Serializable {
    @Id
    public String embg;

    public String ime;

    public String prezime;

    public String funkcija;

    public Vraboteni() {

    }
}
