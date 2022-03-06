package com.example.company.web.controller;

import com.example.company.model.Developer;
import com.example.company.model.Developer_raboti_na_proekt;

import com.example.company.model.Klient;
import com.example.company.model.Proekt;
import com.example.company.model.compositeKeys.DeveloperProektId;
import com.example.company.service.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectsController {

    private final ProektiService proektiService;//za prikaz na view
    private final ProektService proektService;

    private final DeveloperRabotiProektService developerRabotiProektService;//ZA EDIT
    private final KlientService klientService;

    private final DeveloperService developerService;

    public ProjectsController(ProektiService proektiService, ProektService proektService, DeveloperRabotiProektService developerRabotiProektService, KlientService klientService, DeveloperService developerService) {
        this.proektiService = proektiService;
        this.proektService = proektService;
        this.developerRabotiProektService = developerRabotiProektService;
        this.klientService = klientService;
        this.developerService = developerService;
    }

    @GetMapping
    public String getProjects(@RequestParam(required = false) String error, Model model) {
        if(error!=null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("projects", this.proektiService.findAll());
        return "projects";
    }

    @GetMapping("/edit-form/{embg}/{id}")
    public String editProjectPage(@PathVariable String embg, @PathVariable Integer id, Model model){

        DeveloperProektId developerProektId= new DeveloperProektId(embg, id);
        if (this.developerRabotiProektService.findById(developerProektId).isPresent()){
                Developer_raboti_na_proekt developerRabotiNaProekt= this.developerRabotiProektService.findById(developerProektId).get();
                model.addAttribute("developerRabotiNaProekt", developerRabotiNaProekt);
            List<Developer> developers=this.developerService.listAll();
            List<Proekt> projects=this.proektService.listAll();
            model.addAttribute("developers", developers);
            model.addAttribute("projects", projects);
           return "edit-project";
      }
        return "redirect:/projects?error=ProjectNotFound";
    }

    @GetMapping("/assign-form")
    public String assignDeveloperOnProjectPage(Model model) {
        List<Developer> developers=this.developerService.listAll();
        List<Proekt> projects=this.proektService.listAll();
        model.addAttribute("developers", developers);
        model.addAttribute("projects", projects);
        return "edit-project";
    }

    @PostMapping("/edit")
    public String editProject(@RequestParam String developers,
                              @RequestParam Integer projects,
                              @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate raboti_od,
                              @RequestParam(required = false)  @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate raboti_do){

        this.developerRabotiProektService.save(developers, projects,raboti_od,raboti_do);
        return "redirect:/projects";
    }

}
