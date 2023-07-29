package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Mammal {
    private void sneeze() {
    }

    public Mammal(int age) {
        System.out.print("Mammal");
    }
}

public class Platypus extends Mammal {
    int sneeze() {
        return 1;
    }

    public Platypus() {
        super(5);
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}