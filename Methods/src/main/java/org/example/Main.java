package org.example;

import pond.goose.Goose;
import pond.swan.Swan;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Swan{
    public static void main(String[] args) {
        //Long badGorilla = 8;
        //Java will cast or autobox the value automatically, but not both at the same time.
        //In this case 8 is integer, it tries to autobox to Integer.valueOf(8);
        //Integer can't be assigned to Long
        //Here, we need wrapper, so java converts 8 to Integer and Integer can't be assigned to Long

        long badGro = Integer.valueOf(8);

        //It does un-boxing, Integer converts to int and int can be assigned to long automatically.
        //Here we need primitive, java converts Integer to int. int can be assigned to long automatically.

        char ch = 'a';
        System.out.println(ch);

    }

    void test() {
        floatInWater();
    }
}

class Test {

    void check() {
        Main main = new Main();
    }
}