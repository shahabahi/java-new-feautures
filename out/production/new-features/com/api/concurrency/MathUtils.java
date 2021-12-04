package com.api.concurrency;

public class MathUtils {
    //method is synchronized
//    synchronized
    void getMultiples(int n) {
        //this part of code is synchronized
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
