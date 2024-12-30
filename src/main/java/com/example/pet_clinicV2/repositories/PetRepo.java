package com.example.pet_clinicV2.repositories;

import com.example.pet_clinicV2.models.Owner;
import com.example.pet_clinicV2.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends JpaRepository<Pet, Long> {

}
