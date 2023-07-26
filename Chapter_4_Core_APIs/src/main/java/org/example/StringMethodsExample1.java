package org.example;

public class StringMethodsExample1 {

    public static void main(String[] args) {
    }

    static void charAtTest() {
        var name = "animals";

        System.out.println(name.charAt(0)); // a
        System.out.println(name.charAt(6)); // s
        System.out.println(name.charAt(7)); // exception
    }

    static void indexOfTest() {
        var name = "animals";
        System.out.println(name.indexOf('a')); // 0
        System.out.println(name.indexOf("al")); // 4
        System.out.println(name.indexOf('a', 4)); // 4
        System.out.println(name.indexOf("al", 5)); // -1
    }

    static void substringTest() {
        var name = "animals";
        System.out.println(name.substring(3)); // mals
        System.out.println(name.substring(name.indexOf('m'))); // mals
        System.out.println(name.substring(3, 4)); // m
        System.out.println(name.substring(3, 7)); // mals

        System.out.println(name.substring(3, 3)); // empty string
        System.out.println(name.substring(3, 2)); // exception
        System.out.println(name.substring(3, 8)); // exception
    }
}
