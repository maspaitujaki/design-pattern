package com.bootcamp.structural.adapter;

public class RoundHole {
    private final Double radius;

    public RoundHole(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
