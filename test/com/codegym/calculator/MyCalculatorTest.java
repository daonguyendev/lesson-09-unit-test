package com.codegym.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
//import org.junit.jupiter.api.DisplayName;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCalculatorTest {

    @Test
//    @DisplayName("test 1 + 2")
    public void testAdd1And2() {
        // Step 1: Prepare mock data
        int a = 1, b = 2;

        // Step 2: Prepare expect value
        int expect = 3;

        // Step 3: Get actual value by invoking function need to test
        int actual = MyCalculator.add(a, b);

        //Step 4: Compare expect value with actual value
        assertEquals(expect, actual);
    }
}

