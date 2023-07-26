package org.example;

public class StringTranslateEscapes {

    public static void main(String[] args) {
        translateEscapes();
        checkEmptyAndBlankString();
    }

    static void translateEscapes() {
        var str = "1\\t2";
        System.out.println(str); // 1\t2
        System.out.println(str.translateEscapes()); // 1 2
    }

    static void checkEmptyAndBlankString() {
        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank()); // true
    }

}
