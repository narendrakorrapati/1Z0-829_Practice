package org.example;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.stream.Stream;

public class LocalizationExamples {

    public static void main(String[] args) throws ParseException {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(new Locale("en"));
        System.out.println(new Locale("en", "IN"));

        Locale enCA = new Locale.Builder().setRegion("CA").setLanguage("en").build();
        System.out.println(enCA);

        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US);
        System.out.println(formatter.format(attendeesPerMonth));

        NumberFormat formatter1 = NumberFormat.getNumberInstance(Locale.GERMAN);
        System.out.println(formatter1.format(attendeesPerMonth));

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));

        var usLocale = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(usLocale.format(price));

        double successRate = 0.802;
        NumberFormat successRateUS = NumberFormat.getPercentInstance(Locale.US);
        NumberFormat successRateGermany = NumberFormat.getPercentInstance(Locale.GERMANY);

        System.out.println(successRateUS.format(successRate));
        System.out.println(successRateGermany.format(successRate));

        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(s)); // 40.45

        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s)); // 40

        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (Double) cf.parse(income);
        System.out.println(value); // 92807.99

        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG),
                NumberFormat.getNumberInstance());
        formatters.map(s1 -> s1.format(7_123_456)).forEach(System.out::println);

    }
}
