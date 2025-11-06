package com.Day8;

class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("My thread is running: "+Thread.currentThread().getName());
    }
}

public class ByImplementingRunnableInterface {
    public static void main(String[] args) {
        Thread t2=new Thread(new MyThread1());
        t2.start();
    }
}
