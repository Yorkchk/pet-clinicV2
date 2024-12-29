package com.example.pet_clinicV2.services;

import com.example.pet_clinicV2.models.Specialty;
import com.example.pet_clinicV2.repositories.SpecialtyRepo;
import com.example.pet_clinicV2.serviceInt.SpecialtyInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpecialtyImpl implements SpecialtyInt {
    @Autowired
    private SpecialtyRepo specialtyRepo;

    public SpecialtyImpl(){}

    @Override
    public Specialty createSpecialty(Specialty specialty) {
        return specialtyRepo.save(specialty);
    }

    @Override
    public Specialty getSpecialtyById(Long id) {
        return specialtyRepo.findById(id).get();
    }
}
