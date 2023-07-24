package org.example;

public class SwitchExpressionExample {

    enum Season {WINTER, SPRING, SUMMER, FALL}

    public static void main(String[] args) {
        printDayOfWeek(10);
        printSeason(1);
        printConsistentDataType(10);
        printApplyingCaseBlock();
        printAllPossibleValues();
        getWeather(Season.SPRING);
    }

    public static void printDayOfWeek(int day) {
        //breaks the branch automatically without the need of break statement.
        var result = switch(day) {
            case 0,10 ->"Sunday";// //From java 14 onwards, we can combine more than one switch case with coma
            case 1 ->"Monday"; //Semicolon is required
            case 2 ->"Tuesday";
            case 3 ->"Wednesday";
            case 4 ->"Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default ->"Invalid value";
        }; //Semicolon is required if switch is used in an expression
        System.out.print(result);
    }

    public static void printSeason(int month) {
        switch(month) {
            case 1, 2, 3 -> System.out.print("Winter");
            case 4, 5, 6 -> System.out.print("Spring");
            case 7, 8, 9 -> System.out.print("Summer");
            case 10, 11, 12 -> System.out.print("Fall");
        }
    }

    public static void printConsistentDataType(int number) {
        int measurement = 10;
        int size = switch(measurement) {
            case 5 ->
                    1;
            case 10 -> (short)2;
            default -> 5;
            //case 20 -> "3"; // DOES NOT COMPILE
            //case 40 -> 4L; // DOES NOT COMPILE
            //case 50 -> null; // DOES NOT COMPILE
        };
        System.out.println(size);
    }

    public static void printApplyingCaseBlock() {
        int fish = 5;
        int length = 12;
        var name = switch(fish) {
            case 1 ->"Goldfish";
            case 2 ->{
                yield "Trout";
            }
            case 3 -> {
                if(length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };

        System.out.println(name);
    }

    public static void printAllPossibleValues() {
        int canis = 5;
//        String type = switch(canis) { // DOES NOT COMPILE, It should cover all possible values or write a default branch.
//            case 1 ->"dog";
//            case 2 ->"wolf";
//            case 3 ->"coyote";
//        };

        String type = switch(canis) {
            case 1 ->"dog";
            case 2 ->"wolf";
            case 3 ->"coyote";
            //default -> throw new RuntimeException();
            default -> "default";
        };

        System.out.println(type);
    }

    public static void getWeather(Season value) {
        var weather = switch(value) { //Compile without default branch because covering all possible values of the enum
            case WINTER ->
                    "Cold";
            case SPRING ->
                    "Rainy";
            case SUMMER ->
                    "Hot";
            case FALL ->
                    "Warm";
        };

        System.out.println(weather);
    }

}
