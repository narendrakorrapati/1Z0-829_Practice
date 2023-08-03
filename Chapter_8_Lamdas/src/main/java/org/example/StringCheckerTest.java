package org.example;

public class StringCheckerTest {

    public static void main(String[] args) {
        var str = "";
        StringChecker methodRef = str::isEmpty;
        StringChecker lambda = () -> str.isEmpty();
        System.out.print(methodRef.check()); // true

        var str123 = "";

        //StringChecker methodRef123 = str::startsWith; //Does not compile, we can't write method reference for this combination
        StringChecker lambda123 = () -> str123.startsWith("Zoo");


    }
}
