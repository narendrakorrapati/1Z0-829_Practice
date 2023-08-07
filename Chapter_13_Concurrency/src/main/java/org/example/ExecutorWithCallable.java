package org.example;

import java.util.concurrent.*;

public class ExecutorWithCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        try{
            Future<Integer> sum = service.submit(() -> 10 + 31);
            System.out.println(sum.get()); //41
        } finally {
            service.shutdown();
        }

        service.awaitTermination(1, TimeUnit.MINUTES);

        if(service.isTerminated()) System.out.println("Finished!");
        else System.out.println("At least one task is still running");
    }
}
