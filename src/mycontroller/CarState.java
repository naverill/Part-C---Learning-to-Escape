package mycontroller;

public class CarState {
    private CarVision vision;
    private CarMovement movement;

    public CarVision getVision() {
        return vision;
    }

    public void setVision(CarVision vision) {
        this.vision = vision;
    }

    public CarMovement getMovement() {
        return movement;
    }

    public void setMovement(CarMovement movement) {
        this.movement = movement;
    }
}
