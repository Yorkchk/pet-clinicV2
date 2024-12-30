package com.example.pet_clinicV2.controllers;

import com.example.pet_clinicV2.models.Owner;
import com.example.pet_clinicV2.serviceInt.OwnerInt;
import com.example.pet_clinicV2.services.OwnerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class OwnerController {

    private OwnerInt ownerInt;

    public OwnerController(OwnerInt ownerInt){
        this.ownerInt = ownerInt;
    }

    @RequestMapping("index")
    public String home(){
        return "home";
    }

    @RequestMapping("find")
    public String findOwner(){
        return "searchOwner";
    }

    @RequestMapping("addOwner")
    public String addOwner(){
        return "createOwner";
    }

    @RequestMapping("saveOwner")
    public String saveOwner(@ModelAttribute("owner") Owner owner){
        ownerInt.addOwner(owner);
        return "home";
    }
}
