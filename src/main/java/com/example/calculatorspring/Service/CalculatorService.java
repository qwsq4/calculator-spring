package com.example.calculatorspring.Service;

import com.example.calculatorspring.Component.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService extends Throwable {
    private Calculator calculator;

    public String calculatorWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public String calculatorPlus(int num1, int num2) {
        return calculator.plus(num1, num2);
    }

    public String calculatorMinus(int num1, int num2) {
        return calculator.minus(num1, num2);
    }

    public String calculatorMultiply(int num1, int num2) {
        return calculator.multiply(num1, num2);
    }

    public String calculatorDivide(int num1, int num2) throws IllegalArgumentException {
        try {
            return calculator.divide(num1, num2);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
