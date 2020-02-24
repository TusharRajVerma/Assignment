package com.tothenew;

public class Ans4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Ans4.utilityFunction();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Ans4.utilityFunction();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(someVariable);

    }


    private static Object lock = new Object();
    private static Object anotherLock = new Object();

    private static int someVariable;

    public static void doSomething() throws InterruptedException {
        synchronized (lock) {
            Thread.sleep(1000);
            someVariable++;
        }
    }

    public static void doSomeOtherThing() throws InterruptedException {
        synchronized (anotherLock) {
            Thread.sleep(1000);
            someVariable++;
        }
    }

    public static void utilityFunction() throws InterruptedException {
        doSomething();
        doSomeOtherThing();
    }


}