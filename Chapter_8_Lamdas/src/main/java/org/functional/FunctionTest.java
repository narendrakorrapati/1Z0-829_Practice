package org.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

    /*
    A Function is responsible for turning one parameter into a value of a potentially different
type and returning it. Similarly, a BiFunction is responsible for turning two parameters into a
value and returning it.
     */

    public static void main(String[] args) {

        Function<String, Integer> f1 = Integer::valueOf;
        Function<String, Integer> f2 = string -> Integer.valueOf(string);

        System.out.println(f1.apply("10"));
        System.out.println(f2.apply("10"));

        Function<String, String> f3 = String::toUpperCase;
        Function<String, String> f4 = string -> string.toUpperCase();

        System.out.println(f3.apply("Narendra"));
        System.out.println(f4.apply("Narendra"));

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, token) -> string.concat(token);

        System.out.println(b1.apply("Narendra", "Korrapati"));
        System.out.println(b2.apply("Narendra", "Korrapati"));

    }

}
