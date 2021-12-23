package com.dilip;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        int increment1=incrementByOne(0);
        int increment2=incrementByOneFunction.apply(0);
        System.out.println(increment1);
        System.out.println(increment2);
        int multiply1=multiplyBy10Function.apply(increment2);
        System.out.println(multiply1);

        //combine both addition and multiply i.e function chains
        int addAndMultiply=incrementByOneFunction
                .andThen(multiplyBy10Function)
                .apply(0);
        System.out.println(addAndMultiply);
    }

    //Function takes two parameter i.e input and output types
    static Function<Integer,Integer> incrementByOneFunction=number->number+1;

    static Function<Integer,Integer> multiplyBy10Function=number->number*10;

    static int incrementByOne(int number){
        return number+1;
    }
}
