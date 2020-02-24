package com.tothenew;

import java.util.concurrent.*;

public class Ans12 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "returned from callable";
            }
        });
        executorService.shutdown();
        System.out.println(future.get());
    }
}
