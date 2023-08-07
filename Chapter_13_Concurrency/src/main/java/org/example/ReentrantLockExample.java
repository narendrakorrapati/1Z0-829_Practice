package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private int sheepCount = 0;
    Lock lock = new ReentrantLock();

    private void incrementAndReport() {
        try {
            lock.lock();
            System.out.print((++sheepCount)+" ");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            ReentrantLockExample manager = new ReentrantLockExample();
            for(int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            service.shutdown();
        }
    }
}
