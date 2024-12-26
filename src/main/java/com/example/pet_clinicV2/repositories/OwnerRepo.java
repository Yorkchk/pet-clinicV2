package com.example.pet_clinicV2.repositories;

import com.example.pet_clinicV2.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner, Long> {

    @Query("Select o FROM Owner o where o.lastName = ?1")
    Owner findOwnerByLastName(String lastName);
}
