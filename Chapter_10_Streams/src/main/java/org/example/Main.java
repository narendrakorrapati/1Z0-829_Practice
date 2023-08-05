package org.example;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        IntStream.of(6, 8, 10).boxed().collect(Collectors.groupingBy( x->x));

        IntStream.of(6, 8, 10).mapToObj(x->x).collect(Collectors.groupingBy(x->x));

        /* Does not compile as Collectors.groupingBy takes non primitives only.
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x ->
                        (int) x)
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x ->
                        x));

         */

        Stream.iterate(1, x ->
                        x++)
                .limit(5).map(x -> "" + x)
                .collect(Collectors.joining());

        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();
        var result = Stream.generate(() ->
                        "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k ->
                        k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);

    }
}