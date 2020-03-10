package com.charel.springlearnhowautowiredwork;

import org.springframework.stereotype.Component;

@Component
public class Person {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
