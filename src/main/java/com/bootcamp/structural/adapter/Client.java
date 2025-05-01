package com.bootcamp.structural.adapter;

public class Client {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5.0);
        RoundPeg roundPeg = new RoundPeg(3.0);
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(10.0);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);

        System.out.println(roundHole.fits(adapter));
    }
}
