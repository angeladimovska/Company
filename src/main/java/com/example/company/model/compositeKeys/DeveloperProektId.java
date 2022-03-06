package com.example.company.model.compositeKeys;

import com.example.company.model.Developer;
import com.example.company.model.Proekt;

import javax.persistence.Id;
import java.io.Serializable;

public class DeveloperProektId implements Serializable {

    public String embg_developer;

    public Integer id_proekt;

    public DeveloperProektId(String embg_developer, Integer id_proekt) {
        this.embg_developer = embg_developer;
        this.id_proekt = id_proekt;
    }



    public String getEmbg_developer() {
        return embg_developer;
    }

    public Integer getId_proekt() {
        return id_proekt;
    }

    public DeveloperProektId() {
    }
}
