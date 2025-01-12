package com.petclinic.core;

import org.springframework.stereotype.Service;

@Service
public class VisitService {
    private final VisitRepository visitRepository;

    public VisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }


    public Visit findByReferenceNumber(String referenceNumber) {
        return visitRepository.findByReferenceNumber(referenceNumber);
    }
}
