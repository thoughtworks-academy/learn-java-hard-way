package com.thoughtworks.academy.design.pattern.tutorial.creational.builder;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentBuilderTest {
    
    @Test
    public void should_build_with() {
        String name = "Tom";
        int age = 12;
        
        StudentBuilder givenStudent = new StudentBuilder();
        Person person = givenStudent.withName(name).withAge(age).build();

        assertThat(person, is(Student.class));
        assertThat(person.getAge(), is(12));
        assertThat(person.getName(), is("Tom"));
    }

    //扩展需求：请仿照Abstract Factory构造一个Abstract Builder
}