package org.example;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class CreatingPrimitiveStreams {

    public static void main(String[] args) {
        DoubleStream empty = DoubleStream.empty();
        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d ->
                d / 2);
        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n ->
                n+1).limit(5);
        count.forEach(System.out::print); // 12345

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print); // 12345

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345
    }
}
