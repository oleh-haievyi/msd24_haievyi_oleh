package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    //statik logger for Calculator class
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {

        // Log debug mesage for add method
        logger.debug("Calling add with number1=" + number1 + " and number2=" + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {

        // Log debug mesage for minus method
        logger.debug("Calling minus with number1=" + number1 + " and number2=" + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {

        // Log debug mesage for divide method
        logger.debug("Calling divide with number1=" + number1 + " and number2=" + number2);
        if (number2 == 0) {

            // Log error message if divide by zero and throw exception
            logger.error("Division by zero error, number1=" + number1 + " and number2=" + number2);
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {

        // Log debug mesage for multiply method
        logger.debug("Calling multiply with number1=" + number1 + " and number2=" + number2);
        return number1 * number2;
    }

    public int factorial(int n) {

        // Log debug mesage for factorial method
        logger.debug("Calling factorial with n=" + n);
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}
