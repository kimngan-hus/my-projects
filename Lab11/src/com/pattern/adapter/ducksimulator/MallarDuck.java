package com.pattern.adapter.ducksimulator;

public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("i'm flying");
    }
}
