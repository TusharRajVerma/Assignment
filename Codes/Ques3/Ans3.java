package com.tothenew.Ques3;

public class Ans3 {
    public static void main(String[] args) {
        myThread thread = new myThread();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread form runnable interface implementation");
            }
        });
        thread.start();
        thread1.start();
    }
}

class myThread extends Thread{
    public void run() {
        System.out.println("thread from Thread class");
    }
}

