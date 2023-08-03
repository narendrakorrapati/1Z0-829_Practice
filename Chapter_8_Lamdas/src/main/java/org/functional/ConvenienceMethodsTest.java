package org.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethodsTest {

    public static void main(String[] args) {

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggsX = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggsX = s -> s.contains("egg") && !s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);
        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie"); // 1: Annie,2: Annie

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined1 = after.compose(before); //before is evaluated first and then the after.
        System.out.println(combined1.apply(3)); // 8
    }
}
