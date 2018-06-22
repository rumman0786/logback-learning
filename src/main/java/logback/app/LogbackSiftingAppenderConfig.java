package logback.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author rumman
 * @since 6/22/18
 */
public class LogbackSiftingAppenderConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger("com.baeldung.logback.sift");

    public static void testThreadOne() {
        MDC.put("username", "rumman");
        LOGGER.debug("Using Sifting appender by user: {}", MDC.get("username"));
    }

    public static void testThreadTwo() {
        MDC.put("username", "ashraf");
        LOGGER.debug("Using Sifting appender by user: {}", MDC.get("username"));
    }
}
