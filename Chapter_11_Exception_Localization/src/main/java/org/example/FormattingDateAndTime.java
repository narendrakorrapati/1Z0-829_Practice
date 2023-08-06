package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormattingDateAndTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(13, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));

        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mma");
        System.out.println(dt.format(f));

        dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1)); // 10/20/2022 06:15:30
        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-dd");
        System.out.println(dt.format(formatter2)); // 10_2022_-20
        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
        //System.out.println(dt.format(formatter3)); // DateTimeException

        formatter1.format(dt);

        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1)); // October 20, Party's at 06:15

        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
        System.out.println(dt.format(g2)); // System format, hh:mm: 06:15

        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dt.format(g3)); // NEW! 2022, yay!
    }
}
