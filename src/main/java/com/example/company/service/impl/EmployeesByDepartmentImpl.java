package com.example.company.service.impl;

import com.example.company.model.views.Developeri_po_oddel;
import com.example.company.repository.DeveloperiPoOddelRepository;
import com.example.company.service.EmployeesByDepartment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesByDepartmentImpl implements EmployeesByDepartment {

    private final DeveloperiPoOddelRepository developeriPoOddelRepository;

    public EmployeesByDepartmentImpl(DeveloperiPoOddelRepository developeriPoOddelRepository) {
        this.developeriPoOddelRepository = developeriPoOddelRepository;
    }

    @Override
    public List<Developeri_po_oddel> listAll() {
        return this.developeriPoOddelRepository.findAll();
    }
}
