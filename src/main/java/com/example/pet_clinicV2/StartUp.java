package com.example.pet_clinicV2;

import com.example.pet_clinicV2.models.Specialty;
import com.example.pet_clinicV2.models.Vet;
import com.example.pet_clinicV2.repositories.SpecialtyRepo;
import com.example.pet_clinicV2.repositories.VetRepo;
import com.example.pet_clinicV2.serviceInt.SpecialtyInt;
import com.example.pet_clinicV2.serviceInt.VetInt;
import com.example.pet_clinicV2.services.SpecialtyImpl;
import com.example.pet_clinicV2.services.VetImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartUp implements CommandLineRunner {

    private VetRepo vetRepo;

    private SpecialtyInt specialtyInt;

    public StartUp(VetRepo vetRepo, SpecialtyInt specialtyRepo){
        this.vetRepo = vetRepo;
        this.specialtyInt = specialtyRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("hello");

//        System.out.println(vetRepo.findAll());
    }
}
