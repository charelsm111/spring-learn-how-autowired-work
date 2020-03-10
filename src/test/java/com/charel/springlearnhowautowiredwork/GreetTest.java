package com.charel.springlearnhowautowiredwork;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetTest {

    @Autowired
    private Greet greet;

    @Test
    public void testGreetName() {
        String greetName = greet.greetName("Charel");

        assertEquals("Hello: Charel", greetName);
    }
}
