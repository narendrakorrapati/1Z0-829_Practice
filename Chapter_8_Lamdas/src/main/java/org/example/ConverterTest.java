package org.example;

public class ConverterTest {

    public static void main(String[] args) {

        Converter methodRef = Math::round; //Implementation of single abstract method. Calling a static method
        Converter lambda = x -> Math.round(x);
        System.out.println(methodRef.round(100.1)); // 100 //Invoking the implemented method
    }
}
