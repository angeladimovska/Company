package com.example.company.service.impl;

import com.example.company.model.Developer;
import com.example.company.model.Menadzer;
import com.example.company.repository.MenadzerRepository;
import com.example.company.service.MenadzerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenadzerServiceImpl implements MenadzerService {

    private final MenadzerRepository menadzerRepository;

    public MenadzerServiceImpl(MenadzerRepository menadzerRepository) {
        this.menadzerRepository = menadzerRepository;
    }

    @Override
    public List<Menadzer> listAll() {
        return this.menadzerRepository.findAll();
    }

    @Override
    public Optional<Menadzer> save(String embg, String ime, String prezime) {
        Menadzer m = new Menadzer(embg,ime,prezime);
        return Optional.of(this.menadzerRepository.save(m));
    }
}
