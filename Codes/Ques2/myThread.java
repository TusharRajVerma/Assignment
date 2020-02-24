package com.tothenew.Ques2;

public class myThread extends Thread  {
    private volatile int volatileVariable = 0;
    @Override
    public void run() {
        while(volatileVariable == 0){
            System.out.println("Print me...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void justToUseVolatile(){
        volatileVariable = 1;
    }
}
