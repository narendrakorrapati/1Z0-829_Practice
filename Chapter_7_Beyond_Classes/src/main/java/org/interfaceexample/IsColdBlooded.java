package org.interfaceexample;

public interface IsColdBlooded {

    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }

    private static void test() {

    }
}
