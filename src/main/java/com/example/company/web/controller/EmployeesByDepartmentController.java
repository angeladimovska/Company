package com.example.company.web.controller;

import com.example.company.service.EmployeesByDepartment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employeesByDep")
public class EmployeesByDepartmentController {

    private final EmployeesByDepartment employeesByDepartment;

    public EmployeesByDepartmentController(EmployeesByDepartment employeesByDepartment) {
        this.employeesByDepartment = employeesByDepartment;
    }

    @GetMapping
    public String getEmployeesByDepartment(@RequestParam(required = false) String error, Model model) {
        if(error!=null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("employeesDep", this.employeesByDepartment.listAll());
        return "employeesByDepartment";
    }
}
