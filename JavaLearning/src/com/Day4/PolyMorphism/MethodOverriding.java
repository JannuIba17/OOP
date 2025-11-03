package com.Day4.PolyMorphism;

class Animal{
    void eat(){
        System.out.println("Animals can eat");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat can eat");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog can eat");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        Animal dog=new Dog();
        dog.eat();
        Animal cat=new Cat();
        cat.eat();
    }
}
