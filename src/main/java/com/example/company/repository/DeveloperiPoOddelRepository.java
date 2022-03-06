package com.example.company.repository;

import com.example.company.model.views.Developeri_po_oddel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperiPoOddelRepository extends JpaRepository<Developeri_po_oddel, String> {
}
