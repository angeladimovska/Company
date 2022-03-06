package com.example.company.service.impl;

import com.example.company.model.Obuka;
import com.example.company.model.views.Proekti;
import com.example.company.repository.ProektiRepository;
import com.example.company.service.ProektiService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProektiServiceImpl implements ProektiService {

    private final ProektiRepository proektiRepository;

    public ProektiServiceImpl(ProektiRepository proektiRepository) {
        this.proektiRepository = proektiRepository;
    }

    @Override
    public List<Proekti> findAll() {
       return this.proektiRepository.findAll();
    }


}
