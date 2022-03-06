package com.example.company.model.compositeKeys;

import java.io.Serializable;
import java.util.Objects;

public class ProektiId implements Serializable {

    public Integer id_proekt;

    public String embg;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProektiId proektiId = (ProektiId) o;
        return Objects.equals(id_proekt, proektiId.id_proekt) && Objects.equals(embg, proektiId.embg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_proekt, embg);
    }
}
