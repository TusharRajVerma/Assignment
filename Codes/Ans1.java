package com.tothenew;

//sleep() can be used to pause a thread
public class Ans1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hey am a thread , showing use of sleep()");
            }
        });
        try{
            thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        thread.start();
    }
}
