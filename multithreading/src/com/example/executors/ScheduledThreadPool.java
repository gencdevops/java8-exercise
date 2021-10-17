package com.example.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class StockMarketUpdater implements Runnable{

    @Override
    public void run() {
        System.out.println("Updating and downloading data stock related data from web...");
    }
}

public class ScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new StockMarketUpdater(), 1000, 2000, TimeUnit.MILLISECONDS);

    }
}
