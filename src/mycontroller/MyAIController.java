package mycontroller;

import controller.CarController;
import tiles.MapTile;
import utilities.Coordinate;
import world.Car;

import java.util.HashMap;

public class MyAIController extends CarController{
    private ExploreStrategy exploreHandler;
    private KeyFindStrategy keyFindHandler;
    private MovementStrategy movementHandler;

    protected CarState state;

	public MyAIController(Car car) {
		super(car);
        this.state = new CarState();

		this.exploreHandler = new ExploreStrategy(car);
		this.keyFindHandler = new KeyFindStrategy(car);
		this.movementHandler = new MovementStrategy(car);


		setInitialState(state);
	}

	@Override
	public void update(float delta) {
		// check if map is explored
        // if not, explore map

        // if map is explored, initialise


	}

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
