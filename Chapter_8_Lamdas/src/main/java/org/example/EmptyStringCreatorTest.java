package org.example;

public class EmptyStringCreatorTest {

    public static void main(String[] args) {
        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String();

        var myString = methodRef.create();
        System.out.println(myString.equals("Snake")); // false
    }
}
