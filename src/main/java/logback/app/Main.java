package logback.app;

/**
 * @author rumman
 * @since 6/17/18
 */
public class Main {

    enum Mode {
        LOGGING_BASIC,
        LOGGING_HIERARCHY,
        LOGGING_PARAMETERIZED_MSG,
        LOGGING_HIERARCHY_LEVEL_FROM_CONFIG,
        SIFTING_APPENDER,
        TIMEZONE
    }

    public static void main(String[] args) {
        Mode mode = Mode.SIFTING_APPENDER;

        switch (mode) {
            case LOGGING_BASIC:
                LogbackExample.basicLog();
                break;

            case LOGGING_HIERARCHY:
                LogbackHierarchy.testEffectiveLevel();
                LogbackHierarchy.testLogHierarchy();
                break;

            case LOGGING_PARAMETERIZED_MSG:
                LogbackParameterizedMessage.concatOptions();
                LogbackParameterizedMessage.otherParamOptions();
                break;

            case LOGGING_HIERARCHY_LEVEL_FROM_CONFIG:
                LogbackHierarchyLevelFromConfig.testLogLevel();
                break;

            case SIFTING_APPENDER:
                LogbackSiftingAppenderConfig.testThreadOne();
                LogbackSiftingAppenderConfig.testThreadTwo();
                break;

            case TIMEZONE:
                TimeZoneTest.findCurrentDate();
                break;

            default:
                throw new IllegalStateException();
        }
    }
}
