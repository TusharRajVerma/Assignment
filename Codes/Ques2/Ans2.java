package com.tothenew.Ques2;

import java.util.Scanner;

public class Ans2 {
    public static void main(String[] args) throws InterruptedException {
        myThread thread = new myThread();
        thread.start();

        System.out.println("Press anything to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        thread.justToUseVolatile();

    }
}

