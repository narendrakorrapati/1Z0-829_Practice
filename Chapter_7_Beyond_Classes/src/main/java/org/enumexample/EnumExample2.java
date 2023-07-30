package org.enumexample;

public class EnumExample2 {

    public static void main(String[] args) {
        for(var s : Season1.values()) {
            System.out.println(s.name() + " " + s.ordinal());
        }

        //if ( Season.SUMMER == 2) {} // DOES NOT COMPILE

        Season1 s = Season1.valueOf("SUMMER"); // SUMMER, valueOf method take String argument and return the matched enum constant name

        Season1 t = Season1.valueOf("summer"); // IllegalArgumentException since there is no enum with the name summer in lowercase
    }
}
