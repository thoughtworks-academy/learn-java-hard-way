package com.thoughtworks.academy.design.pattern.tutorial.structural.adapter;

import com.thoughtworks.academy.design.pattern.tutorial.structural.adapter.client.Client;
import com.thoughtworks.academy.design.pattern.tutorial.structural.adapter.client.Target;
import org.junit.Before;
import org.junit.Test;

public class ObjectAdapterTest {

    private Target target;

    @Before
    public void setUp() throws Exception {
        target = new ObjectAdapter(new AAdaptee());
    }

    @Test
    public void should_adapter_object(){
        Client adapterClient = new Client();
        adapterClient.request(target);
    }
}
