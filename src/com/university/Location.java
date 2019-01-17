package com.university;

public class Location {
    private float x;
    private float y;

    public Location(float x, float y) {
        setX(x);
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        if (x < 0) {
            throw new UnsupportedOperationException("x cannot be less than 0. x: " + x);
        }
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        if (y < 0) {
            throw new UnsupportedOperationException("y cannot be less than 0. x: " + x);
        }
        this.y = y;
    }

}
