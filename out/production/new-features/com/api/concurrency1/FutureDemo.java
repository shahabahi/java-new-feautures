package com.api.concurrency1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(20000);
            return "completed";
        });
        try {
            while (!future.isDone()) {
                System.out.println("Task is Still in progress...Wait");
                Thread.sleep(500);
            }
            System.out.println("Task Completed!");
            String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.printf(result);
            executorService.shutdown();
        } catch (Exception ex) {
            future.cancel(true);
            future.isDone();
            future.isCancelled();
            ex.printStackTrace();
        }
    }
}
