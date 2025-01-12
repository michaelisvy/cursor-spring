package com.petclinic.core;

import java.time.LocalDate;

public class Visit {
    private int id;
    private String referenceNumber;
    private LocalDate date;
    private String purpose;



    public Visit() {
    }

    public Visit(int id, String referenceNumber, LocalDate date, String purpose) {
        this.id = id;
        this.referenceNumber = referenceNumber;
        this.date = date;
        this.purpose = purpose;
    }

    public int getId() {
        return id;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPurpose() {
        return purpose;
    }
}
