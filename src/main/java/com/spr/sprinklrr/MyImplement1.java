package com.spr.sprinklrr;

import org.springframework.stereotype.Component;

@Component
public class MyImplement1 implements MyInterface{
    @Override
    public String func(){
        return "My Implement 1";
    }

}
