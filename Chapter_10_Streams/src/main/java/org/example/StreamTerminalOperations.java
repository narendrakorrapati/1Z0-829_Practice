package org.example;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperations {

    public static void main(String[] args) {
        counting();
        minAndMax();
        find();
        match();
        iterating();
        reducing();
        collecting();
    }

    private static void collecting() {

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(word); // wolf

        Stream<String> streamSet = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = streamSet.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set1 =
                stream1.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1); // [f, l, o, w]

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        Set<String> set2 = stream2.collect(Collectors.toSet());
        System.out.println(set2); // [f, w, l, o]

    }

    private static void reducing() {
        Stream<String> stream = Stream.of("W", "O", "L", "F");
        String reduced = stream.reduce("", (s, c) -> s+c); //("",W) return W; (W,O) return WO; (WO,L) return WOL; (WOL,F) return WOLF
        System.out.println(reduced);

        Stream<Integer> numberStream = Stream.of(3, 5, 6);
        System.out.println(numberStream.reduce(1, (a, b) -> a*b)); // 90

        BinaryOperator<Integer> op = (a, b) ->
                a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        Stream<String> stream1 = Stream.of("w", "o", "l", "f!");
        int length = stream1.reduce(0, (i, s) -> i+s.length(), (a, b) -> a + b);
        System.out.println(length); // 5
    }

    private static void iterating() {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::println); // MonkeyGorillaBonobo

        Stream<Integer> s1 = Stream.of(1);
        //for (Integer i : s1) {} // DOES NOT COMPILE
    }

    private static void match() {
        var list = List.of("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true
    }

    private static void find() {

        Stream<String> s = Stream.of("monkey", "tiger", "lion");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("not-found"));
    }

    static void counting() {
        Stream<Integer> oddNumbers = Stream.iterate(1, i -> i< 100, i -> i+2);
        System.out.println(oddNumbers.count());
    }

    static void minAndMax() {
        Stream<Integer> numbers = Stream.of(1, 2, 100, -500);
        Optional<Integer> min = numbers.min(Comparator.naturalOrder());
        min.ifPresent(System.out::println);

        numbers = Stream.of(1, 2, 100, -500); //Can't operate on a Stream more than once. It will be closed upon first usage. So crated a new Stream
        Optional<Integer> max = numbers.max((o1, o2) -> o1.compareTo(o2));

        Integer maxVal = max.orElseGet(() -> Integer.valueOf("10"));
        System.out.println(maxVal);
    }
}
