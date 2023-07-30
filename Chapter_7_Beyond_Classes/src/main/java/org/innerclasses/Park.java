package org.innerclasses;

public class Park {

    static class Ride {
        private int price = 6;
        private static int distance = 10;
    }

    public static void main(String[] args) {
        var ride = new Ride(); //Outer class Object is not required to access static nested class
        System.out.println(ride.price); //We need object to access instance variables
        System.out.println(Ride.distance); //Object is not required to access static variables

        var ride2 = new Park.Ride();
    }
}
