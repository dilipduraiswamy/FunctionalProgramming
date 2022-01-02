package com.dilip;

import com.dilip.dto.Customer;

import java.time.LocalDate;

import static com.dilip.CustomerRegistrationValidator.*;

public class ValidatorExample {

    public static void main(String[] args) {
        Customer customer=new Customer(
                "diip",
                "+919538013461",
                LocalDate.of(1994,01,01),
                "dilipduraiswamy@gmail.com");

        //using combinator pattern
        ValidationResult result = isPhoneValid()
                .and(isDobValid())
                .and(isEmailValid())
                .apply(customer);
        if(result!=ValidationResult.SUCCESS)
        {
             throw new IllegalStateException();
        }else
        {
            System.out.println("Success");
        }


    }
}
