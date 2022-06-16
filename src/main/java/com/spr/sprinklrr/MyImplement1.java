package com.spr.sprinklrr;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyImplement1 implements MyInterface{
    @Override
    public String func(){
        return "My Implement 1";
    }

}
