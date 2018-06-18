package logback.app;

import static logback.app.Main.Mode.LOGGING_HIERARCHY;

/**
 * @author rumman
 * @since 6/17/18
 */
public class Main {

    enum Mode {
        LOGGING_BASIC,
        LOGGING_HIERARCHY
    }

    public static void main(String[] args) {
        Mode mode = LOGGING_HIERARCHY;

        switch (mode) {
            case LOGGING_BASIC:
                LogbackExample.basicLog();
                break;

            case LOGGING_HIERARCHY:
                LogbackHierarchy.testEffectiveLevel();
                LogbackHierarchy.testLogHierarchy();
                break;

            default:
                throw new IllegalStateException();
        }
    }
}
