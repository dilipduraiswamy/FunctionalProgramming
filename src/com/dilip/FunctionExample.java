package com.dilip;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        int increment1=incrementByOne(0);
        int increment2=incrementByOneFunction.apply(0);
        System.out.println(increment1);
        System.out.println(increment2);
    }

    //Function takes two parameter i.e input and output types
    static Function<Integer,Integer> incrementByOneFunction=number->number+1;

    static int incrementByOne(int number){
        return number+1;
    }
}
