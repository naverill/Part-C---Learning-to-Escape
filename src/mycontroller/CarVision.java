package mycontroller;

import tiles.MapTile;
import utilities.Coordinate;

import java.util.HashMap;

public class CarVision {
    private HashMap<Coordinate, MapTile> vision;

    public HashMap<Coordinate, MapTile> getVision() {
        return vision;
    }

    public void setVision(HashMap<Coordinate, MapTile> vision) {
        this.vision = vision;
    }
}
