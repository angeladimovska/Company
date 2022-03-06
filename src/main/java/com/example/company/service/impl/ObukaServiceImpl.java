package com.example.company.service.impl;

import com.example.company.model.Obuka;
import com.example.company.repository.ObukaRepository;
import com.example.company.service.ObukaService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ObukaServiceImpl implements ObukaService {
    private final ObukaRepository obukaRepository;

    public ObukaServiceImpl(ObukaRepository obukaRepository) {
        this.obukaRepository = obukaRepository;
    }

    @Override
    public List<Obuka> listAll() {
        return this.obukaRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Obuka> save(String opis, Date datum_obuka) {

        this.obukaRepository.deleteByOpis(opis);//za edit se povikuva, za add ne
        Obuka obuka= new Obuka(opis, datum_obuka);
        return Optional.of(this.obukaRepository.save(obuka));
    }

    @Override
    public Optional<Obuka> findById(Integer id) {
        return this.obukaRepository.findById(id);
    }
}
