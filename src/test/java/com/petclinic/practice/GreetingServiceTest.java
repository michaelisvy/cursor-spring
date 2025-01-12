package com.petclinic.practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GreetingServiceTest {

    @Test
    public void shouldGreetSuccessfully() {
        var greetingService = new GreetingService();
        assertThat(greetingService.sayHi()).isEqualTo("Hello John");
    }
}
