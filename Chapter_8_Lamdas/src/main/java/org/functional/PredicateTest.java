package org.functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

    //Predicate is often used when filtering or matching. Both are common operations

    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = s -> s.isEmpty();

        System.out.println(p1.test("")); //true
        System.out.println(p2.test("")); //true

        BiPredicate<String, String> b1 = String::contains;
        BiPredicate<String, String> b2 = (string, token) -> string.contains(token);

        System.out.println(b1.test("Narendra", "ren"));
        System.out.println(b2.test("Narendra", "ren"));
    }
}
