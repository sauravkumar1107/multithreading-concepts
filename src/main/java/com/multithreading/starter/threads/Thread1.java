package com.multithreading.starter.threads;

public class Thread1 extends Thread {
    public Thread1(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("current value: " + i + " -----> " + Thread.currentThread());
        }
    }
}
