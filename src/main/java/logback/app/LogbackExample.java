package logback.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rumman
 * @since 6/17/18
 */
public class LogbackExample {
    private static final Logger logger = LoggerFactory.getLogger(LogbackExample.class);

    private LogbackExample() {
        throw new IllegalStateException();
    }

    public static void basicLog() {
        logger.info("Example log from {}", LogbackExample.class.getSimpleName());
    }
}
