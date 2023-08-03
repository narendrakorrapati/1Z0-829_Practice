package org.example;

import java.util.*;

public class CollectionMethods {

    public static void main(String[] args) {


    }

    private static void determiningEquality() {
        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);
        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);
        System.out.println(list1.equals(list2)); // false
        System.out.println(set1.equals(set2)); // true
        System.out.println(list1.equals(set1)); // false
    }

    private static void iteratingCollection() {
        Collection<String> list = new ArrayList<>();
        list.add("narendra");
        list.add("korrapati");

        list.forEach(s -> System.out.println(s));

        for(String s: list)
            System.out.println(s);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    private static void removeWithCondition() {
        Collection<String> list = new ArrayList<>();
        list.add("narendra");
        list.add("korrapati");

        list.removeIf(s->s.startsWith("k"));

        System.out.println(list); //[narendra]
    }

    private static void checkingContents() {
        Collection<String> list = new ArrayList<>();
        list.add("narendra");
        list.add("korrapati");

        System.out.println(list.contains("narendra")); //true
        System.out.println(list.contains("abc")); //false
    }

    private static void clearingCollection() {
        Collection<String> list = new ArrayList<>();
        list.add("narendra");
        list.add("korrapati");

        System.out.println(list.isEmpty()); //false
        System.out.println(list.size()); //2

        list.clear();

        System.out.println(list.isEmpty()); //true
        System.out.println(list.size()); //0
    }

    private static void countingElements() {
        Collection<String> list = new ArrayList<>();

        System.out.println(list.isEmpty()); //true
        System.out.println(list.size()); //0

        list.add("narendra");
        list.add("korrapati");

        System.out.println(list.isEmpty()); //false
        System.out.println(list.size()); //2
    }

    private static void removeData() {
        //Removing data
        Collection<String> list = new ArrayList<>();

        list.add("narendra");
        list.add("korrapati");

        System.out.println(list.remove("korrapati")); //true
        System.out.println(list.remove("abc")); //false
        System.out.println(list); //[narendra]
    }

    static void addData() {
        //Adding data
        Collection<String> list = new ArrayList<>();

        System.out.println(list.add("sparrow")); //true
        System.out.println(list.add("sparrow")); //true
        System.out.println(list); // [sparrow, sparrow]

        Collection<String> set = new HashSet<>();

        System.out.println(set.add("sparrow")); //true
        System.out.println(set.add("sparrow")); //false
        System.out.println(set); //[sparrow]
    }
}
