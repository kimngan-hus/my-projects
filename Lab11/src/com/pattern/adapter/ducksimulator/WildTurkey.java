package com.pattern.adapter.ducksimulator;

public class WildTurkey  implements  Turkey{


    @Override
    public void gobble() {
        System.out.println("gooble gooble");
    }

    @Override
    public void fly(){
        System.out.println("i'm flying a short distance");
    }
}
