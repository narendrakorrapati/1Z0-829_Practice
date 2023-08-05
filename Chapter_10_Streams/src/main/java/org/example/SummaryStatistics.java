package org.example;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatistics {

    public static void main(String[] args) {
        System.out.println(range(IntStream.rangeClosed(1, 10)));
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax()-stats.
                getMin();
    }
}
