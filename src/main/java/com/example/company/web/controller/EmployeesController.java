package com.example.company.web.controller;

import com.example.company.model.Oddel;
import com.example.company.service.DeveloperService;
import com.example.company.service.MenadzerService;
import com.example.company.service.OddelService;
import com.example.company.service.VraboteniService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    private final VraboteniService vraboteniService;
    private final DeveloperService developerService;
    private final MenadzerService menadzerService;
    private final OddelService oddelService;

    public EmployeesController(VraboteniService vraboteniService, DeveloperService developerService, MenadzerService menadzerService, OddelService oddelService) {
        this.vraboteniService = vraboteniService;
        this.developerService = developerService;
        this.menadzerService = menadzerService;
        this.oddelService = oddelService;
    }

    @GetMapping
    public String getEmployees(@RequestParam(required = false) String error, Model model) {
        if(error!=null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("employees", this.vraboteniService.listAll());
        return "employees";
    }

    @GetMapping("/add-manager")
    public String addManagerPage() {
        return "add-manager";
    }

    @GetMapping("/add-developer")
    public String addDeveloperPage(Model model) {
        List<Oddel> oddelList=this.oddelService.listAll();
        model.addAttribute("oddelList", oddelList);
        return "add-developer";
    }

    @PostMapping("/addDev")
    public String addDeveloper(@RequestParam String embg,
                              @RequestParam String ime,
                              @RequestParam String prezime,
                              @RequestParam(required = false) Integer oddelList){
        this.developerService.save(embg,ime, prezime, oddelList);
        return "redirect:/employees";
    }

    @PostMapping("/addMan")
    public String addManager(@RequestParam String embg_menadzer,
                              @RequestParam String ime,
                              @RequestParam String prezime){
        this.menadzerService.save(embg_menadzer,ime, prezime);
        return "redirect:/employees";
    }
}
