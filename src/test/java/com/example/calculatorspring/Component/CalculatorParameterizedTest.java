package com.example.calculatorspring.Component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorParameterizedTest {
    public static Stream<Arguments> provideParamForPlusTests() {
        return Stream.of(
                Arguments.of(0, 2),
                Arguments.of(5, 8),
                Arguments.of(10, 6),
                Arguments.of(1000, 257),
                Arguments.of(21384, 7323),
                Arguments.of(123, 2),
                Arguments.of(532, 569)
        );
    }

    public static Stream<Arguments> provideParamForMinusTests() {
        return Stream.of(
                Arguments.of(2348, 7244),
                Arguments.of(7653, 2421),
                Arguments.of(25214, 85847),
                Arguments.of(46352, 25426),
                Arguments.of(242569, 6574),
                Arguments.of(1346, 5564),
                Arguments.of(245, 868)
        );
    }

    public static Stream<Arguments> provideParamForMultiplyTests() {
        return Stream.of(
                Arguments.of(35, 24),
                Arguments.of(86, 32),
                Arguments.of(45, 6),
                Arguments.of(245, 8),
                Arguments.of(343, 1),
                Arguments.of(123, 2)
                );
    }

    public static Stream<Arguments> provideParamForDivideTests() {
        return Stream.of(
                Arguments.of(0, 2),
                Arguments.of(5, 8),
                Arguments.of(10, 6),
                Arguments.of(1000, 257),
                Arguments.of(5225, 7323),
                Arguments.of(123, 2),
                Arguments.of(532, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamForPlusTests")
    public void plusTests(int num1, int num2) {
        Calculator calculator = new Calculator();
        String expected = calculator.plus(num1, num2);
        String actual = num1 + " + " + num2 + " = " + (num1 + num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamForMinusTests")
    public void minusTests(int num1, int num2) {
        Calculator calculator = new Calculator();
        String expected = calculator.minus(num1, num2);
        String actual = num1 + " - " + num2 + " = " + (num1 - num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamForMultiplyTests")
    public void multiplyTests(int num1, int num2) {
        Calculator calculator = new Calculator();
        String expected = calculator.multiply(num1, num2);
        String actual = num1 + " * " + num2 + " = " + (num1 * num2);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamForDivideTests")
    public void divideTests(int num1, int num2) {
        Calculator calculator = new Calculator();
        try {
            String expected = calculator.divide(num1, num2);
            String actual = num1 + " / " + num2 + " = " + (num1 / num2);
            Assertions.assertEquals(expected, actual);
        } catch (IllegalArgumentException e) {
            String expected = e.getMessage();
            String actual = "Делитель не может быть равен 0";
            Assertions.assertEquals(expected, actual);
        }
    }
}
