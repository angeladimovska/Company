package com.example.company.service;


import com.example.company.model.Obuka;
import com.example.company.model.views.Proekti;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProektiService {
    List<Proekti> findAll();
//    Optional<Proekti> findById(Integer integer);
//
//    Optional<Proekti> save(Integer id_proekt, String ime_proekt, LocalDate datum_pocetok, LocalDate datum_kraj, String embg,
//                           String ime_developer, String prezime_developer, LocalDate raboti_od, LocalDate raboti_do);
}
