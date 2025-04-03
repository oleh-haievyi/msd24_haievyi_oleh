package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5.0, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.minus(3, 2));
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(6.0, calc.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2.0, calc.divide(6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
    }
}  
