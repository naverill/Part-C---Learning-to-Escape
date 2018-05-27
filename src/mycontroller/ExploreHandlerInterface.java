package mycontroller;

public interface ExploreHandlerInterface {
    public boolean isExplored();

    CarState newPath(CarState state);
}
