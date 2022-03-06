package com.example.company.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@IdClass(Developer_prisustvuva_na_obuka.class)
public class Developer_prisustvuva_na_obuka implements Serializable {
    @Id
    public String embg_developer;
    @Id
    public Integer id_obuka;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer_prisustvuva_na_obuka that = (Developer_prisustvuva_na_obuka) o;
        return Objects.equals(embg_developer, that.embg_developer) && Objects.equals(id_obuka, that.id_obuka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(embg_developer, id_obuka);
    }
}
