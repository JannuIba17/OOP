package com.Day8;

class Sleep implements Runnable{
    public void run(){
        try {
            System.out.println("Thread is sleeping");
            Thread.currentThread().sleep(5000);
            System.out.println("Thread is awake");
        }catch(InterruptedException e){
            System.out.println("Thread wake up from sleep");
        }
    }
}

public class ByUsingLambdaExpression {
    public static void main(String[] args) {

        Thread t3=new Thread(new Sleep());
        t3.start();

    }
}
