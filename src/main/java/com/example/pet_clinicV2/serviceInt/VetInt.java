package com.example.pet_clinicV2.serviceInt;

import com.example.pet_clinicV2.models.Vet;

import java.util.List;

public interface VetInt {
    List<Vet> findAll();

    Vet addVet(Vet vet);
}
