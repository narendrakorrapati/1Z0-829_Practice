package org.example;

public class CheckResultsWithSleepAndInterrupt {

    private static int counter;

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

        Runnable runnable = () -> {
          for(int i=1; i<=1000000; i++)
              counter++;
            mainThread.interrupt();
        };

        new Thread(runnable).start();

        while (counter<1000000) {
            System.out.println("Not reached yet");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Reached: "+counter);
    }
}
