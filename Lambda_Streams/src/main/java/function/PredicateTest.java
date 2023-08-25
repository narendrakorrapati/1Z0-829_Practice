package function;

import java.util.function.*;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<String> predicate = (string) -> string.startsWith("N");
        BiPredicate<String, Integer> biPredicate = (string, integer) -> string.length() == integer;

        IntPredicate intPredicate = (integer) -> integer > 10;
        DoublePredicate doublePredicate = (d) -> d < 10;
        LongPredicate longPredicate = (l) -> l%2 == 0;

        System.out.println(predicate.test("Narendra"));
        System.out.println(biPredicate.test("Narendra", 8));
        System.out.println(intPredicate.test(10));
        System.out.println(doublePredicate.test(18));
        System.out.println(longPredicate.test(20));
    }
}
