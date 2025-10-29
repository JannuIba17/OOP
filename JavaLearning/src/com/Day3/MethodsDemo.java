package com.Day3;

public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo obj=new MethodsDemo();
        obj.add();
        obj.add();
        sub(10,20);
//        double result=mul();
//        System.out.println(result);
        System.out.println(mul());
        System.out.println(div(5,2));
    }
//    no return type without argument
    public void add(){
        int num1=10;
        int num2=20;
        int sum=num1+num2;
        System.out.println(sum);
    }
    //        no return type with argument
    public static void sub(int num1,int num2){
        int sub=Math.abs(num1-num2);
        System.out.println(sub);
    }
//    return type without argument
    public static double mul(){
        int num1=55;
        int num2=45;
        double mul=num1*num2;
        return mul;
    }
//    return type with argument
    public static double div(int num1,int num2){
        double div=(double)num1/num2;
        return div;
    }
}
