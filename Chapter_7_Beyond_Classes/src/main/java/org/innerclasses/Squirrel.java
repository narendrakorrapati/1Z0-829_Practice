package org.innerclasses;

public class Squirrel {

    public void visitFox() {
        //new Den(); // DOES NOT COMPILE
        //new Fox().new Den(); // DOES NOT COMPILE, Den has private access in Fox. Can only be accessed in Fox
    }
}
