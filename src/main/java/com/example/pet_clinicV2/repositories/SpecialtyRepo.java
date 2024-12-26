package com.example.pet_clinicV2.repositories;

import com.example.pet_clinicV2.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepo extends JpaRepository<Specialty, Long> {
}
