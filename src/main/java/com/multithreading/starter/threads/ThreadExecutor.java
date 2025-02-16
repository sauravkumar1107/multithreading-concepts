package com.multithreading.starter.threads;

public class ThreadExecutor {
    public static void main(String[] args) {
        System.out.println("main is starting");
        Thread thread1 = new Thread1("childThread1");
//        thread1.setDaemon(true);
        Thread thread2 = new Thread(new Thread2(), "childThread2");
        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(() -> {
            for (int i=0; i<10; i++) {
                System.out.println("current value: " + i + " -----> " + Thread.currentThread());
            }
        }, "childThread3");

        thread3.start();
        System.out.println("main is ending");
    }
}
