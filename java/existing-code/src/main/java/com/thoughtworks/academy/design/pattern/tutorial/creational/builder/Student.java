package com.thoughtworks.academy.design.pattern.tutorial.creational.builder;

public class Student implements Person{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public int getAge() {
        return age;
    }


}
