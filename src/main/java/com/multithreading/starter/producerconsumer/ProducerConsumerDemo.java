package com.multithreading.starter.producerconsumer;

import com.multithreading.starter.datasource.SharedQueue;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue(20);
        Thread producer1 = new Thread(new Producer(queue), "Producer1");
        Thread producer2 = new Thread(new Producer(queue), "Producer2");
        Thread producer3 = new Thread(new Producer(queue), "Producer3");

        Thread consumer1 = new Thread(new Consumer(queue), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(queue), "Consumer2");
        Thread consumer3 = new Thread(new Consumer(queue), "Consumer3");
        Thread consumer4 = new Thread(new Consumer(queue), "Consumer4");
        Thread consumer5 = new Thread(new Consumer(queue), "Consumer5");

        producer1.start();
        producer2.start();
        producer3.start();

        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();
    }
}
