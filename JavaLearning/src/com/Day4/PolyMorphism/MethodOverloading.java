package com.Day4.PolyMorphism;
class MathUtility{
    public int add(){
        int num1=10;
        int num2=20;
        return num1+num2;
    }
    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(int num1,double num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public int max(int num1,int num2){
        return Math.max(num1,num2);
    }
    public int max(int num1,int num2,int num3){
        return Math.max(Math.max(num1,num2),num3);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        MathUtility calc=new MathUtility();
        calc.add(10,50.25);
        System.out.println(calc.max(85,65,100));
    }
}
