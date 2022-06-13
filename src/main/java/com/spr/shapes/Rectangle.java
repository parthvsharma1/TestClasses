package com.spr.shapes;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Quadrilateral{
    @Override
    public String getShape(){
        return "rectangle";
    }
}
