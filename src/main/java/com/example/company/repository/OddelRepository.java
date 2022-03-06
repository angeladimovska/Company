package com.example.company.repository;

import com.example.company.model.Klient;
import com.example.company.model.Oddel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OddelRepository extends JpaRepository<Oddel, Integer> {
    @Override
    List<Oddel> findAll();
}
