package mycontroller;

import world.Car;

public class ExploreHandler extends MyAIController implements ExploreHandlerInterface {
    public ExploreHandler(Car car) {
        super(car);
    }

    @Override
    public boolean isExplored() {
        return false;
    }

    @Override
    public void updateMap() {

    }

    @Override
    public void newPath() {
        // provide a new path for the car to traverse

    }
}
