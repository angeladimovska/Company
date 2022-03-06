package com.example.company.repository;

import com.example.company.model.views.Vraboteni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VraboteniRepository extends JpaRepository<Vraboteni, String> {
    @Override
    List<Vraboteni> findAll();
}
