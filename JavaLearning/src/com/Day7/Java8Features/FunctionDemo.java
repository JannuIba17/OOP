package com.Day7.Java8Features;

/*
interface Function{
    public <Output> apply(<Input>);
}
 */

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f= temp -> temp.length();
        System.out.println(f.apply("Good Morning!"));
    }
}
