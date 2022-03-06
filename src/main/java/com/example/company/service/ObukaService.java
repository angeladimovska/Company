package com.example.company.service;

import com.example.company.model.Obuka;
import com.example.company.model.Proekt;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ObukaService {
    List<Obuka> listAll();

    Optional<Obuka> save(String opis, Date datum_obuka);

    Optional<Obuka> findById(Integer id);
}
