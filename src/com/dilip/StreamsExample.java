package com.dilip;

import com.dilip.dto.GenderEnum;
import com.dilip.dto.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.dilip.dto.GenderEnum.FEMALE;
import static com.dilip.dto.GenderEnum.MALE;

public class StreamsExample {
    public static void main(String[] args) {

        List<Person> people= List.of(
                new Person("dilip",MALE,27),
                new Person("asha",FEMALE,45),
                new Person("duraiswamy",MALE,56),
                new Person("rani",FEMALE,52),
                new Person("brownie",MALE,10)
        );

       people.stream()
               .map(person -> person.gender)
               .collect(Collectors.toSet())
               .forEach(System.out::println);

       boolean isFemalesAvailable=people.stream().anyMatch(person -> FEMALE.equals(person.gender));
       System.out.println(isFemalesAvailable);


       List<Person> sortedPeoplesDescByAge= people.stream()
               .sorted(Comparator.comparing(Person::getAge))
               .collect(Collectors.toList());

       List<Person> sortedPeoplesAscByAge= people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());


        System.out.println("Descending Order Print By Age");
        sortedPeoplesDescByAge.stream()
               .forEach(System.out::println);

        System.out.println("Ascending Order Print By Age");
        sortedPeoplesAscByAge.stream()
                .forEach(System.out::println);

        System.out.println("Print max aged person");
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println("Print min aged person");
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

    }




}
