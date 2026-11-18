package com.example.calculator.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculator = new CalculatorService();
    @Test void addsNumbers() { assertEquals(9.0, calculator.calculate(4, 5, "add")); }
    @Test void subtractsNumbers() { assertEquals(2.0, calculator.calculate(5, 3, "subtract")); }
    @Test void multipliesNumbers() { assertEquals(20.0, calculator.calculate(4, 5, "multiply")); }
    @Test void dividesNumbers() { assertEquals(2.0, calculator.calculate(10, 5, "divide")); }
    @Test void rejectsDivisionByZero() { assertThrows(IllegalArgumentException.class, () -> calculator.calculate(10, 0, "divide")); }
}
