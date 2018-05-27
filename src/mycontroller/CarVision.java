package mycontroller;

import tiles.MapTile;
import utilities.Coordinate;

import java.util.ArrayList;
import java.util.HashMap;

public class CarVision {
    private HashMap<Coordinate, MapTile> vision;

    public HashMap<Coordinate, MapTile> getVision() {
        return vision;
    }

    public void setVision(HashMap<Coordinate, MapTile> vision) {
        this.vision = vision;
    }

    public ArrayList<Coordinate> getNeighbours(Coordinate tile) {
        // implement get neighbours logic
        return  new ArrayList<Coordinate> ();
    }
}
