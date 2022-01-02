package com.dilip;

import com.dilip.dto.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer->customer.emailId.contains("@")?ValidationResult.SUCCESS:ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneValid(){
        return customer -> customer.customerPhoneNumber.contains("+")?ValidationResult.SUCCESS:ValidationResult.PHONE_NOT_VALID;
    }

    static CustomerRegistrationValidator isDobValid(){
        return customer -> Period.between(customer.dob, LocalDate.now()).getYears()>20?ValidationResult.SUCCESS:ValidationResult.DOB_NOT_VALID;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other){
        return customer -> {
            ValidationResult result=this.apply(customer);
            return result.equals(ValidationResult.SUCCESS)?other.apply(customer):result;
        };
    }
    enum ValidationResult{
       SUCCESS, EMAIL_NOT_VALID, PHONE_NOT_VALID , DOB_NOT_VALID
    }
}
