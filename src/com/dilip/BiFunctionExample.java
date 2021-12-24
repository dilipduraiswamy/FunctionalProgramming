package com.dilip;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {


        //normal function
        System.out.println(incrementByOneAndMultiply(2,10));

        //bifunction
        System.out.println(incrementByOneAndMultiplyByBiFunction.apply(2,10));

    }

    //BiFunction takes 3 paramaters a,b,c i.e a & b is input and c is output
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyByBiFunction
            =(numberToIncrement,numberToMultiply)
            ->(numberToIncrement+1)*numberToMultiply;

    static int incrementByOneAndMultiply(int numberToIncrement, int numberToMultiply){
        return (numberToIncrement+1)*numberToMultiply;
    }
}
