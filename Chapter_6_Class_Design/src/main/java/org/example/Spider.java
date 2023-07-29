package org.example;

class Arthropod {
    protected void printName(long input) {
        System.out.print("Arthropod");
    }

    void printName(int input) {
        System.out.print("Spooky");
    }

    void test(Object a) {
        System.out.println("test");
    }
}

public class Spider extends Arthropod {
    protected void printName(int input) {
        System.out.print("Spider");
    }

    public static void main(String[] args) {
        Arthropod a = new Spider();
        a.printName((short) 4);
        a.printName(4);
        a.printName(5L);
    }
}
