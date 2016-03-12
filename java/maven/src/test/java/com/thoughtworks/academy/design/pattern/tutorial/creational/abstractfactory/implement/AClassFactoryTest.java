package com.thoughtworks.academy.design.pattern.tutorial.creational.abstractfactory.implement;

import com.thoughtworks.academy.design.pattern.tutorial.absfactory.AClass;
import com.thoughtworks.academy.design.pattern.tutorial.absfactory.AlphabetClass;
import com.thoughtworks.academy.design.pattern.tutorial.creational.abstractfactory.AlphabetClassFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AClassFactoryTest {
    private AlphabetClassFactory aClassFactory;

    @Before
    public void setUp(){
        aClassFactory = new AClassFactory();//真实项目中会用容器，或构造器注入

    }

    @Test
    public void should_manufacture_instance(){
        AlphabetClass instanceofAClass = aClassFactory.newAlphabetClassInstance();

        assertThat(instanceofAClass, is(AClass.class));
    }

}