package org.records;

public class RecordTest1 {

    public static void main(String[] args) {
        Crane crane = new Crane(10, "Fleming");
        Crane crane1 = new Crane(10, "Fleming");

        //The order and type is important a declared in record
        //var mommy1 = new Crane("Cammy", 4); // DOES NOT COMPILE
        //var mommy2 = new Crane("Cammy"); // DOES NOT COMPILE

        System.out.println(crane);
        System.out.println(crane.name());
        System.out.println(crane.numberEggs());
        System.out.println(crane1.equals(crane));
        System.out.println(crane.hashCode() + " " + crane1.hashCode());
    }
}
