package com.example.pet_clinicV2.serviceInt;

import com.example.pet_clinicV2.models.Specialty;

import java.util.Optional;

public interface SpecialtyInt {
    Specialty createSpecialty(Specialty specialty);

    Specialty getSpecialtyById(Long id);
}
