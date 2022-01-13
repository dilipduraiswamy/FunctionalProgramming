package com.dilip.interfaces;

public interface Calculator {

    default void printMessage(String message) {
        System.out.println("Message "+message);
    }

    int add(int a,int b);

    static void printHello()
    {
        System.out.println("Hello");
    }
}
