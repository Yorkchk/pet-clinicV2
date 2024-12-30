package com.example.pet_clinicV2;

import com.example.pet_clinicV2.models.Owner;
import com.example.pet_clinicV2.models.Pet;
import com.example.pet_clinicV2.models.PetType;
import com.example.pet_clinicV2.repositories.VetRepo;
import com.example.pet_clinicV2.serviceInt.OwnerInt;
import com.example.pet_clinicV2.serviceInt.PetInt;
import com.example.pet_clinicV2.serviceInt.SpecialtyInt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StartUp implements CommandLineRunner {

    private OwnerInt ownerInt;

    private PetInt petInt;

    public StartUp(OwnerInt ownerInt, PetInt petInt){
        this.ownerInt = ownerInt;
        this.petInt = petInt;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("hello");
//        System.out.println(petInt.getPetById(1L).getOwner().getFirstName());

//        Pet pet1 = new Pet("Leo", LocalDate.of(2010, 9, 7), PetType.CAT );
//        Pet pet2 = new Pet("Basil", LocalDate.of(2012, 8, 6), PetType.HAMSTER);
//        Pet pet31 = new Pet("Jewel", LocalDate.of(2010, 3, 7), PetType.DOG);
//        Pet pet32 = new Pet("Rosy", LocalDate.of(2011,4,17), PetType.DOG);
//        Pet pet4 = new Pet("Iggy", LocalDate.of(2010, 11,30),PetType.LIZARD);
//        Pet pet5 = new Pet("George", LocalDate.of(2010,1,20),PetType.SNAKE);
//
//        Owner George = new Owner("George", "Franklin","110 W. Liberty St.", "Madison", "6085551023");
//        Owner Betty = new Owner("Betty","Davis","638 cardinal Ave.", "Sun Prairie", "6085551749");
//        Owner Eduardo = new Owner("Edwardo", "Rodriquez", "2693 Commerce St.", "McFarland","6085558763");
//        Owner Harold = new Owner("Harold", "Davis", "563 Friendly St.","Windsor", "6085553198");
//        Owner Peter = new Owner("Peter","McTavish","2387 S. Fair Way","Madison","6085552765");
//
//        pet1.setOwner(George);
//        pet2.setOwner(Betty);
//        pet31.setOwner(Eduardo);
//        pet32.setOwner(Eduardo);
//        pet4.setOwner(Harold);
//        pet5.setOwner(Peter);
//
//        ownerInt.addOwner(George);
//        ownerInt.addOwner(Betty);
//        ownerInt.addOwner(Eduardo);
//        ownerInt.addOwner(Harold);
//        ownerInt.addOwner(Peter);
//
//        petInt.addPet(pet1);
//        petInt.addPet(pet2);
//        petInt.addPet(pet31);
//        petInt.addPet(pet32);
//        petInt.addPet(pet4);
//        petInt.addPet(pet5);


    }
}
