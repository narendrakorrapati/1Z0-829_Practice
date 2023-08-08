package org.example;

import java.io.File;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String newCurrentDirectory = "F:\\root\\parent\\child"; // Replace with the desired directory

        // Set the "user.dir" system property to change the current directory
        System.setProperty("user.dir", newCurrentDirectory);

        System.out.println(System.getProperty("user.dir"));

        File parentDir = new File("../../");

        Arrays.stream(parentDir.list()).forEach(System.out::println);

    }
}