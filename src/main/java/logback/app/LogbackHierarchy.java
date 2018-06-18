package logback.app;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.Logger.ROOT_LOGGER_NAME;

/**
 * @author rumman
 * @since 6/17/18
 */
public class LogbackHierarchy {

    private static final Logger ROOT_LOGGER = (Logger) LoggerFactory.getLogger(ROOT_LOGGER_NAME);
    private static final Logger PARENT_LOGGER = (Logger) LoggerFactory.getLogger("logback.app");
    private static final Logger CHILD_LOGGER = (Logger) LoggerFactory.getLogger("logback.app.child");

    private LogbackHierarchy() {
        throw new IllegalStateException();
    }

    public static void testLogHierarchy() {

        PARENT_LOGGER.setLevel(Level.INFO);

        PARENT_LOGGER.warn("[LogbackHierarchy testLogHierarchy] This message is logged because WARN > INFO.");
        PARENT_LOGGER.debug("[LogbackHierarchy testLogHierarchy] This message is not logged because DEBUG < INFO.");

        CHILD_LOGGER.info("[LogbackHierarchy testLogHierarchy] INFO == INFO");
        CHILD_LOGGER.debug("[LogbackHierarchy testLogHierarchy] DEBUG < INFO");
    }

    public static void testEffectiveLevel() {
        PARENT_LOGGER.debug("[LogbackHierarchy testEffectiveLevel] This message is logged because DEBUG == DEBUG.");

        ROOT_LOGGER.setLevel(Level.ERROR);

        PARENT_LOGGER.warn("[LogbackHierarchy testEffectiveLevel] This message is not logged because WARN < ERROR.");
        PARENT_LOGGER.error("[LogbackHierarchy testEffectiveLevel] This is logged.");

        ROOT_LOGGER.setLevel(Level.DEBUG);
    }
}
