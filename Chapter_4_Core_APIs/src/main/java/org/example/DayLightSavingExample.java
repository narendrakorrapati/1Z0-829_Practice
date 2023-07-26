package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DayLightSavingExample {

    public static void main(String[] args) {
        testDayLight();
    }

    static void testDayLight() {
        var date = LocalDate.of(2022, Month.MARCH, 13);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime1 = ZonedDateTime.of(date, time, zone);
        var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
        long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int hour = dateTime2.getHour();
        boolean offset = dateTime1.getOffset()
                == dateTime2.getOffset();
        System.out.println("diff = " + diff);
        System.out.println("hour = " + hour);
        System.out.println("offset = " + offset);
    }
}
