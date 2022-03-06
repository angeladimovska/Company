package com.example.company.service.impl;

import com.example.company.model.views.Vraboteni;
import com.example.company.repository.VraboteniRepository;
import com.example.company.service.VraboteniService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VraboteniServiceImpl implements VraboteniService {

    private final VraboteniRepository vraboteniRepository;

    public VraboteniServiceImpl(VraboteniRepository vraboteniRepository) {
        this.vraboteniRepository = vraboteniRepository;
    }

    @Override
    public List<Vraboteni> listAll() {
        return this.vraboteniRepository.findAll();
    }
}
