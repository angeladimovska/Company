package com.example.company.web.controller;

import com.example.company.model.Obuka;
import com.example.company.model.views.Proekti;
import com.example.company.service.ObukaService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/obuki")
public class ObukiController {

    private final ObukaService obukaService;

    public ObukiController(ObukaService obukaService) {
        this.obukaService = obukaService;
    }

    @GetMapping
    public String getObukiPage(@RequestParam(required = false) String error, Model model) {
        if(error!=null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("obuki", this.obukaService.listAll());
        return "obuki";
    }

    @GetMapping("/add-form")
    public String addObukaPage() {
        return "add-obuka";
    }


    @GetMapping("/edit-form/{id}")
    public String editObukiPage(@PathVariable Integer id, Model model){
        if (this.obukaService.findById(id).isPresent()){
            Obuka obuka = this.obukaService.findById(id).get();
            model.addAttribute("obuka", obuka);
            return "add-obuka";
        }
        return "redirect:/obuki?error=ObukaNotFound";
    }

    @PostMapping("/add")
    public String saveObuka(@RequestParam String opis,
                            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date datum_obuka){
        this.obukaService.save(opis, datum_obuka);
        return "redirect:/obuki";
    }
}
