package org.example;

import java.time.*;

public class DateAPIExamples {

    public static void main(String[] args) {
//        dateTest();
        createDates();
    }

    static void dateTest() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }

    static void createDates() {
        var date1 = LocalDate.of(2023, 7, 24);
        var date2 = LocalDate.of(2023, Month.JULY, 24);

        var time1 = LocalTime.of(15, 50);
        var time2 = LocalTime.of(15, 50, 55);
        var time3 = LocalTime.of(15, 50, 55, 999999999);

        var dateTime1 = LocalDateTime.of(2023, 7, 24, 15, 55);
        var dateTime2 = LocalDateTime.of(2023, Month.JULY, 24, 15, 55);

        var dateTime3 = LocalDateTime.of(2023, 7, 24, 15, 55, 55);
        var dateTime4 = LocalDateTime.of(2023, Month.JULY, 24, 15, 55, 55);

        var dateTime5 = LocalDateTime.of(2023, 7, 24, 15, 55, 55, 999999999);
        var dateTime6 = LocalDateTime.of(2023, Month.JULY, 24, 15, 55, 55, 999999999);

        var dateTime7 = LocalDateTime.of(date1, time1);

        var zone = ZoneId.of("US/Eastern");

        var zoned1 = ZonedDateTime.of(2023, 7, 24, 15, 55, 50, 99999999, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);

    }
}
