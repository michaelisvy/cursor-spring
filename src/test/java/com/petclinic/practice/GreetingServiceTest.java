package com.petclinic.practice;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "greeting.name=John")
public class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void shouldGreetSuccessfully() {
        assertThat(greetingService.sayHi("John")).isEqualTo("Hello John");
    }
}
