package com.dilip;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiPredicate.html
public class BiPredicateExample {

    public static void main(String[] args) {
        //check using normal function
        System.out.println("Normal Function");
        System.out.println(checkPhoneNumberValid("7012345678",10));
        System.out.println(checkPhoneNumberValid("90123456781",11));

        //check using bipredicate
        System.out.println("BiPredicate Function");
        System.out.println(checkPhoneNumberUsingPredicate.test("7012345678",10));
        System.out.println(checkPhoneNumberUsingPredicate.test("9012345678",10));


    }

    //bipredicate take two input values and gives output boolean back ..can be used in lamdbas
    static BiPredicate<String,Integer> checkPhoneNumberUsingPredicate=
            (phoneNumber,lengthOfPhoneNumber)->
                    phoneNumber.contains("70")&&phoneNumber.length()==lengthOfPhoneNumber;


    static boolean checkPhoneNumberValid(String phoneNumber,int lengthOfPhoneNumber)
    {
        return phoneNumber.contains("70")&&phoneNumber.length()==lengthOfPhoneNumber;
    }
}
