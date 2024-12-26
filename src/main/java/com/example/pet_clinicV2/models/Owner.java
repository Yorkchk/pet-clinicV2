package com.example.pet_clinicV2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner extends Person{

    private String address;

    private String city;

    private String telephone;

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets = new ArrayList<>();

    public Owner(String firstName, String lastName, String address, String city, String telephone) {
        super(firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
