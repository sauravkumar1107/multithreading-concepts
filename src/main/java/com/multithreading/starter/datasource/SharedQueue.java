package com.multithreading.starter.datasource;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
    private Queue<Integer> queue;
    private int capacity;

    public SharedQueue(int capacity) {
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean push(int num) {
        synchronized (queue) {
            while (queue.size() == capacity) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queue.add(num);
            queue.notifyAll();
            return true;
        }
    }

    public int pop() {
        synchronized (queue) {
            while (queue.isEmpty()) {
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int element = queue.poll();
            queue.notifyAll();
            return element;
        }
    }
}
