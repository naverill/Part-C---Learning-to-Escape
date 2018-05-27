package mycontroller;

import utilities.PeekTuple;
import world.Car;

public class MovementStrategy extends MyAIController implements MovementStrategyInterface {
    public MovementStrategy(Car car) {
        super(car);
    }

    @Override
    public void move(float delta) {
    }
}
