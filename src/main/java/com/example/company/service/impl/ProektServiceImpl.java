package com.example.company.service.impl;

import com.example.company.model.Klient;
import com.example.company.model.Proekt;
import com.example.company.model.exceptions.KlientNotFoundException;
import com.example.company.model.exceptions.OddelNotFoundException;
import com.example.company.repository.KlientRepository;
import com.example.company.repository.ProektRepository;
import com.example.company.service.ProektService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProektServiceImpl implements ProektService {

    private final ProektRepository proektRepository;
    private final KlientRepository klientRepository;

    public ProektServiceImpl(ProektRepository proektRepository, KlientRepository klientRepository) {
        this.proektRepository = proektRepository;
        this.klientRepository = klientRepository;
    }

    @Override
    public List<Proekt> listAll() {
        return proektRepository.findAll();
    }

    @Override
    public Optional<Proekt> save(String ime_proekt, LocalDate datum_pocetok, LocalDate datum_kraj, Integer id_klient) {

       Klient klient= this.klientRepository.findById(id_klient).orElseThrow(()->new KlientNotFoundException(id_klient));

       Proekt p = new Proekt(ime_proekt,datum_pocetok,datum_kraj,klient);

       return Optional.of(this.proektRepository.save(p));
    }
}
