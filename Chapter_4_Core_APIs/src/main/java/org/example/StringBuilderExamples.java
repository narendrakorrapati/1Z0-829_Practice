package org.example;

public class StringBuilderExamples {

    public static void main(String[] args) {
//        test2();
//        appendTest();
//        insertTest();
        deleteTest();
        replaceTest();
    }

    static void test1() {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"
    }

    static void test2() {
        var sb = new StringBuilder("Narendra Korrapati");
        System.out.println(sb.substring(9, 18)); //Korrapati
        System.out.println(sb.substring(sb.indexOf("K"))); // Korrapati
        System.out.println(sb.substring(5, 12)); //dra Kor

        System.out.println(sb.substring(sb.indexOf("a"), sb.indexOf("t"))); //arendra Korrapa
        System.out.println(sb.charAt(7)); //a
    }

    static void appendTest() {
        var sb = new StringBuilder().append(1).append('c');
        sb.append("-").
                append(true);
        System.out.println(sb); // 1c-true
    }

    static void insertTest() {
        var sb = new StringBuilder("Narendra Korrapati");
        sb.insert(8, "-");
        System.out.println(sb); //Narendra- Korrapati
        sb.insert(9, new char[]{'A','E','I'}, 1, 2); //Narendra-EI Korrapati
        System.out.println(sb);
    }

    static void deleteTest() {
        var sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        //sb.deleteCharAt(5); // exception
        sb.delete(1, 100);
    }

    static void replaceTest() {
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");//deletes 3 to 6 (index not included) and insert str at 3
        System.out.println(builder); // pigsty dirty

        var builder1 = new StringBuilder("pigeon dirty");
        builder1.replace(3, 100, "");
        System.out.println(builder1); //pig
    }

}
