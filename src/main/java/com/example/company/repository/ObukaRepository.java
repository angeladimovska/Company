package com.example.company.repository;

import com.example.company.model.Menadzer;
import com.example.company.model.Obuka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObukaRepository extends JpaRepository<Obuka,Integer> {
    void deleteByOpis(String opis);
}
