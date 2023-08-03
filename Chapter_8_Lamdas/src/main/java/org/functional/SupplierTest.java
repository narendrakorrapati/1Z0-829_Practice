package org.functional;

import org.example.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {

    //Creating new Objects is the common use of Supplier
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<Double> s3 = Math::random;
        Supplier<Double> s4 = () -> Math.random();

        System.out.println(s3.get());
        System.out.println(s4.get());

        Supplier<StringBuilder> s5 = StringBuilder::new;
        Supplier<StringBuilder> s6 = () -> new StringBuilder();
        System.out.println(s5.get()); // Empty string
        System.out.println(s6.get()); // Empty string

        Supplier<ArrayList<String>> s7 = ArrayList::new;
        ArrayList<String> a1 = s7.get();
        System.out.println(a1); // []
    }
}

