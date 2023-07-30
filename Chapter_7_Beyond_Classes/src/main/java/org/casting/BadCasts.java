package org.casting;

interface Canine {
}

interface Dog {
}

class Wolf implements Canine {
}

public class BadCasts {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        Dog badWolf = (Dog) wolfy;
    }
}

/*
Casting is allowed on line 15 because any subclasses of Wolf may be implementing Dog interface.
Marking Wolf class final makes line 15 not compile. Compiler knows there are no subclasses of Wolf that can implement Dog interface
 */