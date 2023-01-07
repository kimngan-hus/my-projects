package com.pattern.adapter.pseudocode;

public class SquarePegAdapter extends RoundPeg {
    private  SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg){
        super(0);
        this.peg=peg;
    }

    public double getRadius(){
        return peg.getWidth()*Math.sqrt(2)/2;
    }
}
