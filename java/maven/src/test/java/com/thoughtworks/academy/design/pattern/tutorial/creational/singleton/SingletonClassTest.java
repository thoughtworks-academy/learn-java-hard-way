package com.thoughtworks.academy.design.pattern.tutorial.creational.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SingletonClassTest {
    @Test
    public void should_get_single_instance(){
        SingletonClass singleOne = SingletonClass.getInstance();
        SingletonClass singleAgain = SingletonClass.getInstance();

        assertThat(singleOne == singleAgain, is(true));
        Constructor<?>[] constructors = SingletonClass.class.getConstructors();
        assertThat(constructors.length, is(1));//有且只有一个构造器
        assertThat(Modifier.isPrivate(constructors[0].getModifiers()), is(true));//访问控制符为private

    }
}