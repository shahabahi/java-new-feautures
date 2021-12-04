package com.api.concurrency;

public class MainClass1 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            Thread1 t1 = new Thread1();
//            t1.start();
//            Thread t2 = new Thread(new Thread2());
//            t2.start();
//        }
        MathUtils mathUtils = new MathUtils();
        Thread1 t1 = new Thread1(mathUtils);
        Thread t2 = new Thread(new Thread2(mathUtils));
        t1.start();
        t2.start();

    }
}
