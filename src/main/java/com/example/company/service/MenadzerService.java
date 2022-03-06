package com.example.company.service;

import com.example.company.model.Developer;
import com.example.company.model.Menadzer;

import java.util.List;
import java.util.Optional;

public interface MenadzerService {
    List<Menadzer> listAll();
    Optional<Menadzer> save(String embg, String ime, String prezime);
}
