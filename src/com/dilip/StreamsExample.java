package com.dilip;

import com.dilip.dto.GenderEnum;
import com.dilip.dto.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.dilip.dto.GenderEnum.FEMALE;
import static com.dilip.dto.GenderEnum.MALE;

public class StreamsExample {
    public static void main(String[] args) {

        List<Person> people= List.of(
                new Person("dilip",MALE),
                new Person("asha",FEMALE),
                new Person("duraiswamy",MALE),
                new Person("rani",FEMALE),
                new Person("brownie",MALE)
        );

       people.stream()
               .map(person -> person.gender)
               .collect(Collectors.toSet())
               .forEach(System.out::println);
    }




}
