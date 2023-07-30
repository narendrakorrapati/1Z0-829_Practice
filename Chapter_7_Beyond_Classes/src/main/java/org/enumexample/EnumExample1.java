package org.enumexample;

public class EnumExample1 {

    public static void main(String[] args) {
        Season1 s = Season1.SUMMER;
        System.out.println(Season1.SUMMER); //enums print the name of the enum when toString() is called
        System.out.println(s == Season1.SUMMER);
        System.out.println(s.equals(Season1.SUMMER));
        //you can use equals() or == to compare enums, since each enum value is initialized only once in the Java Virtual Machine (JVM).
    }
}
