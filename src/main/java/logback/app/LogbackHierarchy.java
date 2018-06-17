package logback.app;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rumman
 * @since 6/17/18
 */
public class LogbackHierarchy {

    private static final Logger PARENT_LOGGER = (Logger) LoggerFactory.getLogger("logback.app");
    private static final Logger CHILD_LOGGER = (Logger) LoggerFactory.getLogger("logback.app.child");

    private LogbackHierarchy() {
        throw new IllegalStateException();
    }

    public static void testLogConfig() {

        PARENT_LOGGER.setLevel(Level.INFO);

        PARENT_LOGGER.warn("This message is logged because WARN > INFO.");
        PARENT_LOGGER.debug("This message is not logged because DEBUG < INFO.");

        CHILD_LOGGER.info("INFO == INFO");
        CHILD_LOGGER.debug("DEBUG < INFO");
    }
}
