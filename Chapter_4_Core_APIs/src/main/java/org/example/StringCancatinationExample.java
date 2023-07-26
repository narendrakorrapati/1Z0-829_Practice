package org.example;

public class StringCancatinationExample {

    public static void main(String[] args) {
//        indentTest();
//        indedentTest2();

        String s2 = "2"+"c"+"false";
//        s2 += "2";
//        s2 += "c";
//        s2 += "false";
        if ( s2 == "2cfalse")
            System.out.println("==");
    }

    static void indentTest() {
        var numbers = "012345678".indent(1);
        numbers = numbers.stripLeading();
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.print(numbers.substring(7));
    }

    static void indedentTest2() {
        var base = "ewe\nsheep\\t";
        int length = base.length();
        int indent = base.indent(2).length();
        int translate = base.translateEscapes().length();
        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.format(formatted);
        System.out.print(base.indent(2));
    }
}
