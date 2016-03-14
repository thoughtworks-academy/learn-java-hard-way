package com.thoughtworks.academy.design.pattern.tutorial.creational.abstractfactory.implement;

import com.thoughtworks.academy.design.pattern.tutorial.absfactory.AlphabetClass;
import com.thoughtworks.academy.design.pattern.tutorial.absfactory.BClass;
import com.thoughtworks.academy.design.pattern.tutorial.creational.abstractfactory.AlphabetClassFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BClassFactoryTest {
    private AlphabetClassFactory bClassFactory;

    @Before
    public void setUp(){
        bClassFactory = new BClassFactory();//真实项目中会用容器，或构造器注入

    }

    @Test
    public void should_manufacture_instance(){
        AlphabetClass instanceofAClass = bClassFactory.newAlphabetClassInstance();

        assertThat(instanceofAClass.getClass(), is(BClass.class));
    }

}