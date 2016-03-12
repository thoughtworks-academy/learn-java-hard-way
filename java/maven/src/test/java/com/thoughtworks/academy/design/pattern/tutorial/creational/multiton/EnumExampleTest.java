package com.thoughtworks.academy.design.pattern.tutorial.creational.multiton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EnumExampleTest {

    @Test
    public void should_get_instance_by_name() {
        assertThat(EnumExample.A, is(EnumExample.class));
        assertThat(EnumExample.C.nameToLowerCase(), is("c"));

        
        assertThat(EnumExample.values().length, is(6));
        assertThat(EnumExample.valueOf("B"), is(EnumExample.B));
        //assertThat(EnumExample.valueOf("E"), is(EnumExample.E));


    }

    
}