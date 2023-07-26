package org.example;

public class StringMethodsExample2 {

    public static void main(String[] args) {
        indentTest();
    }

    static void removeWhiteSpaces() {
        System.out.println("abc".strip()); // abc
        System.out.println("\t a b c\n".strip()); // a b c
        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        System.out.println(text.strip().length()); // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4
    }

    static void indentTest() {
        var block = """
                    a
                     b
                    c""";
        var concat = " a\n"
                    + "  b\n"
                    + " c";

        System.out.println(block);
        System.out.println(concat);

        System.out.println(block.length()); // 6
        System.out.println(concat.length()); // 9
        System.out.println(block.indent(1).length()); // 10
        System.out.println(block.indent(1)); // 10
        System.out.println(concat.indent(-1).length()); // 7
        System.out.println(concat.indent(-1)); // 7
        System.out.println(concat.indent(-4).length()); // 6
        System.out.println(concat.stripIndent().length()); // 6
        System.out.print(concat.stripIndent()); // 6
    }
}
