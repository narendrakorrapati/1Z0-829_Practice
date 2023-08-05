package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingMaps {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");

        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s->s, String::length));

        /* Does not compile because of duplicate key. We need to tell what to do if the duplicate key is found
        var ohMy1 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map1 = ohMy1.collect(Collectors.toMap(
                String::length,
                k -> k)); // BAD  */


        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2) //Indicates what to do if there is a duplicate key. In this case, values are separated by coma
        );
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // class java.util.HashMap

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy3.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) ->s1 + "," + s2,
                TreeMap::new) //Optionally we can provide the map type that we need
        );
        System.out.println(map); // // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // class java.util.TreeMap

        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map4= ohMy4.collect(Collectors.groupingBy(String::length));

        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map5= ohMy5.collect(Collectors.groupingBy(String::length, Collectors.toSet()));

        var ohMy6 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map6= ohMy6.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

        var ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map7 = ohMy7.collect(
                Collectors.partitioningBy(s ->
                        s.length() <= 5));
        System.out.println(map7); // {false=[tigers], true=[lions, bears]}

        var ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map8 = ohMy8.collect(
                Collectors.partitioningBy(s ->
                        s.length() <= 7));
        System.out.println(map8); // {false=[], true=[lions, tigers, bears]}

        var ohMy9 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map9 = ohMy9.collect(
                Collectors.partitioningBy(
                        s ->
                                s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map9); // {false=[], true=[lions, tigers, bears]}

        var ohMy10 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map10 = ohMy10.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map10); // {5=2, 6=1}
    }
}
