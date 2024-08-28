package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAddition() {
        Integer a = 2;
        Integer b = 5;
        Integer result = calculator.addition(a,b);
        assertEquals(7, result);
    }

    @Test
    public void testSubstraction() {
        Integer a = 10;
        Integer b = 5;
        Integer result = calculator.substraction(a,b);
        assertEquals(5, result);
        a = 18;
        b = 5;
        result = calculator.substraction(a,b);
        assertEquals(13, result);
    }

    @Test
    public void testMultiplication() {
        Integer a = 6;
        Integer b = 4;
        Integer result = calculator.multiplication(a,b);
        assertEquals(24, result);
        a = 0;
        b = 0;
        result = calculator.multiplication(a,b);
        assertEquals(0, result);
    }

    @Test
    public void testDivision() {
        Integer a = 9;
        Integer b = 3;
        Integer result = calculator.division(a,b);
        assertEquals(3, result);
        ///là je teste un résultat impossible/////
        assertThrows(ArithmeticException.class,()->{
            calculator.division(2,0);
        }, "/by zero");
    }
}