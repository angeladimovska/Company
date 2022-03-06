package com.example.company.service.impl;

import com.example.company.model.Chovek;
import com.example.company.repository.ChovekRepository;
import com.example.company.service.ChovekService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChovekServiceImpl implements ChovekService {

    private final ChovekRepository chovekRepository;

    public ChovekServiceImpl(ChovekRepository chovekRepository) {
        this.chovekRepository = chovekRepository;
    }
    @Override

    public List<Chovek> listAll() {
        return chovekRepository.findAll();
    }

//    @Override
//    public Optional<Chovek> save(String embg, String ime, String prezime) {
//        Chovek chovek= new Chovek(embg, ime, prezime);
//        return Optional.of(this.chovekRepository.save(chovek));
//    }
}
