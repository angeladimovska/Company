package com.example.company.repository;

import com.example.company.model.views.Proekti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProektiRepository extends JpaRepository<Proekti, Integer> {
    @Override
    List<Proekti> findAll();

    void deleteByName(String ime_proekt);
}
