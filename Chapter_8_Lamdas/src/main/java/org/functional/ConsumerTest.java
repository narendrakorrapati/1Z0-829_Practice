package org.functional;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

    //Printing is a common use of the Consumer interface:
    public static void main(String[] args) {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie"); // Annie
        c2.accept("Annie"); // Annie

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map); // {chicken=7, chick=1}

        var map1 = new HashMap<String, String>();
        BiConsumer<String, String> b3 = map1::put;
        BiConsumer<String, String> b4 = (k, v) -> map1.put(k, v);

        b3.accept("chicken", "Cluck");
        b4.accept("chick", "Tweep");
        System.out.println(map1); // {chicken=Cluck, chick=Tweep}
    }
}
