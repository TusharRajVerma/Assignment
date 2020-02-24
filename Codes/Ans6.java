package com.tothenew;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ans6 {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<1000;i+=2){
                    System.out.println(i);
                }
            }
        });
        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=2;i<1000;i+=2) {
                    System.out.println(i);
                }
            }
        });
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(oddThread);
        executorService.submit(evenThread);

        executorService.shutdown();


        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
        }
    }
}
