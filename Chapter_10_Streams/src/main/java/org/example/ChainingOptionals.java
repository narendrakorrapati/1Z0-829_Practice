package org.example;

import java.util.Optional;

public class ChainingOptionals {

    public static void main(String[] args) {

    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    private static void threeDigitFunctional(Optional<Integer> optional) {
        optional.map(n ->
                        "" + n) // part 1
                .filter(s ->
                        s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }
}
