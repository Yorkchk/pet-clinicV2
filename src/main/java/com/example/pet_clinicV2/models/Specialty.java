package com.example.pet_clinicV2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Specialty extends BaseEntity{

    private String label;

    @OneToMany(mappedBy = "specialty")
    private List<Vet> vets = new ArrayList<>();

    public Specialty(String label){
        super();
        this.label = label;
    }
    public Specialty(){}

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
