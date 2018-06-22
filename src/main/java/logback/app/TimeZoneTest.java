package logback.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.util.Date;

/**
 * @author rumman
 * @since 6/21/18
 */
public class TimeZoneTest {

    private static final Logger LOGGER= LoggerFactory.getLogger(TimeZoneTest.class);

    private static final ZoneId US_EASTERN = ZoneId.of("US/Eastern");
    private static final ZoneId US_HAWAII = ZoneId.of("US/Hawaii");

    public static void findCurrentDate() {
        LOGGER.debug("[TimeZoneTest::findCurrentDate] started");

        LOGGER.debug("[TimeZoneTest::findCurrentDate] timezone:{}, datetime:{}", US_HAWAII, LocalDateTime.now(US_HAWAII));
        LOGGER.debug("[TimeZoneTest::findCurrentDate] timezone:{}, datetime:{}", US_HAWAII, Date.from(ZonedDateTime.now(US_HAWAII).toInstant()));

//        Date date = Date.from(LocalDateTime.now(US_HAWAII));
//
//        LOGGER.debug("[TimeZoneTest::findCurrentDate] timezone:{}, datetime:{}",
//                Clock.system(US_HAWAII), date);
    }
}
