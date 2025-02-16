package com.multithreading.starter.producerconsumer;

import com.multithreading.starter.datasource.SharedQueue;

public class Consumer implements Runnable {
    private SharedQueue queue;

    public Consumer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Message is pulled from the queue by consumer: " + queue.pop() + " -----> " + Thread.currentThread());
        }
    }
}
