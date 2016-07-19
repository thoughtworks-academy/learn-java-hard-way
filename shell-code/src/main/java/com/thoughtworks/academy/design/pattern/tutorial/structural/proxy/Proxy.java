package com.thoughtworks.academy.design.pattern.tutorial.structural.proxy;

public class Proxy implements Subject {


    private RealSubject subject;

    @Override
    public void request() {
        this.subject = getRealSubject();
        subject.request(); 
    }

    public RealSubject getRealSubject() {
        return new RealSubject();
    }
}
