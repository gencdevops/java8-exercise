package com.example.reentrallock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentralLock {



    public static void main(String[] args) {
        Worker worker = new Worker();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                worker.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    worker.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

