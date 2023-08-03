package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {


    }

    private static void putIfAbsent() {
    /*The putIfAbsent() method sets a value in the map but skips it if the value is already set to a
    non-null value. */

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
    }

    private static void replace() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 4);
        Integer original = map.replace(2, 10); // 4
        System.out.println(map); // {1=2, 2=10}
        map.replaceAll((k, v) ->
                k + v);
        System.out.println(map); // {1=3, 2=12}
    }
}
