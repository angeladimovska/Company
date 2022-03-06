package com.example.company.service;

import com.example.company.model.Developer_raboti_na_proekt;
import com.example.company.model.compositeKeys.DeveloperProektId;
import com.example.company.model.views.Proekti;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface DeveloperRabotiProektService {

    List<Developer_raboti_na_proekt> findAll();

    Optional<Developer_raboti_na_proekt> findById(DeveloperProektId developerProektId);

    Optional<Developer_raboti_na_proekt>save(String embg_developer, Integer id_proekt, LocalDate raboti_od, LocalDate raboti_do);



}
