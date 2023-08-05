package org.example;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MappingMethods {

    public static void main(String[] args) {
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s ->
                s.length());
        Stream<String> integerStream = intStream.mapToObj(i -> new String(i+""));
        LongStream longStream1 = intStream.mapToLong(i -> i*2);
        LongStream longStream = intStream.asLongStream(); //equals to i->i

        Stream<Integer> boxed = intStream.boxed();
    }
}
