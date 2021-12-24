package com.dilip.dto;

public class Person {

    private final String name;
    public final GenderEnum gender;

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
