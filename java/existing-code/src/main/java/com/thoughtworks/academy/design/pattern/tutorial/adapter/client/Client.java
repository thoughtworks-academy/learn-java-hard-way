package com.thoughtworks.academy.design.pattern.tutorial.adapter.client;

public class Client {
    public void request(Target target) {
        target.request("{\"name\":\"张三\"}");
    }
}
