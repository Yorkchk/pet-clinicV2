package com.example.pet_clinicV2.serviceInt;

import com.example.pet_clinicV2.models.Pet;

import java.util.List;

public interface PetInt {
    Pet getPetById(Long id);

    List<Pet> getAllPets();

    Pet addPet(Pet pet);

    List<Pet> findPetsByLastName(String lastName);
}
