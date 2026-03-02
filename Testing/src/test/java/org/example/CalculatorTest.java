package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubstract(){
        assertEquals(1, calculator.add(3, 2));
    }

    @Test
    public void testMultiply(){
        assertEquals(6, calculator.add(3, 2));
    }

    @Test
    public void testDivide(){
        assertEquals(1, calculator.add(3, 2));
    }
}
