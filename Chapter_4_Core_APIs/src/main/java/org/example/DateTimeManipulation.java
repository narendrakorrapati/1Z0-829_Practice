package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeManipulation {
    public static void main(String[] args) {
        plusMinusMethods();
    }

    static void plusMinusMethods() {
        var date = LocalDate.of(2020, Month.JULY, 24);
        System.out.println(date);
        date = date.plusDays(20);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(2);
        System.out.println(date);
        date = date.plusYears(1);
        System.out.println(date);

        date = date.minusDays(20);
        System.out.println(date);
        date = date.minusWeeks(1);
        System.out.println(date);
        date = date.minusMonths(2);
        System.out.println(date);
        date = date.minusYears(1);
        System.out.println(date);

        var date1 = LocalDate.of(2024, Month.JANUARY, 20);
        var time1 = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time1);

        System.out.println(dateTime); // 2024–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2024–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2024–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2024–01–18T19:14:30

        var date2 = LocalDate.of(2024, Month.JANUARY, 20);
        var time2 = LocalTime.of(5, 15);
        var dateTime2 = LocalDateTime.of(date2, time2)
                .minusDays(1).minusHours(10).minusSeconds(30);

        int[][] java = new int[0][];

        double d = 10L;
    }

}
