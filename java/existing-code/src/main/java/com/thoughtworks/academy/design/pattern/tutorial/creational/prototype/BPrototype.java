package com.thoughtworks.academy.design.pattern.tutorial.creational.prototype;

public class BPrototype extends BasePrototype{
    private final int age;

    public BPrototype(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;

    }
}
