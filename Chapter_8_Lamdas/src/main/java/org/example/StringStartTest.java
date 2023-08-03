package org.example;

public class StringStartTest {

    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith; //Implementation of single abstract method. Calling instance method example
        StringStart lambda = s -> str.startsWith(s);
        System.out.println(methodRef.beginningCheck("A")); // false
    }
}
