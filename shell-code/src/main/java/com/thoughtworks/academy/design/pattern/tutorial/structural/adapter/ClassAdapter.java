package com.thoughtworks.academy.design.pattern.tutorial.structural.adapter;

import com.thoughtworks.academy.design.pattern.tutorial.adapter.AAdaptee;
import com.thoughtworks.academy.design.pattern.tutorial.adapter.client.Target;

public class ClassAdapter extends AAdaptee implements Target{
    @Override
    public void request(String params) {

    }
}
