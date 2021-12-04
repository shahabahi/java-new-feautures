package com.api.concurrency1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();

    }

    public static void executorInvoke() {
        Executor executor = new Caller();
        executor.execute(() -> {
            System.out.println("executor example");
        });
    }

    public static void executorServiceInvoke() {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.submit(()->{
            System.out.println("executor service example");
        });
    }
}
