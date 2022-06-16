package com.spr.sprinklrr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// dependency on an INTERFACE
@Component
public class base {

    @Qualifier("myImplement1")
    @Autowired
    private MyInterface myInterface;

    @Autowired
    private MyInterface oneMore;
}
