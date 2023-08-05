package org.example;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n)); // 6

        Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3);
        int sum = streamOfIntegers.mapToInt(i -> i).sum();
        System.out.println(sum);

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble average = intStream.average();
        System.out.println(average.getAsDouble());
    }
}
