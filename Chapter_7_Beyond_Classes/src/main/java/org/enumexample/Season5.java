package org.enumexample;

public enum Season5 implements Weather{

    WINTER {
        public int getAverageTemperature() {
            return 10;
        }
    },
    SPRING, SUMMER, FALL;
    public int getAverageTemperature() { return 30; }
}
