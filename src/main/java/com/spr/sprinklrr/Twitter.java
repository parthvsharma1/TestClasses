package com.spr.sprinklrr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Twitter {
    private String name;
    private Integer number;

    private Facebook fb;

    @Autowired
    public Twitter(Facebook fb)
    {
        System.out.println("making object :C ");
        this.fb=fb;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Facebook getFb() {
        return fb;
    }

    public void setFb(Facebook fb) {
        this.fb = fb;
    }
}
