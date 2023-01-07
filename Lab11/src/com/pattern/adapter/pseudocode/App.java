package com.pattern.adapter.pseudocode;

public class App {
    public static void main(String[] args) {
        RoundHole roundhole = new RoundHole(5);
        RoundPeg roundpeg = new RoundPeg(5);
        System.out.println(roundhole.fits(roundpeg));

        SquarePeg small = new SquarePeg(5);
        SquarePeg big = new SquarePeg(10);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(small);
        SquarePegAdapter bigSquarePegAdapter = new SquarePegAdapter(big);
        System.out.println(roundhole.fits(smallSquarePegAdapter));
        System.out.println(roundhole.fits(bigSquarePegAdapter));

    }
}
