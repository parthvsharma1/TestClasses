package com.spr.sprinklrr;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MyImplement2 implements MyInterface{
    @Override
    public String func(){
        return "My Implement 1";
    }

}
