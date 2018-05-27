package mycontroller;

import tiles.MapTile;
import utilities.Coordinate;

import java.util.HashMap;

public class CarMovement {
    private HashMap<Coordinate, MapTile> prevCoords;
    private HashMap<Coordinate, MapTile> nextCoords;

    public HashMap<Coordinate, MapTile> getPrevCoords() {
        return prevCoords;
    }

    public void setPrevCoords(HashMap<Coordinate, MapTile> prevCoords) {
        this.prevCoords = prevCoords;
    }

    public HashMap<Coordinate, MapTile> getNextCoords() {
        return nextCoords;
    }

    public void setNextCoords(HashMap<Coordinate, MapTile> nextCoords) {
        this.nextCoords = nextCoords;
    }
}
