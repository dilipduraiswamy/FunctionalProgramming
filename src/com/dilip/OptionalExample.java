package com.dilip;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        //used for checking null values
        Optional.ofNullable(null)
                .ifPresentOrElse(email-> System.out.println("Sending Email"+email),
                        ()->System.out.println("Cannot Send Email")
                        );

        Optional.ofNullable("DilipDuraiswamy@gmail.com")
                .ifPresentOrElse(email-> System.out.println("Sending Email To "+email),
                        ()->System.out.println("Cannot Send Email")
                );

    }
}
