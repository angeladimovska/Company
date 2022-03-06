package com.example.company.repository;

import com.example.company.model.Chovek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChovekRepository extends JpaRepository<Chovek, String> {
    @Override
    List<Chovek> findAll();

    //listanje na site lugje so ime i prezime i dali e vraboten ili menadzer da pisuva
    //zemi od baza
}
//ova user
//naraca ili  kupi proekt->ke imas lista na proekti i forma kaj so ke dodades proekt

//ovie moze da gi pravi administrator
//dodavanje nov vraboten
//nova obuka