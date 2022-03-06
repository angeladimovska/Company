package com.example.company.service;

import com.example.company.model.Developer;
import com.example.company.model.Proekt;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface DeveloperService {
    List<Developer> listAll();
    Optional<Developer> save(String embg, String ime, String prezime, Integer id_oddel);
}
