package com.dilip;

import com.dilip.dto.Customer;

import java.util.function.BiConsumer;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiConsumer.html
public class BiConsumerExample {

    public static void main(String[] args) {
        greetCustomer(new Customer("Dilip","95XX38XX34XX"),false);
        greetCustomerByConsumer.accept(new Customer("Dilip","95XX38XX34XX"),true);
    }

    //BiConsumer takes two one input param and return void or nothing
    static BiConsumer<Customer,Boolean> greetCustomerByConsumer= (customer,isDisplayPhoneNoAllowed) -> {
        System.out.println("Welcome "+customer.customerName+" for registering phone number "+
                (isDisplayPhoneNoAllowed?customer.customerPhoneNumber:"************"));
    } ;

    static void greetCustomer(Customer customer,Boolean isDisplayPhoneNoAllowed)
    {
        System.out.println("Welcome "+customer.customerName+" for registering phone number "+
                (isDisplayPhoneNoAllowed?customer.customerPhoneNumber:"************"));
    }


}
