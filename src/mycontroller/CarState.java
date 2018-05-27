package mycontroller;

import tiles.MapTile;
import utilities.Coordinate;

import java.util.ArrayList;
import java.util.HashMap;

public class CarState {
    private CarVision vision;
    private CarMovement movement;

    /**
     * @return Current map vision.
     */
    public HashMap<Coordinate, MapTile> getVision() {
        return vision.getVision();
    }

    /**
     * @param vision
     */
    public void setVision(CarVision vision) {
        this.vision = vision;
    }

    /**
     * @return Current state of previous and next moves for car.
     */
    public CarMovement getMovement() {
        return movement;
    }

    /**
     * @param movement
     */
    public void setMovement(CarMovement movement) {
        this.movement = movement;
    }

    /**
     * @param coordinate Coordinate to query neighbours
     * @return Immediate neighbours around the coordinate.
     */
    public ArrayList<Coordinate> getNeighbours(Coordinate coordinate) {
        return this.vision.getNeighbours(coordinate);
    }
}
