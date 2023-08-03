package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

    public static void main(String[] args) {


    }

    private static void convertToArray() {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        set.forEach(System.out::println);

        Integer[] array = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
    }

    private static void addTreeSet() {
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        set.forEach(System.out::println);

        //8
        //10
        //66
    }

    private static void add() {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        set.forEach(System.out::println);

        //66
        //8
        //10

        //Prints any arbitary order
    }

    private static void factoryMethods() {
        Character[] charArray = new Character[] {'z', 'o', 'i'};

        Set<Character> letters = Set.of(charArray); //Creates Immutable Set
        Set<Character> copy = Set.copyOf(letters); //Creates Immutable Set

        copy.add('e'); //UnsupportedOperationException
        letters.add('e'); //UnsupportedOperationException
    }
}
