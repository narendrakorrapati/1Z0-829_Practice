package org.example;

import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        //Creating Finite Streams

        Stream<Integer> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        var list = List.of(1, 2, 3);
        Stream<Integer> fromList = list.stream();
        Stream<Integer> parallelStream = list.parallelStream();

        //Creating infinite Streams
        Stream<Double> infiniteDouble = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, integer -> integer + 2);

        //Creating odd numbers up to 100
        Stream<Integer> oddNumbersFinite = Stream.iterate(1, integer -> integer<100 , integer -> integer+2);
    }
}
