package com.example.company.service;

import com.example.company.model.Proekt;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProektService {
    List<Proekt> listAll();
    Optional<Proekt> save(String ime_proekt, LocalDate datum_pocetok, LocalDate datum_kraj, Integer id_klient);
}
