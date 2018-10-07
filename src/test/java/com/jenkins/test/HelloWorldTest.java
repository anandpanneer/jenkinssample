package com.jenkins.test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void getMessage_should_return_helloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.getMessage());
    }

}