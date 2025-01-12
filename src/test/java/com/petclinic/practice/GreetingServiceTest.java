package com.petclinic.practice;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    public void shouldGreetSuccessfully() {
        assertThat(greetingService.sayHi()).isEqualTo("Hello John");
    }
}
