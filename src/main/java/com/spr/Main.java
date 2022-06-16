package com.spr;

public class Main {

    public static void main(String[] args) throws Exception {

        boolean exc=false;
        try {
            FindCyclicDependency.main(null);
        } catch (Exception e){
            exc=true;
            System.out.println("ecxxx");
        }
        if(exc)
        {
            System.out.println("shabaash");
        }

        return;
    }
}
