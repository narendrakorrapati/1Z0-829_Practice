package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Duck implements Comparable<Duck>{

    private String name;

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(name, duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Duck duck) {
        Integer i = 0;
        return this.name.compareTo(duck.getName()); //Sorts in ascending order
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]

        Comparator<Duck> comparator = Comparator.comparing(duck -> duck.getName());

        Collections.sort(ducks, comparator);
        Collections.sort(ducks, Comparator.comparing(Duck::getName));

        Collections.sort(ducks, Comparator.naturalOrder());
        Collections.sort(ducks, Comparator.reverseOrder());

        Collections.sort(ducks, Comparator.comparingInt(Duck::getWeight).reversed());

        Collections.sort(ducks, Comparator.comparing(Duck::getName).thenComparingInt(Duck::getWeight));

    }
}
