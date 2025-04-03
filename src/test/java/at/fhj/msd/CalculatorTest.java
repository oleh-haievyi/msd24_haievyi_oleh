package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    //add
    @Test
    @DisplayName("add with normal values")
    void testAddNormalValues() {
        assertEquals(5.0, calc.add(2, 3));
    }

    @Test
    @DisplayName("add with zero")
    void testAddWithZero() {
        assertEquals(0.0, calc.add(0, 0));
    }

    @Test
    @DisplayName("add with negative number")
    void testAddWithNegative() {
        assertEquals(1.0, calc.add(-2, 3));
    }

    //minus
    @Test
    @DisplayName("minus normal numbers")
    void testMinusNormal() {
        assertEquals(7.0, calc.minus(10, 3));
    }

    @Test
    @DisplayName("minus with zero")
    void testMinusWithZero() {
        assertEquals(5.0, calc.minus(5, 0));
    }

    @Test
    @DisplayName("minus with negative")
    void testMinusWithNegative() {
        assertEquals(-6.0, calc.minus(-3, 3));
    }

    // multiply
    @Test
    @DisplayName("multiply positive numbers")
    void testMultiplyNormal() {
        assertEquals(12.0, calc.multiply(3, 4));
    }

    @Test
    @DisplayName("multiply with zero")
    void testMultiplyWithZero() {
        assertEquals(0.0, calc.multiply(7, 0));
    }

    @Test
    @DisplayName("multiply with negative number")
    void testMultiplyWithNegative() {
        assertEquals(-15.0, calc.multiply(-5, 3));
    }

    //divide
    @Test
    @DisplayName("divide normal numbers")
    void testDivideNormal() {
        assertEquals(5.0, calc.divide(10, 2));
    }

    @Test
    @DisplayName("divide with 1")
    void testDivideByOne() {
        assertEquals(9.0, calc.divide(9, 1));
    }

    @Test
    @DisplayName("divide with negative number")
    void testDivideWithNegative() {
        assertEquals(-2.5, calc.divide(5, -2));
    }

    //factorial
    @Test
    @DisplayName("factorial 3 should 6")
    void testFactorialOfThree() {
        assertEquals(6, calc.factorial(3));
    }

    @Test
    @DisplayName("factorial 0 should 1")
    void testFactorialOfZero() {
        assertEquals(1, calc.factorial(0));
    }

    @Test
    @DisplayName("factorial 1 should be 1")
    void testFactorialOfOne() {
        assertEquals(1, calc.factorial(1));
    }

    // 🔴 TDD-RED-Test
    @Test
    void testFactorial() {
        Calculator calc = new Calculator();
        assertEquals(120, calc.factorial(5)); // schlägt fehl, weil Methode noch nicht korrekt ist
    }
}
