package org.interfaceexample;

public class InterfaceExampleImpl implements InterfaceExample, InterfaceExample1{

    @Override
    public int getAbstractHeight() {
        return InterfaceExample.max_length;
    }

    public static int getStaticHeight() { //Can create a same static method that is in Interface. It is not called as hiding in this case.
        return 100;
    }

    public int ownMethod() {
        return InterfaceExample.getStaticHeight(); //Interface public static methods do not participate in Inheritance hence we should refer it using Interface prefix.
    }

    @Override
    public int getExampleDefaultHeight() { //Optional to override the non-conflicting default methods. It is available only in InterfaceExample
        return InterfaceExample.super.getExampleDefaultHeight(); //This is the syntax to refer Interfaces version of method.
        //return 20;  //Its own implementation without using Interface provided code.
    }

    @Override
    public int getDefaultHeight() { //Class should override the conflicting default methods from Interfaces.
        //return InterfaceExample.super.getDefaultHeight(); //This is the syntax to refer Interfaces version of method.
        //return InterfaceExample1.super.getDefaultHeight(); //This is the syntax to refer Interfaces version of method.
        return 10; //Its own implementation without using Interface provided code.
    }
}
