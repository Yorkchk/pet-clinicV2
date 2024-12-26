package com.example.pet_clinicV2.repositories;

import com.example.pet_clinicV2.models.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepo extends JpaRepository<Vet, Long> {
}
