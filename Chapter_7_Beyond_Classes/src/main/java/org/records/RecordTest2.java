package org.records;

public class RecordTest2 {

    public static void main(String[] args) {

        //Records are immutable by nature, if we want to modify, just create a new record and copy the info and change
        var cousin = new Crane(3, "Jenny");
        var friend = new Crane(cousin.numberEggs(), "Janeice");


    }
}
