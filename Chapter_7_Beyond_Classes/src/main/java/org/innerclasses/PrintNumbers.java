package org.innerclasses;

public class PrintNumbers {
    /*
      1. Local class can access final or effective final variables of the method only
      2. They can access outer class instance,static members if they are declared in an instance method
      3. They can access outer class static members only if they are declared in a static method
     */

    private int length = 5;
    private static int staticLength = 5;
    public void calculate() {
        final int width = 20;
        class Calculator {
            public void multiply() {
                printMessage();
                printStaticMessage();
                System.out.print(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void staticCalculate() {
        final int width = 20;
        final class Calculator {
            public void multiply() {
                printStaticMessage();
                System.out.print(staticLength * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public void printMessage() {
        System.out.println("Called from local class");
    }

    public static void printStaticMessage() {
        System.out.println("Called from local class static");
    }
    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate(); // 100
    }
}
