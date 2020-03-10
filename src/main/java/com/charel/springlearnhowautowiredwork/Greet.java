package com.charel.springlearnhowautowiredwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greet {

    @Autowired
    private Word word;

    @Autowired
    private Person person;

    public String greetName(String name) {
        person.setName(name);

        return "Hello: " + word.sayName(person.getName());
    }
}
