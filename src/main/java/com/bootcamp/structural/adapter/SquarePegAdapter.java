package com.bootcamp.structural.adapter;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public Double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
