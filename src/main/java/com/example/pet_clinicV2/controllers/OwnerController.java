package com.example.pet_clinicV2.controllers;

import com.example.pet_clinicV2.models.Owner;
import com.example.pet_clinicV2.serviceInt.OwnerInt;
import com.example.pet_clinicV2.serviceInt.PetInt;
import com.example.pet_clinicV2.services.OwnerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class OwnerController {

    private OwnerInt ownerInt;
    private PetInt petInt;

    public OwnerController(OwnerInt ownerInt, PetInt petInt){
        this.ownerInt = ownerInt;
        this.petInt = petInt;
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

    @RequestMapping("owners")
    public String getAllPets(Model model){
        model.addAttribute("pets",petInt.getAllPets());
        model.addAttribute("owners", ownerInt.findAll());
        return "ownersList";
    }

    @RequestMapping("findOwner")
    public String findOwner(@ModelAttribute("lname") String lastName, Model modelMap){
        System.out.print("lastName :" + lastName);
        if(lastName.isBlank()){
            return getAllPets(modelMap);
        }
        else{
            Owner owner = ownerInt.findOwnerByLastName(lastName);
            if(owner == null){
                modelMap.addAttribute("errorMessage", "Last name not found");
                return "searchOwner";
            }
            else{
                modelMap.addAttribute("owner", owner);
                modelMap.addAttribute("pets", petInt.findPetsByLastName(owner.getLastName()));
                return "ownerDetails";
            }
        }
    }

    @RequestMapping("saveOwner/{id}")
    public String saveOwner(@ModelAttribute("owner") Owner owner, @PathVariable("id")Long id){
        owner.setId(id);
        ownerInt.addOwner(owner);
        return "redirect:/index";
    }

    @RequestMapping("editOwner/{id}")
    public String editOwner(@PathVariable("id")Long id, Model model){
        model.addAttribute("owner", ownerInt.findOwnerById(id));
        return "editOwner";
    }
}
