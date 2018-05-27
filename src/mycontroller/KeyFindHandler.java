package mycontroller;

import world.Car;

public class KeyFindHandler extends MyAIController implements KeyFindHandlerInterface {
    public KeyFindHandler(Car car) {
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
