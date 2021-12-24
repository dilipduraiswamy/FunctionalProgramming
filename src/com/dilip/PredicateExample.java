package com.dilip;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        //check using normal function
        System.out.println("Normal Function");
        System.out.println(checkPhoneNumberValid("7012345678"));
        System.out.println(checkPhoneNumberValid("9012345678"));

        //check using predicate
        System.out.println("Predicate Function");
        System.out.println(checkPhoneNumberUsingPredicate.test("7012345678"));
        System.out.println(checkPhoneNumberUsingPredicate.test("9012345678"));

        //combining predicates
        System.out.println("Combining multiple Predicate Function");
        System.out.println(checkPhoneNumberUsingPredicate.and(checkPhoneNumberContains3).test("7012345678"));
        System.out.println(checkPhoneNumberUsingPredicate.or(checkPhoneNumberContains3).test("7012845678"));
    }

    static Predicate<String> checkPhoneNumberUsingPredicate=
            phoneNumber->
                    phoneNumber.contains("70")&&phoneNumber.length()==10;

    static Predicate<String> checkPhoneNumberContains3=
            phoneNumber->
                    phoneNumber.contains("3");

    static boolean checkPhoneNumberValid(String phoneNumber)
    {
        return phoneNumber.contains("70")&&phoneNumber.length()==10;
    }
}
