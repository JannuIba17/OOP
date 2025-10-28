package com.Day2;
import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
//        int num=20;
        byte num=124;
        System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle");
        double p=sc.nextDouble();
        System.out.println("Enter rate");
        float r=sc.nextFloat();
        System.out.println("Enter years");
        int t=sc.nextInt();
//        boolean b=sc.nextBoolean();
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your gender(M/F)");
        char gender=sc.next().charAt(0);
        double interest=(p*r*t)/100;
        System.out.println(interest);
        if(interest>5000){
            System.out.println("High Interest Earned");
        }
        else if(interest>2000 && interest<=5000){
            System.out.println("Moderate Interest Earned");
        }
        else{
            System.out.println("Low Interest Earned");
        }
        for(int year=1;year<=t;year++){
            double ipy=(p*r*year)/100;
            System.out.printf("At the %d year, The interest earned is %f%n",year,ipy);
        }
    }
}
