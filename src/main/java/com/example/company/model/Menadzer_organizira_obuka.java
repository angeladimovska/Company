package com.example.company.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@IdClass(Menadzer_organizira_obuka.class)
public class Menadzer_organizira_obuka implements Serializable {
    @Id
    public String embg_menadzer;
    @Id
    public Integer id_obuka;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menadzer_organizira_obuka that = (Menadzer_organizira_obuka) o;
        return Objects.equals(embg_menadzer, that.embg_menadzer) && Objects.equals(id_obuka, that.id_obuka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(embg_menadzer, id_obuka);
    }
}
