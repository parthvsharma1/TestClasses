package com.spr.parth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

//    @Autowired
    A a;

    @Autowired
    C c;

    @Autowired
    public B(A a) {
        super();
        this.a = a;
    }

    public C getC() {return c;}
    public void setC(C c) {this.c = c;}
    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}