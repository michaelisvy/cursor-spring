package com.petclinic.practice;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class GreetingServiceTest {

    @Test
    public void shouldGreetSuccessfully() {
        var greetingService = new GreetingService("Hello");
        assertThat(greetingService.sayHi()).isEqualTo("Hello John");
    }
}
