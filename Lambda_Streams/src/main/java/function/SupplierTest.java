package function;

import java.util.Random;
import java.util.RandomAccess;
import java.util.function.*;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> new String("Hello");
        System.out.println(stringSupplier.get());

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        IntSupplier intSupplier = () -> new Random().nextInt(10);
        System.out.println(intSupplier.getAsInt());

        DoubleSupplier doubleSupplier = () -> new Random().nextDouble(10);
        System.out.println(doubleSupplier.getAsDouble());

        LongSupplier longSupplier = () -> new Random().nextLong(10);
        System.out.println(longSupplier.getAsLong());
    }
}
