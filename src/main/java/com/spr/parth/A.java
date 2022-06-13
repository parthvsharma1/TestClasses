package com.spr.parth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private Integer number;
    @Autowired
    B b;
    public A(){}

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public A(B b) {
        super();
        this.b = b;
    }

    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }

    public void doSomeThing()
    {
        System.out.println("Doing some work");
    }
}