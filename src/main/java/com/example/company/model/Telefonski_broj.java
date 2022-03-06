package com.example.company.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(Telefonski_broj.class)
public class Telefonski_broj implements Serializable {
    @Id
    public Integer id_klient;
    @Id
    public String telefonski_broj;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefonski_broj that = (Telefonski_broj) o;
        return Objects.equals(id_klient, that.id_klient) && Objects.equals(telefonski_broj, that.telefonski_broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_klient, telefonski_broj);
    }
}
