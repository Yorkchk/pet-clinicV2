package com.example.pet_clinicV2.services;

import com.example.pet_clinicV2.models.Vet;
import com.example.pet_clinicV2.repositories.VetRepo;
import com.example.pet_clinicV2.serviceInt.VetInt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetImpl implements VetInt {
    private VetRepo vetRepo;

    public VetImpl(VetRepo vetRepo){
        this.vetRepo = vetRepo;
    }

    public List<Vet> findAll(){
        return vetRepo.findAll();
    }

    @Override
    public Vet addVet(Vet vet) {
        return vetRepo.save(vet);
    }
}
