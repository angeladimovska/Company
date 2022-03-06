package com.example.company.service.impl;

import com.example.company.model.Oddel;
import com.example.company.repository.OddelRepository;
import com.example.company.service.OddelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OddelServiceImpl implements OddelService {

    private final OddelRepository oddelRepository;

    public OddelServiceImpl(OddelRepository oddelRepository) {
        this.oddelRepository = oddelRepository;
    }
    public List<Oddel> listAll() {
        return oddelRepository.findAll();
    }
}
