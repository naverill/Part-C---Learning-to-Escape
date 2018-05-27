package mycontroller;

public interface KeyFindHandlerInterface {
    public boolean isKeyFound();

    CarState newPath(CarState state);
}
