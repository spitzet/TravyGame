package com.university;

import java.awt.*;

public abstract class GameObject {
    private Color color;
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }
}
