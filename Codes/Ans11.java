package com.tothenew;

import java.util.concurrent.Semaphore;

public class Ans11 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10);
        semaphore.release();
        System.out.println(semaphore.availablePermits());
        semaphore.release();
        System.out.println(semaphore.availablePermits());
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(semaphore.availablePermits());
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(semaphore.availablePermits());
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(semaphore.availablePermits());
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(semaphore.availablePermits());
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(semaphore.availablePermits());
    }
}

