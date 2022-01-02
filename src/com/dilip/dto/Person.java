package com.dilip.dto;

public class Person {

    private final String name;
    public final GenderEnum gender;
    private Integer age;

    public Person(String name, GenderEnum gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person(String name, GenderEnum gender,Integer age) {
        this.name = name;
        this.gender = gender;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }


    public String getName() {
        return name;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
