package com.spr.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle {
    Quadrilateral quadrilateral;
    @Autowired
    public Circle( Quadrilateral quadrilateral){
        this.quadrilateral=quadrilateral;
        System.out.println("MADE A CIRCLE OBJECT !!!!!!!!");
    }

}
