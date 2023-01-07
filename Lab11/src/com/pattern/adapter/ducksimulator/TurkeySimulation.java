package com.pattern.adapter.ducksimulator;

import java.util.LinkedList;
import java.util.List;

public class TurkeySimulation {
    public static void main(String[] args) {
        MallarDuck mallarduck = new MallarDuck();
        WildTurkey wildturkey = new WildTurkey();
        Turkey duckAdapter = new DuckAdapter(mallarduck);

        List<Turkey> turkeys = new LinkedList<>();
        turkeys.add(wildturkey);
        turkeys.add(duckAdapter);

        for (Turkey turkey : turkeys){
            turkey.gobble();
            turkey.fly();
        }
    }
}
