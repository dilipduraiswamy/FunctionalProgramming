package com.dilip.imperative;

import java.util.ArrayList;
import java.util.List;

import static com.dilip.imperative.Gender.FEMALE;
import static com.dilip.imperative.Gender.MALE;


public class Filtering {

    public static void main(String[] args) {

        List<Person> people= List.of(
                new Person("dilip",MALE),
                new Person("asha",FEMALE),
                new Person("duraiswamy",MALE),
                new Person("rani",FEMALE),
                new Person("brownie",MALE)
        );

        //filter females from list

        System.out.println("Imperative Method");
        List<Person> females=new ArrayList<>();
        for(Person person:people){
            if(FEMALE.equals(person.gender))
            {
                females.add(person);
            }
        }

        for(Person person:females){
            System.out.println(person);
        }

        System.out.println("Declarative Method");
        people.stream()
                .filter(person->FEMALE.equals(person.gender))
                .forEach(System.out::println);


    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


}
