package com.dilip;

import com.dilip.dto.GenderEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.dilip.dto.GenderEnum.FEMALE;
import static com.dilip.dto.GenderEnum.MALE;

public class FilteringWithPredicateExample {

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
        //predicate takes one argument and return boolean
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);


    }

    static class Person{
        private final String name;
        private final GenderEnum gender;

        public Person(String name, GenderEnum gender) {
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
