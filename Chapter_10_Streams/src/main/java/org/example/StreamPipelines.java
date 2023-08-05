package org.example;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelines {

    public static void main(String[] args) {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        Stream<String> stream = list.stream();
        stream.filter(s->s.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
