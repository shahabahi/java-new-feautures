package com.api.concurrency;

public class Thread1 extends Thread {
    MathUtils mu;

    public Thread1(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        mu.getMultiples(2);
        System.out.println("Thread1 is running");
    }
}
