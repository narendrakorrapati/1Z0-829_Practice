package org.enumexample;

public enum OnlyOne {

    TRUE(true),
    FALSE(false);

    /*
    The first time we ask for any of the enum values, Java constructs all of the enum values
     */
    OnlyOne(boolean b) {
        System.out.println("Constructing " + b);
    }
}
