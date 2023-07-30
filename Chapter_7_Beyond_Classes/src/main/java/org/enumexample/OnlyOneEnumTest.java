package org.enumexample;

public class OnlyOneEnumTest {

    public static void main(String[] args) {
        System.out.println("begin,");
        OnlyOne firstCall = OnlyOne.TRUE; // Prints constructing,
        OnlyOne secondCall = OnlyOne.TRUE; // Doesn't print anything
        System.out.print("end");

    }
}
