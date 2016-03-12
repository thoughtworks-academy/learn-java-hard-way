package com.thoughtworks.academy.design.pattern.tutorial.adapter;

import java.util.Map;

public class AAdaptee {
    
    public void specificRequest(Map<String, String> params) {

        if(!"张三".equals(params.get("name"))) {
            throw new RuntimeException("HaHaHa");
        }
    }
}
