package com.petclinic.demo_02_petclinic;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

@Repository
public class VisitRepository {
    public Visit findByReferenceNumber(String referenceNumber) {
        return new Visit(1, "V01-23", LocalDate.now(), "teeth cleaning");
    }
}
