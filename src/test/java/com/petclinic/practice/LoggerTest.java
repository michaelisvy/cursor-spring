package com.petclinic.practice;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void shouldLog() {
        var name = "John";
        logger.info("Hello World 1:" + name);
        logger.info("Hello World 2:" + name);
        logger.info("Hello World 3:" + name);
        logger.info("Hello World 4:" + name);
        logger.info("Hello World 5:" + name);
    }
}
