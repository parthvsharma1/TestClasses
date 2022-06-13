package com.spr.sprinklrr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class base {

    @Autowired
    @Qualifier("myImplement1")
    private MyInterface myInterface;

    @Autowired
    private MyInterface oneMore;
}
