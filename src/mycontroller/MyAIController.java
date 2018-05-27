package mycontroller;

import controller.CarController;
import tiles.MapTile;
import utilities.Coordinate;
import world.Car;

import java.util.HashMap;

/**
 * The AI controller responsible for controlling the car's exploration,
 * key finding and movement capabilities through interface subclasses.
 */
public class MyAIController extends CarController{
    private DepthFirstSearchStrategy dfsStrategy;
    private KeyFindStrategy keyFindStrategy;
    private MovementStrategy movementStrategy;

    protected CarState state;

    /**
     * Initializes car, state, and the three strategy subclasses,
     * as well as setting initial state.
     * @param car
     */
	public MyAIController(Car car) {
		super(car);
        this.state = new CarState();

		this.dfsStrategy = new DepthFirstSearchStrategy(car);
		this.keyFindStrategy = new KeyFindStrategy(car);
		this.movementStrategy = new MovementStrategy(car);


		setInitialState(state);
	}

    /**
     * Update method, the one entry point into the function from the
     * World object.
     * @param delta
     */
	@Override
	public void update(float delta) {

        if (dfsStrategy.isExplored()) {

            keyFindStrategy.newPath();
        } else {
            dfsStrategy.newPath();
        }

        movementStrategy.move(delta);
	}

    /**
     * Sets the initial state based on the initial spawn coordinates.
     * @param state
     */
	private void setInitialState(CarState state) {
        // sets initial state - movement and vision
        CarVision initialVision = new CarVision();
        initialVision.setVision(new HashMap<Coordinate, MapTile>());

        CarMovement initialMovement = new CarMovement();
        initialMovement.setPrevCoords(new Coordinate((int)getX(), (int)getY()));

        state.setMovement(initialMovement);
        state.setVision(initialVision);
    }
}
