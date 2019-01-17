package com.university;

import java.awt.*;

public class MonsterBalls extends Movable {

    private final int radius;
    private Color color;
//    private

    public MonsterBalls(int radius) {
        this.radius = radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    void move() {

    }
}
