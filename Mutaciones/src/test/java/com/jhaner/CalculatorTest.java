package com.jhaner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertThat(calc.add(2, 3)).isEqualTo(5);
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertThat(calc.subtract(3, 2)).isEqualTo(1);
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertThat(calc.multiply(2, 3)).isEqualTo(6);
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertThat(calc.divide(6, 3)).isEqualTo(2);
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
        assertThat(exception.getMessage()).isEqualTo("Divisor cannot be zero");
    }
}
