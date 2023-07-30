package org.enumexample;

public enum Season2 {
    WINTER("Low"), //This is constructor calling with parenthesis
    SPRING("Medium"), //This is constructor calling with parenthesis
    SUMMER("High"), //This is constructor calling with parenthesis
    FALL("Medium"); //This is constructor calling with parenthesis

    private final String expectedVisitors; //marked as private final so that our enum properties can't be modified.

    /*
    All enum constructors are implicitly private, no need to mention private (redundant)
    This is reasonable since you can’t extend an enum and the constructors can be called only within the enum itself
    In fact, an enum constructor will not compile if it contains a public or protected modifier
     */
    private Season2(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
