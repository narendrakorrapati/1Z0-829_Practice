package org.example;

public class StringTwoParameterCheckerTest {

    public static void main(String[] args) {
        /*
        Since the functional interface takes two parameters, Java has to figure out what they
represent. The first one will always be the instance of the object for instance methods. Any
others are to be method parameters
         */

        StringTwoParameterChecker methodRef = String::startsWith; //We can still use this for two parameters.
        StringTwoParameterChecker lambda = (s, p) -> s.startsWith(p);
        System.out.println(methodRef.check("Zoo", "A")); // false
    }
}
