package com.thoughtworks.academy.design.pattern.tutorial.creational.prototype;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BasePrototypeTest {
    @Test
    public void should_clone_a() {
        System.out.println("13".contains("3"));  ;
        APrototype aPrototype = new APrototype("Tom");

        BasePrototype clonedA = aPrototype.cloneMySelf();
        assertThat(clonedA, is(APrototype.class));
        assertThat(clonedA == aPrototype, is(false));
        assertThat(((APrototype) clonedA).getName(), is("Tom"));


    }

    @Test
    public void should_clone_b() {
        BPrototype bPrototype = new BPrototype(12);

        BasePrototype clonedB = bPrototype.cloneMySelf();

        assertThat(clonedB, is(BPrototype.class));
        assertThat(clonedB == bPrototype, is(false));
        assertThat(((BPrototype)clonedB).getAge(), is(12));
    }

}