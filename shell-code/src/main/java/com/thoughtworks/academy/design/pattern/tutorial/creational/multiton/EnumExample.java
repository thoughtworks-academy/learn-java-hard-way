package com.thoughtworks.academy.design.pattern.tutorial.creational.multiton;

public enum EnumExample {
    A,B,C;
    
    public String nameToLowerCase(){
        return this.name().toLowerCase();
    }
}
