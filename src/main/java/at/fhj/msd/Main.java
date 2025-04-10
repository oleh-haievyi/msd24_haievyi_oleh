package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    // Insert statik logger for this class
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        // Log that the program started
        logger.info("Program is started");  // Исправлено здесь

        Calculator calc = new Calculator();

        // Before add call, log the operation
        logger.debug("CAlling add with 10 and 5");
        System.out.println("Addition: " + calc.add(10, 5));

        // Before minus call, log the operation
        logger.debug("Calling minus with 10 and 5");
        System.out.println("Subtraction: " + calc.minus(10, 5));

        // Before multiply call, log the operation
        logger.debug("Calling multiply with 10 and 5");
        System.out.println("Multiplication: " + calc.multiply(10, 5));

        // Before divide call, log the operation
        logger.debug("Calling divide with 10 and 5");
        System.out.println("Division: " + calc.divide(10, 5));

        // Insert an error log sample
        logger.error("This is an error log sample");
        
        System.out.println("Oleh Haievyi");
    }
}
