package com.dilip;

import java.util.function.Consumer;

public class CallBackExample {

    public static void main(String[] args) {

        //Consumer as parameter ,which takes param
        printHello("Dilip",null,value->{
            System.out.println("Null value provided "+value);
        });

        //runnable doesnot take param used for printing static values
        printHelloRunnable("Dilip",null,()->{
            System.out.println("Null value provided ");
        });
    }

    public static void printHello(String firstName, String lastName, Consumer<String> callback)
    {
        System.out.println(firstName);
        if(lastName!=null)
        {
            System.out.println(lastName);
        }else
        {
            callback.accept(firstName);
        }
    }

    public static void printHelloRunnable(String firstName, String lastName, Runnable callback)
    {
        System.out.println(firstName);
        if(lastName!=null)
        {
            System.out.println(lastName);
        }else
        {
            callback.run();
        }
    }
}
