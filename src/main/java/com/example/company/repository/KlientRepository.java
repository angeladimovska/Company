package com.example.company.repository;

import com.example.company.model.Chovek;
import com.example.company.model.Klient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends JpaRepository<Klient, Integer> {
}
