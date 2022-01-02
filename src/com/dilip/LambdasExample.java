package com.dilip;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdasExample {

    public static void main(String[] args) {
        Function<String ,String> printUpperCase=name-> name.toUpperCase();

        BiFunction<String,Integer,String > printUpperCaseWithAge=(name,age)->{
            System.out.println(age);
            return name.toUpperCase();
        };


        System.out.println(printUpperCase.apply("Dilip"));

        System.out.println(printUpperCaseWithAge.apply("Dilip",20));
    }
}
