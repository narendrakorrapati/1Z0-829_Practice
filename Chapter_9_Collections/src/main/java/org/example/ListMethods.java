package org.example;

import java.util.*;

public class ListMethods {

    public static void main(String[] args) {

    }

    private static void convertingListToArray() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        list.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2
    }

    private static void sort() {
        List<String> list = new ArrayList<>();
        list.add("narendra"); //[narendra] //From Collection Interface
        list.add(1, "korrapati"); //[korrapati, narendra] //From List Interface

        list.sort(Comparator.naturalOrder());

        System.out.println(list);//[korrapati, narendra]
    }

    private static void replaceAll() {
        List<String> list = new ArrayList<>();
        list.add("narendra"); //[narendra] //From Collection Interface
        list.add(0, "korrapati"); //[korrapati, narendra] //From List Interface

        list.replaceAll(String::toUpperCase);

        System.out.println(list); //[KORRAPATI, NARENDRA]
    }

    private static void get() {
        List<String> list = new ArrayList<>();
        list.add("narendra"); //[narendra] //From Collection Interface
        list.add(0, "korrapati"); //[korrapati, narendra] //From List Interface

        System.out.println(list.get(1)); //narendra
    }

    private static void remove() {
        List<String> list = new ArrayList<>();
        list.add("narendra"); //[narendra] //From Collection Interface
        list.add(0, "korrapati"); //[korrapati, narendra] //From List Interface

        list.remove(0);

        System.out.println(list); //[narendra]
    }

    private static void set() {
        List<String> list = new ArrayList<>();
        list.add("narendra"); //[narendra] //From Collection Interface
        list.add(0, "korrapati"); //[korrapati, narendra] //From List Interface
        list.set(0, "KORRAPATI"); //Replaces the index with new element. [KORRAPATI, narendra]

        System.out.println(list);
    }

    private static void add() {
        List<String> list = new ArrayList<>();
        list.add("narendra"); //[narendra] //From Collection Interface
        list.add(0, "korrapati"); //[korrapati, narendra] //From List Interface
        System.out.println(list);
    }

    private static void createUsingConstructors() {
        //Below two are the common constructors for any collection types
        var likedList1 = new LinkedList<String>();
        var linkedList2 = new LinkedList<String>(likedList1);

        var linkedList3 = new ArrayList<String>(10); //This is available for ArrayList only. Initial capacity
    }

    private static void createUsingFactoryMethods() {
        String[] array = new String[]{"a", "b", "c"};

        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(of);

        array[0] = "z";
        System.out.println(asList); // [z, b, c]
        System.out.println(of); // [a, b, c]
        System.out.println(copy); // [a, b, c]
        asList.set(0, "x"); //Set works but to add and remove. Size can't be modified
        System.out.println(Arrays.toString(array)); // [x, b, c]
        copy.add("y"); // UnsupportedOperationException
    }
}
