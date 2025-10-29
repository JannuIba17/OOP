package com.Day3.ClassDemo;
class Student{
    int rno;
    String name;
    String dept;
    public void display(){
        System.out.println("RNo: "+rno+"\nName: "+name+"\nDept: "+dept);
    }
}
public class ClassDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Jannath";
        s1.rno=100;
        s1.dept="EEE";
        s1.display();
        System.out.println("---------------------------");
        Student s2=new Student();
        s2.name="Akhil";
        s2.rno=102;
        s2.dept="CSE";
        s2.display();

    }
}