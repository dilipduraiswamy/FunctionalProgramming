package com.dilip.dto;

import java.time.LocalDate;

public class Customer {

        public final String customerName;
        public final String customerPhoneNumber;
        public LocalDate dob;
        public String emailId;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

      public Customer(String customerName, String customerPhoneNumber, LocalDate dob, String emailId) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.dob = dob;
        this.emailId = emailId;
      }
}
