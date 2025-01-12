package com.petclinic.practice;

public class GreetingService {
    private final String greeting;

    public GreetingService(String greeting) {
        this.greeting = greeting;
    }

    public String sayHi() {
        return greeting + " John";
    }
}
