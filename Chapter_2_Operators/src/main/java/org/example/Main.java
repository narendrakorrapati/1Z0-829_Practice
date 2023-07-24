package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        int myFavoriteNumber = 8;
        int bird = ~myFavoriteNumber;
        int plane = -myFavoriteNumber;
        var superman = bird == plane ? 5 : 10;
        System.out.println(bird + "," + plane + "," + --
                superman);
    }
}