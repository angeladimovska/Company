package com.example.company.repository;

import com.example.company.model.Klient;
import com.example.company.model.Menadzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenadzerRepository extends JpaRepository<Menadzer, String> {

}
