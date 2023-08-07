package org.example;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        try {
            Runnable task1 = () ->
                    System.out.println("Hello Zoo");
            Callable<String> task2 = () ->
                    "Monkey";
            ScheduledFuture<?> r1 = service.schedule(task1, 1, TimeUnit.SECONDS);
            ScheduledFuture<String> r2 = service.schedule(task2, 10, TimeUnit.SECONDS);

            service.scheduleAtFixedRate(task1, 5, 1, TimeUnit.SECONDS);

            service.scheduleWithFixedDelay(task1, 0, 2, TimeUnit.SECONDS);

            System.out.println(r2.get());

        } finally {
            service.shutdown();
        }
    }
}
