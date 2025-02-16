package com.multithreading.starter.datasource;

public class Stack {
    private int[] array;
    private int stackTop;
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }

//    public synchronized boolean push(int num) {
//        if (stackTop == array.length) {
//            return false;
//        }
//
//        stackTop++;
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//
//        }
//        array[stackTop] = num;
//        return true;
//    }
//
//    public synchronized int pop() {
//        if (stackTop < 0) {
//            return Integer.MIN_VALUE;
//        }
//
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//
//        }
//
//        int value = array[stackTop];
//        stackTop--;
//        return value;
//    }

    public boolean push(int num) {
        synchronized (lock1) {
            if (stackTop == array.length) {
                return false;
            }

            stackTop++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            array[stackTop] = num;
            return true;
        }
    }

    public int pop() {
        synchronized (lock1) {
            if (stackTop < 0) {
                return Integer.MIN_VALUE;
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

            int value = array[stackTop];
            stackTop--;
            return value;
        }
    }
}
