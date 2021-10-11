package com.flashsuppressor.java.lab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void sayHello() {
        String actualResult = new Greeter().sayHello();
        String expectedResult = "------------------------\nHello World from Maven!\n------------------------";

        assertEquals(expectedResult, actualResult);
    }
}