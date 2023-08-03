package org.example;

public class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = System.out::println;
        DuckHelper.teacher(sound, learner);
    }


    public static void main(String[] args) {
        makeSound("test");
    }
}