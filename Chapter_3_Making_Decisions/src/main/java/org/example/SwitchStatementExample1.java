package org.example;

public class SwitchStatementExample1 {

    public static void main(String[] args) {
        printDayOfWeek(1);
        printSeason(2);
    }

    public static void printDayOfWeek(int day) {
        switch(day) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid value");
                break;
        }
    }

    public static void printSeason(int month) {
        //From java 14 onwards, we can combine more than one switch case with coma
        switch(month) {
            case 1, 2, 3: System.out.print("Winter");
            case 4, 5, 6: System.out.print("Spring");
            default: System.out.print("Unknown");
            case 7, 8, 9: System.out.print("Summer");
            case 10, 11, 12: System.out.print("Fall");
        }
    }

    final static int getCookies() {
        return 4;
    }
    static void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch(numberOfAnimals) {
            case bananas:
            //case apples: // DOES NOT COMPILE
            //case getCookies(): // DOES NOT COMPILE
            //case cookies : // DOES NOT COMPILE
            case 3 * 5 :
        }
    }
}
