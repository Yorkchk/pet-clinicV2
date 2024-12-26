package com.example.pet_clinicV2.services;

import com.example.pet_clinicV2.models.Owner;
import com.example.pet_clinicV2.repositories.OwnerRepo;
import com.example.pet_clinicV2.serviceInt.OwnerInt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerImpl implements OwnerInt {

    private OwnerRepo ownerRepo;

    public OwnerImpl(OwnerRepo ownerRepo){
        this.ownerRepo = ownerRepo;
    }

    public Owner addOwner(Owner owner){
        return ownerRepo.save(owner);
    }

    public Owner findOwnerById(Long id){
        return ownerRepo.getReferenceById(id);
    }

    public Owner findOwnerByLastName(String lastName){
        return ownerRepo.findOwnerByLastName(lastName);
    }

    public List<Owner> findAll(){
        return ownerRepo.findAll();
    }
}
