package org.example;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExamples {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears

        var animals1 = Stream.of("lions", "tigers", "bears");
        Double average = animals1.collect(Collectors.averagingInt(String::length));

        var animals2 = Stream.of("lions", "tigers", "bears");
        Optional<String> min = animals2.collect(Collectors.minBy(Comparator.naturalOrder()));

        var animals3 = Stream.of("lions", "tigers", "bears");
        long count = animals3.collect(Collectors.counting());

        var animals4 = Stream.of("lions", "tigers", "bears");
        animals4.collect(Collectors.filtering(s-> s.length() > 5, Collectors.toList()));

    }
}
