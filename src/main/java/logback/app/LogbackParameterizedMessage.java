package logback.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rumman
 * @since 6/18/18
 */
public class LogbackParameterizedMessage {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackParameterizedMessage.class.getSimpleName());

    public static void concatOptions() {
        int count = 0;

        /*
        * Bad
        * cost creating message added wheather message logged or not.
        * */
        LOGGER.debug("Current Count is " + count);

        /*
         * Good
         * message constructed only after verifying message will be logged
         * */
        LOGGER.debug("Current Count is {} ", count);
    }

    public static void otherParamOptions() {
        String message = "This is a string message";
        int numerator = 0;
        int denominator = 0;

        try {
            LOGGER.debug("Logging message {}", message);
            LOGGER.debug("Going to divide {} by {}", numerator, denominator);

            int result = numerator / denominator;

        } catch (ArithmeticException e) {
            LOGGER.debug("Error Occured while dividing {} by {}", numerator, denominator, e);
        }
    }
}
