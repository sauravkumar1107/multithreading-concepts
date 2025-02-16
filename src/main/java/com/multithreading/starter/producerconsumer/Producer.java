package com.multithreading.starter.producerconsumer;

import com.multithreading.starter.datasource.SharedQueue;


public class Producer implements Runnable {
    private SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int cnt = 0;
        while (true) {
            System.out.println("Message is pushed to the queue by producer: " + cnt + " -----> " + Thread.currentThread());
            queue.push(cnt);
            cnt++;
        }
    }
}
