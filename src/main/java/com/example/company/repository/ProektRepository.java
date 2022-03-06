package com.example.company.repository;

import com.example.company.model.Proekt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProektRepository extends JpaRepository<Proekt, Integer> {
    @Override
    List<Proekt> findAll();

}
