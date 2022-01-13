package com.dilip.interfaces;

public class TestingDefaultStatic implements Calculator{


    public static void main(String[] args) {
        TestingDefaultStatic test = new TestingDefaultStatic();
        //default methods no need to override
        test.printMessage("Hello ");

        //static method without instantisation
        Calculator.printHello();
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }
}
