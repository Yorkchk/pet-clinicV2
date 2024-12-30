package com.example.pet_clinicV2.repositories;

import com.example.pet_clinicV2.models.Owner;
import com.example.pet_clinicV2.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends JpaRepository<Pet, Long> {

    @Query(value = "SELECT * FROM pet WHERE owner_id IN (SELECT id FROM owner WHERE last_name = :lastName)", nativeQuery = true)
    List<Pet> findByOwnerLastNameNative(@Param("lastName") String lastName);


}
