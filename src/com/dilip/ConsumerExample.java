package com.dilip;

import java.util.function.Consumer;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html
public class ConsumerExample {

    public static void main(String[] args) {
        greetCustomer(new Customer("Dilip","95XX81XX61"));
        greetCustomerByConsumer.accept(new Customer("Dilip","95XX81XX61"));
    }

    //Consumer takes only one input param and return void or nothing
    static Consumer<Customer> greetCustomerByConsumer=customer -> {
        System.out.println("Welcome "+customer.customerName+" for registering phone number "+ customer.customerPhoneNumber);
    } ;

    static void greetCustomer(Customer customer)
    {
        System.out.println("Welcome "+customer.customerName+" for registering phone number "+ customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
