package com.jenkins.test;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    private HelloWorld helloWorld;

    @Before
    public void setup() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void getMessage_should_return_helloWorld() {
        assertEquals("Hello World ", helloWorld.getMessage(""));
    }

    @Test
    public void getMessage_should_return_helloWorld_with_passed_name() {
        assertEquals("Hello World Anand", helloWorld.getMessage("Anand"));
    }

}