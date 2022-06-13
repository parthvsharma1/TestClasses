package com.spr.shapes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Square implements Quadrilateral {
    @Override
    public String getShape(){
        return "square";
    }
}
