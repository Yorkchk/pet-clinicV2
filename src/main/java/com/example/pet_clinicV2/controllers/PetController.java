package com.example.pet_clinicV2.controllers;

import com.example.pet_clinicV2.models.Pet;
import com.example.pet_clinicV2.serviceInt.OwnerInt;
import com.example.pet_clinicV2.serviceInt.PetInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
    private PetInt petService;

    private OwnerInt ownerInt;

    public PetController(PetInt petService, OwnerInt ownerInt){
        this.petService = petService;
        this.ownerInt = ownerInt;
    }

    @RequestMapping("/addPet/{id}")
    public String addPet(@PathVariable("id")Long id, Model model){
        model.addAttribute("owner_id", id);
        return "addPet";
    }

    @RequestMapping("/editPet/{id}")
    public String editPet(@PathVariable("id")Long id, Model model){
        model.addAttribute("pet", petService.getPetById(id));
        return "editPet";
    }

    @RequestMapping("/savePet/{id}")
    public String savePet(@PathVariable("id")Long ownerId, @ModelAttribute("pet") Pet pet){
        Pet newPet = new Pet(pet.getName(),pet.getBirthDate(),pet.getPetType());
        newPet.setOwner(ownerInt.findOwnerById(ownerId));
        petService.addPet(newPet);

        return "redirect:/index";
    }
}
