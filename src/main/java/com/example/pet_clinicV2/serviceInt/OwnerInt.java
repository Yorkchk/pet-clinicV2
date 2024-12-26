package com.example.pet_clinicV2.serviceInt;

import com.example.pet_clinicV2.models.Owner;

import java.util.List;

public interface OwnerInt {
    Owner addOwner(Owner owner);

    Owner findOwnerById(Long id);

    Owner findOwnerByLastName(String lastName);

    List<Owner> findAll();
}
