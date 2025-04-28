package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

<<<<<<< HEAD
public class Calculator {

    //statik logger for Calculator class
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {

        // Log debug mesage for add method
=======
/**
 * A simple calculator that can add, subtract, multiply, divide numbers
 * and calculate the factorial of a number.
 */
public class Calculator {

    //static logger for Calculator class
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Adds two numbers together.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of number1 and number2
     */
    public double add(double number1, double number2) {
>>>>>>> 90c8d8a (add good style guide page and fix site navigation)
        logger.debug("Calling add with number1=" + number1 + " and number2=" + number2);
        return number1 + number2;
    }

<<<<<<< HEAD
    public double minus(double number1, double number2) {

        // Log debug mesage for minus method
=======
    /**
     * Subtracts the second number from the first number.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the result of number1 minus number2
     */
    public double minus(double number1, double number2) {
>>>>>>> 90c8d8a (add good style guide page and fix site navigation)
        logger.debug("Calling minus with number1=" + number1 + " and number2=" + number2);
        return number1 - number2;
    }

<<<<<<< HEAD
    public double divide(double number1, double number2) {

        // Log debug mesage for divide method
        logger.debug("Calling divide with number1=" + number1 + " and number2=" + number2);
        if (number2 == 0) {

            // Log error message if divide by zero and throw exception
=======
    /**
     * Divides the first number by the second number.
     *
     * @param number1 the numerator
     * @param number2 the denominator
     * @return the result of number1 divided by number2
     * @throws ArithmeticException if number2 is zero
     */
    public double divide(double number1, double number2) {
        logger.debug("Calling divide with number1=" + number1 + " and number2=" + number2);
        if (number2 == 0) {
>>>>>>> 90c8d8a (add good style guide page and fix site navigation)
            logger.error("Division by zero error, number1=" + number1 + " and number2=" + number2);
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

<<<<<<< HEAD
    public double multiply(double number1, double number2) {

        // Log debug mesage for multiply method
=======
    /**
     * Multiplies two numbers together.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the product of number1 and number2
     */
    public double multiply(double number1, double number2) {
>>>>>>> 90c8d8a (add good style guide page and fix site navigation)
        logger.debug("Calling multiply with number1=" + number1 + " and number2=" + number2);
        return number1 * number2;
    }

<<<<<<< HEAD
    public int factorial(int n) {

        // Log debug mesage for factorial method
=======
    /**
     * Calculates the factorial of a number.
     *
     * @param n the number
     * @return the factorial of n
     */
    public int factorial(int n) {
>>>>>>> 90c8d8a (add good style guide page and fix site navigation)
        logger.debug("Calling factorial with n=" + n);
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
