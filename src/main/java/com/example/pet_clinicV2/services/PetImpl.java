package com.example.pet_clinicV2.services;

import com.example.pet_clinicV2.models.Pet;
import com.example.pet_clinicV2.repositories.PetRepo;
import com.example.pet_clinicV2.serviceInt.PetInt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetImpl implements PetInt {

    private PetRepo petRepo;

    public PetImpl(PetRepo petRepo){
        this.petRepo = petRepo;
    }

    @Override
    public Pet getPetById(Long id) {
        return petRepo.getReferenceById(id);
    }

    @Override
    public List<Pet> getAllPets() {
        return petRepo.findAll();
    }

    @Override
    public Pet addPet(Pet pet) {
        return petRepo.save(pet);
    }

    @Override
    public List<Pet> findPetsByLastName(String lastName) {
        return petRepo.findByOwnerLastNameNative(lastName);
    }
}
