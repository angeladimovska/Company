package com.example.company.service.impl;

import com.example.company.model.Developer;
import com.example.company.model.Oddel;
import com.example.company.model.exceptions.OddelNotFoundException;
import com.example.company.repository.DeveloperRepository;
import com.example.company.repository.OddelRepository;
import com.example.company.service.DeveloperService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    private final DeveloperRepository developerRepository;
    private final OddelRepository oddelRepository;

    public DeveloperServiceImpl(DeveloperRepository developerRepository, OddelRepository oddelRepository) {
        this.developerRepository = developerRepository;
        this.oddelRepository = oddelRepository;
    }

    @Override
    public List<Developer> listAll() {
        return this.developerRepository.findAll();
    }

    @Override
    public Optional<Developer> save(String embg, String ime, String prezime, Integer id_oddel) {

        Oddel oddel= this.oddelRepository.findById(id_oddel)
                .orElseThrow(() -> new OddelNotFoundException(id_oddel));

        Developer d = new Developer(embg,ime,prezime,oddel);

        return Optional.of(this.developerRepository.save(d));
    }
}
