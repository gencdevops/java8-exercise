package com.example.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task2 implements Runnable {
    public int id;

    public Task2(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task id " + id + " is work - thread id: " + Thread.currentThread().getName());
    long duration = (long) (Math.random() * 5);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

public class SingleThreadExecutors {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for(int i = 0; i < 10; i++) {
            executorService.execute(new Task2(i + 1));
        }
    }
}
