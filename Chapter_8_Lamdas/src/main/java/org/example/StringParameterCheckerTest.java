package org.example;

public class StringParameterCheckerTest {

    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty; //Calling instance methods on a parameter
        StringParameterChecker lambda = s -> s.isEmpty();
        System.out.println(methodRef.check("Zoo")); // false
    }
}
