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

    @Test
    @DisplayName("add with normal values")
    void testAddNormalValues() {
        assertEquals(5.0, calc.add(2, 3), "2 + 3 should be 5");
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
}
