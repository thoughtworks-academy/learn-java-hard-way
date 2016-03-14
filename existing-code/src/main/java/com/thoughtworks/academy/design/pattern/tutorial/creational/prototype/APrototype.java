package com.thoughtworks.academy.design.pattern.tutorial.creational.prototype;

public class APrototype extends BasePrototype {
    private final String name;

    public APrototype(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
        
    }
}
