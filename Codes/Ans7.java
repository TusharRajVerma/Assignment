package com.tothenew;

import java.util.Scanner;

public class Ans7 {
    public static void main(String[] args) throws InterruptedException {
        Ans7 ans7 = new Ans7();
        Thread putThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ans7.putOnQueue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread removeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ans7.removeFromQueue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        putThread.start();
        removeThread.start();

        putThread.join();
        removeThread.join();
    }
    public void putOnQueue() throws InterruptedException {
        synchronized (this) {
            System.out.println("Inside put on Queue");
            wait();
            System.out.println("Back again in put on Queue");
        }
    }
    public void removeFromQueue() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            scanner.nextLine();
            notify();
        }
    }
}
