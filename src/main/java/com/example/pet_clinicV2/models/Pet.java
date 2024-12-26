package com.example.pet_clinicV2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pet extends BaseEntity{

    private String name;

    private LocalDate birthDate;

    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @OneToMany(mappedBy = "pet")
    private List<Visit> visits = new ArrayList<>();

    public Pet(String name, LocalDate birthDate, PetType petType){
        this.name = name;
        this.petType = petType;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
