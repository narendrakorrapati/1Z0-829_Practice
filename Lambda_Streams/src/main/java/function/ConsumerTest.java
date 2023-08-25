package function;

import java.util.function.*;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<String> upperCaseConsumer = string -> string.toUpperCase();
        Consumer<String> printConsumer = string -> System.out.println(string);

        upperCaseConsumer.andThen(printConsumer).accept("Narendra");

        BiConsumer<String, Integer> biConsumer = (string, integer) -> System.out.println(string.substring(integer));
        biConsumer.accept("Narendra", 3);

        DoubleConsumer doubleConsumer = d -> System.out.println("SQRT:" + Math.sqrt(d));
        DoubleConsumer printDouble = d -> System.out.println("ORIGINAL:" + d);

        doubleConsumer.andThen(printDouble).accept(4);

        //IntConsumer and LongConsumer

        ObjIntConsumer<String> objIntConsumer = (s, i) -> System.out.println(s.length() + i);

        objIntConsumer.accept("Narendra", 10);

        ObjLongConsumer<String> objLongConsumer = (s, i) -> System.out.println(s.length() + i);

        objLongConsumer.accept("Narendra", 10L);

        ObjDoubleConsumer<String> objDoubleConsumer = (s, i) -> System.out.println(s.length() + i);

        objDoubleConsumer.accept("Narendra", 10.4);
    }
}
