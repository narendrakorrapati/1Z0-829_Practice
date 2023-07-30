package org.interfaceexample;

public class Cat implements Walk, Run {

    @Override
    public int getSpeed() { //It is required to override because of Ambiguity from Walk and Run interfaces
        return 1;
        //return Walk.super.getSpeed(); //It is possible, this is to access the version from Walk interface
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed(); //This is to access the version from Walk interface
    }
}
