package com.example.calculatorspring.Component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void calculatorPlusShouldReturn8() {
        Calculator calculator = new Calculator();
        String expected = calculator.plus(3, 5);
        String actual = "3 + 5 = 8";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorPlusShouldReturn5() {
        Calculator calculator = new Calculator();
        String expected = calculator.plus(1, 4);
        String actual = "1 + 4 = 5";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorMinusShouldReturn7() {
        Calculator calculator = new Calculator();
        String expected = calculator.minus(18, 11);
        String actual = "18 - 11 = 7";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorMinusShouldReturnMinus1() {
        Calculator calculator = new Calculator();
        String expected = calculator.minus(40, 41);
        String actual = "40 - 41 = -1";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorMultiplyShouldReturn27() {
        Calculator calculator = new Calculator();
        String expected = calculator.multiply(3, 9);
        String actual = "3 * 9 = 27";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorMultiplyShouldReturn64() {
        Calculator calculator = new Calculator();
        String expected = calculator.multiply(8, 8);
        String actual = "8 * 8 = 64";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorDivideShouldReturn3() {
        Calculator calculator = new Calculator();
        String expected = calculator.divide(9, 3);
        String actual = "9 * 3 = 3";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorDivideShouldReturn9() {
        Calculator calculator = new Calculator();
        String expected = calculator.divide(36, 4);
        String actual = "36 * 4 = 9";
        assertEquals(expected, actual);
    }

    @Test
    public void calculatorDivideShouldReturnIllegalArgumentException() {
        Calculator calculator = new Calculator();
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->
        {calculator.divide(2,0);});
        assertEquals("Делитель не может быть равен 0 ", thrown.getMessage());
    }
}
