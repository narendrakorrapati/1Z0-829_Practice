package function;

import java.util.function.*;

public class OperatorTest {

    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply("Narendra"));

        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + " " + s2;
        System.out.println(binaryOperator.apply("Narendra", "Korrapati"));

        IntUnaryOperator intUnaryOperator = i -> i * 2;
        LongUnaryOperator longUnaryOperator = i -> i * 2;
        DoubleUnaryOperator doubleUnaryOperator = i -> i * 2;

        IntBinaryOperator intBinaryOperator = (i1, i2) -> i1+i2;
        LongBinaryOperator longBinaryOperator = (i1, i2) -> i1 * i2;
        DoubleBinaryOperator doubleBinaryOperator = (i1, i2) -> i1/i2;
    }
}
