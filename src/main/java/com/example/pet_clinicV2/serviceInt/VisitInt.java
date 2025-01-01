package com.example.pet_clinicV2.serviceInt;

import com.example.pet_clinicV2.models.Visit;

public interface VisitInt {
    Visit saveVisit(Visit visit) throws Exception;
}
