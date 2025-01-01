package com.example.pet_clinicV2.controllers;

import com.example.pet_clinicV2.models.Pet;
import com.example.pet_clinicV2.models.Visit;
import com.example.pet_clinicV2.serviceInt.OwnerInt;
import com.example.pet_clinicV2.serviceInt.PetInt;
import com.example.pet_clinicV2.serviceInt.VisitInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisitController {
    private final VisitInt visitService;
    private PetInt petInt;
    private OwnerInt ownerInt;

    public VisitController(VisitInt visitService, PetInt petInt, OwnerInt ownerInt){
        this.visitService = visitService;
        this.petInt = petInt;
        this.ownerInt = ownerInt;
    }

    @RequestMapping("/saveVisit/{petId}/{ownerId}")
    public String addVisit(@PathVariable("petId") Long petId,
                           @PathVariable("ownerId")Long ownerId,
                           @ModelAttribute("visit") Visit visit,
                           Model model){
        try{
            Pet pet = petInt.getPetById(petId);
            pet.setOwner(ownerInt.findOwnerById(ownerId));
            visit.setPet(pet);
            visitService.saveVisit(visit);
        }catch (Exception e){
            model.addAttribute("errorMessage", "The date can not be before today's date");
            return "/addVisit/{petId}/{ownerId}";
        }
        return "redirect:/index";
    }
}
