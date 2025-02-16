package com.multithreading.starter.singleton;

public class CarInstance {
    private static volatile CarInstance instance = null;
    private CarInstance() {}

    public static CarInstance getInstance() {
        if (instance == null) {
            synchronized (CarInstance.class) {
                if (instance == null) {
                    instance = new CarInstance();
                }
            }
        }

        return instance;
    }
}
