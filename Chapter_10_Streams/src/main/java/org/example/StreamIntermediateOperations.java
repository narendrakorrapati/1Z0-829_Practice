package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

    public static void main(String[] args) {
        filter();
        distinct();
        restrictingByPosition();
        System.out.println();
        map();
        flatMap();
        sorted();
        peek();
    }

    private static void peek() {
        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s ->
                        s.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }

    private static void sorted() {

        Stream<String> s = Stream.of("brown-",
                "bear-");
        s.sorted()
                .forEach(System.out::print); // bear-brown-

        Stream<String> s1 = Stream.of("brown bear-",
                "grizzly-");
        s1.sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear-
    }

    private static void flatMap() {

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream()).forEach(System.out::println);
    }

    private static void map() {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::print); //676
    }

    private static void restrictingByPosition() {
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(5)
                .limit(2)
                .forEach(System.out::print); // 67
    }

    private static void distinct() {
        Stream<String> s = Stream.of("monkey", "gorilla", "monkey", "bonobo");
        s.distinct().forEach(System.out::println); //monkey, gorilla, bonobo
    }

    private static void filter() {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(a -> a.startsWith("m")).forEach(System.out::println); // monkey
    }
}
