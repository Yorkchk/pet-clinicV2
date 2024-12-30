package com.example.pet_clinicV2.controllers;

import com.example.pet_clinicV2.serviceInt.PetInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
    private PetInt petService;

    public PetController(PetInt petService){
        this.petService = petService;
    }


}
