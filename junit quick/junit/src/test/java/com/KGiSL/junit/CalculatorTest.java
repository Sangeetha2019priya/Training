package com.KGiSL.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void subtest() {
        System.out.println("Subtraction Test");
        int expectedResult = 3;

        Calculator c = new Calculator();
        int actual = c.sub(6, 3);

        assertEquals(expectedResult, actual);

    }

    @Test
    public void addtest() {
        System.out.println("addition Test");
        int expectedResult = 9;

        Calculator c = new Calculator();
        int actual = c.add(6, 3);

        assertEquals(expectedResult, actual);

    }

    // @Test
    @Disabled
    public void multest()
    {   
        System.out.println("MultipleTest");
         int expectedResult = 3;

        Calculator c = new Calculator();
        int actual = c.sub(1,3);

        assertEquals(expectedResult,actual);
    }

    // @Test
    @Disabled
    public void divtest()
    {   
        System.out.println("Divtest");
         int expectedResult = 4;

        Calculator c = new Calculator();
        int actual = c.sub(24,6);

        assertEquals(expectedResult,actual);
    }

    
}

