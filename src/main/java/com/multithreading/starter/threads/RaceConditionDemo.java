package com.multithreading.starter.threads;

import com.multithreading.starter.datasource.Stack;

public class RaceConditionDemo {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        new Thread(() -> {
            int i=0;
            while (i<10) {
                st.push(i);
                i++;
            }
        }).start();

        new Thread(() -> {
            int i=0;
            while (i < 10) {
                System.out.println(st.pop());
                i++;
            }
        }).start();
    }
}
