package com.pattern.adapter.ducksimulator;

import java.util.LinkedList;
import java.util.List;

public class DuckSimulation {
    public static void main(String[] args) {
        MallarDuck mallarduck = new MallarDuck();
        WildTurkey wildturkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildturkey);

        List<Duck> ducks = new LinkedList<>();
        ducks.add(mallarduck);
        ducks.add(turkeyAdapter);

        for (Duck duck : ducks) {
            duck.quack();
            duck.fly();
        }
    }
}
