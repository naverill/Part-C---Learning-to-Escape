package mycontroller;

import world.Car;

public class KeyFindStrategy extends MyAIController implements KeyFindStrategyInterface {
    public KeyFindStrategy(Car car) {
        super(car);
    }

    @Override
    public boolean isKeyFound() {
        return false;
    }

    @Override
    public void newPath() {
        // set state
    }
}
