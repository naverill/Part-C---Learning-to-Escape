package mycontroller;

import tiles.MapTile;
import utilities.Coordinate;

import java.util.HashMap;

public class CarMovement {
    private Coordinate prevCoords;
    private Coordinate nextCoords;

    public Coordinate getPrevCoords() {
        return prevCoords;
    }

    public void setPrevCoords(Coordinate prevCoords) {
        this.prevCoords = prevCoords;
    }

    public Coordinate getNextCoords() {
        return nextCoords;
    }

    public void setNextCoords(Coordinate nextCoords) {
        this.nextCoords = nextCoords;
    }
}
