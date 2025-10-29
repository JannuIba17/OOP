package com.Day3;

class Shape{
    int length;
    int width;
    int radius;
    public double areaOfRectangle(){
        return length*width;
    }
    public double areaOfCircle(){
        double pi=3.147;
//        double area=pi*Math.pow(radius,2);
        double area=pi*(radius*radius);
        return area;
    }
}
public class VariablesDemo {
    public static void main(String[] args) {

    }
}
