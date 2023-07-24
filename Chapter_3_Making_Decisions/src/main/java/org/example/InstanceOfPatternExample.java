package org.example;

public class InstanceOfPatternExample {

    public static void main(String[] args) {
        compareIntegers(10);
        compareIntegersWithPattern(10);
        compareIntegersWithPatternFinal(10);
        printIntegersGreaterThan5(10);

        Integer value = 123;
        if(value instanceof Integer) { //Traditional instanceof compiles even with the same type

        }
//        if(value instanceof Integer data) { //Does not compile, when using pattern, pattern matching variable should be strict subtype
//
//        }
    }

    static void compareIntegers(Number number) {
        if(number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    static void compareIntegersWithPattern(Number number) {
        if(number instanceof Integer data) {
            //data = 20; Possible but not recommended to use
            System.out.println(data.compareTo(5));
        }
    }

    static void compareIntegersWithPatternFinal(Number number) {
        if(number instanceof final Integer data) {
            //data = 20; Protect data using final key word
            System.out.println(data.compareTo(5));
        }
    }

    static void printIntegersGreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5)>0)
            System.out.print(data);
    }

    void printIntegersOrNumbersGreaterThan5(Number number) {
//        if(number instanceof Integer data || data.compareTo(5)>0) //Does not compile, data cant be resolved if number is not a Integer type
//            System.out.print(data);
    }

    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        //System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
    }
    //Above resolves to below examples. It has the same meaning better readability
//    void printOnlyIntegers(Number number) {
//        if (!(number instanceof Integer data))
//            return;
//        else
//            System.out.print(data.intValue());
//    }

//    void printOnlyIntegers(Number number) {
//        if (number instanceof Integer data)
//            System.out.print(data.intValue());
//        else
//            return;
//    }
}
