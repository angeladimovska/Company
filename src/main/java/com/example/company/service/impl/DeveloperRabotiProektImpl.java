package com.example.company.service.impl;

import com.example.company.model.Developer;
import com.example.company.model.Developer_raboti_na_proekt;
import com.example.company.model.Klient;
import com.example.company.model.Proekt;
import com.example.company.model.compositeKeys.DeveloperProektId;
import com.example.company.model.exceptions.DeveloperNotFoundException;
import com.example.company.model.exceptions.KlientNotFoundException;
import com.example.company.repository.DeveloperRabotiProektRepository;
import com.example.company.repository.DeveloperRepository;
import com.example.company.repository.ProektRepository;
import com.example.company.service.DeveloperRabotiProektService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DeveloperRabotiProektImpl implements DeveloperRabotiProektService {

    private final DeveloperRabotiProektRepository developerRabotiProektRepository;
    private final DeveloperRepository developerRepository;
    private final ProektRepository proektRepository;

    public DeveloperRabotiProektImpl(DeveloperRabotiProektRepository developerRabotiProektRepository, DeveloperRepository developerRepository, ProektRepository proektRepository) {
        this.developerRabotiProektRepository = developerRabotiProektRepository;
        this.developerRepository = developerRepository;
        this.proektRepository = proektRepository;
    }

    @Override
    public List<Developer_raboti_na_proekt> findAll() {
        return this.developerRabotiProektRepository.findAll();
    }

    @Override
    public Optional<Developer_raboti_na_proekt> findById(DeveloperProektId developerProektId) {
        return this.developerRabotiProektRepository.findById(developerProektId);
    }

    @Override
    @Transactional
    public Optional<Developer_raboti_na_proekt> save(String embg_developer, Integer id_proekt, LocalDate raboti_od, LocalDate raboti_do) {

        //SO OBJEKT
        Developer developer=this.developerRepository.findById(embg_developer).orElseThrow(()->new DeveloperNotFoundException(embg_developer));
        Proekt proekt= this.proektRepository.findById(id_proekt).orElseThrow(()->new KlientNotFoundException(id_proekt));

        //samo ova BEZ OBJEKT
        Developer_raboti_na_proekt developerRabotiNaProekt = new Developer_raboti_na_proekt(developer,proekt,raboti_od, raboti_do);

        return Optional.of(this.developerRabotiProektRepository.save(developerRabotiNaProekt));


    }

}
