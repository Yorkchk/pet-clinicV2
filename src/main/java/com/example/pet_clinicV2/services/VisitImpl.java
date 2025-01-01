package com.example.pet_clinicV2.services;

import com.example.pet_clinicV2.models.Visit;
import com.example.pet_clinicV2.repositories.VisitRepo;
import com.example.pet_clinicV2.serviceInt.VisitInt;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class VisitImpl implements VisitInt {

    private VisitRepo visitRepo;

    public VisitImpl(VisitRepo visitRepo){
        this.visitRepo = visitRepo;
    }

    @Override
    public Visit saveVisit(Visit visit) throws Exception{
            if (visit.getDate().isBefore(LocalDate.now())) {
                throw new Exception();
            }
        return visitRepo.save(visit);
        }

    }

