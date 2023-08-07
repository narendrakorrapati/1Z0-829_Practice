package org.example;

import java.util.concurrent.*;

public class CheckResultsWithGet {

    private static int counter;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            Future<?> future = service.submit(() -> {
               for(int i=1; i<=1000000; i++)
                   counter++;
            });
            try {
                future.get(10, TimeUnit.SECONDS);
                System.out.println("Reached:" + counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (TimeoutException e) {
                System.out.println("Not reached in time");
            }
        } finally {
            service.shutdown();
        }
    }
}
