package logback.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rumman
 * @since 6/20/18
 */
public class LogbackHierarchyLevelFromConfig {

    private static final Logger DEFAULT_LOGGER= LoggerFactory.getLogger("com.baeldung.foobar");
    private static final Logger ANCESTOR_LOGGER = LoggerFactory.getLogger("com.baeldung.logback");
    private static final Logger CHILD_LOGGER = LoggerFactory.getLogger("com.baeldung.logback.tests");

    public static void testLogLevel() {
        DEFAULT_LOGGER.debug("This is logged from foobar");

        ANCESTOR_LOGGER.debug("This is not logged from logger");
        ANCESTOR_LOGGER.info("This is logged from logger");

        CHILD_LOGGER.info("This is not logged from tests");
        CHILD_LOGGER.warn("This is logged from tests");
    }
}
