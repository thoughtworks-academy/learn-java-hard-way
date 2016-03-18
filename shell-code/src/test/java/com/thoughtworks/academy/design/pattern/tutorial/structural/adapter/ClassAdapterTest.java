package com.thoughtworks.academy.design.pattern.tutorial.structural.adapter;

import com.thoughtworks.academy.design.pattern.tutorial.adapter.client.Client;
import org.junit.Test;

public class ClassAdapterTest {
    @Test
    public void should_adapter_class(){
        Client adapterClient = new Client();
        adapterClient.request(new ClassAdapter());
    }
}
