package org.records;

public record Crane1(int numberEggs, String name) {
    public Crane1(int numberEggs, String name) {
        if (numberEggs < 0) throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}
