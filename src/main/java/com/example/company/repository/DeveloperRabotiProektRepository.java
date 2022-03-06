package com.example.company.repository;

import com.example.company.model.Developer_raboti_na_proekt;
import com.example.company.model.compositeKeys.DeveloperProektId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeveloperRabotiProektRepository extends JpaRepository<Developer_raboti_na_proekt, DeveloperProektId> {


}
