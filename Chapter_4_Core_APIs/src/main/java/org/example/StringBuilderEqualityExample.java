package org.example;

public class StringBuilderEqualityExample {

    public static void main(String[] args) {
//        test2();
        test4();
    }

    static void test1() {
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true
    }

    static void test2() {
        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x.equals(z)); // true
        System.out.println(x == z); // false
    }

    static void test3() {
        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y); // true because of string constant pool
    }

    static void test4() {
        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); //true
        System.out.println(first == second.intern()); //true
        System.out.println(first == third); //false
        System.out.println(first == third.intern()); //true
    }
}
