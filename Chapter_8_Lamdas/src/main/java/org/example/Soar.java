package org.example;

@FunctionalInterface
public interface Soar {

    /*
    Any method from Object class signature does not count for abstract method for functional interface check.
     */

    void soar();
    String toString();
    int hashCode();
    boolean equals(Object obj);

}
