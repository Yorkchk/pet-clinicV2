package com.example.pet_clinicV2.controllers;

import com.example.pet_clinicV2.serviceInt.VetInt;
import com.example.pet_clinicV2.services.VetImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private VetInt vetInt;

    public VetController(VetInt vetInt){
        this.vetInt = vetInt;
    }
    @RequestMapping("vets")
    public String allVets(Model model){
        model.addAttribute("vets", vetInt.findAll());
        return "vet_list";
    }

}
