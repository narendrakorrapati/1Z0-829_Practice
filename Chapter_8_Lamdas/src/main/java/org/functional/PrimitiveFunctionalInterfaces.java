package org.functional;

import java.util.List;
import java.util.function.*;

public class PrimitiveFunctionalInterfaces {

    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random()> .5;
        System.out.println(b1.getAsBoolean()); // true
        System.out.println(b2.getAsBoolean()); // false

        DoubleFunction<Double> d1 = value -> value * 2;

        System.out.println(d1.apply(1.0));
    }

    public void remove(List<Character> chars) {
        char end = 'z';


        Predicate<Character> predicate = (var c) -> {
            char start = 'a'; return start <= c && c <= end; };

        char start = 'a';

// INSERT LINE HERE
    }


}
