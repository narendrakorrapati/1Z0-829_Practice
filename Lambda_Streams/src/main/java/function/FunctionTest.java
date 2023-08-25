package function;

import java.util.function.*;

public class FunctionTest {

    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> s.length();
        Function<Integer, Integer> function1 = (i) -> i*i;

        Integer narendra = function.andThen(function1).apply("Narendra");
        System.out.println(narendra);

        Integer korrapati = function1.compose(function).apply("Korrapati");
        System.out.println(korrapati);

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> (s1+s2).length();
        System.out.println(biFunction.apply("Narendra", "Korrapati"));

        IntFunction<String> intFunction = (i) -> String.valueOf(i);
        LongFunction<String> longFunction = (l) -> String.valueOf(l);
        DoubleFunction<String> doubleFunction = (d) -> String.valueOf(d);

        System.out.println(intFunction.apply(10));
        System.out.println(longFunction.apply(10));
        System.out.println(doubleFunction.apply(10));

        ToIntFunction<String> toIntFunction = s -> s.length();
        ToLongFunction<String> toLongFunction = s -> s.length();
        ToDoubleFunction<String> toDoubleFunction = s -> s.length();

        ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> (s1+s2).length();
        ToLongBiFunction<String, String> toLongBiFunction = (s1, s2) -> (s1+s2).length();
        ToDoubleBiFunction<String, String> toDoubleBiFunction = (s1, s2) -> (s1+s2).length();

        System.out.println(toIntFunction.applyAsInt("Narendra"));
        System.out.println(toLongFunction.applyAsLong("Narendra"));
        System.out.println(toDoubleFunction.applyAsDouble("Narendra"));

        IntToLongFunction intToLongFunction = i -> i;
        IntToDoubleFunction intToDoubleFunction = i -> i;

        LongToIntFunction longToIntFunction = i -> (int)i;
        LongToDoubleFunction longToDoubleFunction = i -> i;

        DoubleToIntFunction doubleToIntFunction = i -> (int)i;
        DoubleToLongFunction doubleToLongFunction = i -> (long)i;

    }
}
