package com.example.company.service.impl;

import com.example.company.model.Klient;
import com.example.company.repository.KlientRepository;
import com.example.company.service.KlientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlientServiceImpl implements KlientService {
    private final KlientRepository klientRepository;

    public KlientServiceImpl(KlientRepository klientRepository) {
        this.klientRepository = klientRepository;
    }

    @Override
    public List<Klient> listAll() {
        return this.klientRepository.findAll();
    }
}
