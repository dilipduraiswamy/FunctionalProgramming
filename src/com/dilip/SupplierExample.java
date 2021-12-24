package com.dilip;

import java.util.function.Supplier;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html
public class SupplierExample {

    public static void main(String[] args) {
        System.out.println(printHelloMessage());
        System.out.println(printHelloMessageSupplier.get());
    }

    static String printHelloMessage()
    {
        return "Hello World";
    }

    //supplier is used for returning static values of any return types
    static Supplier<String> printHelloMessageSupplier=()->"Hello World";
}
