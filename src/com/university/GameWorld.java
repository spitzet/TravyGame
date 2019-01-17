package com.university;

import java.util.ArrayList;
import java.util.List;

public class GameWorld {

    private List<FieldSquare> grid;

    public GameWorld() {
        grid = new ArrayList<>();
        for (int x = 1; x <= 100; x++){
            for (int y = 1; y <= 100; y++){
                Location location = new Location(x, y);
                FieldSquare square = new FieldSquare(location);
                grid.add(square);
            }
        }
    }
}
