package mycontroller;

import controller.CarController;
import utilities.Coordinate;
import world.Car;

public class MyAIController extends CarController{
    private ExploreHandler exploreHandler;
    private KeyFindHandler keyFindHandler;
    private MovementHandler movementHandler;

    protected CarState state;

	public MyAIController(Car car) {
		super(car);
		this.exploreHandler = new ExploreHandler(car);
		this.keyFindHandler = new KeyFindHandler(car);
		this.movementHandler = new MovementHandler(car);
		this.state = new CarState();

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
        initialVision.setVision(getMap());

        CarMovement initialMovement = new CarMovement();
        initialMovement.setPrevCoords(new Coordinate((int)getX(), (int)getY()));

        state.setMovement(initialMovement);
        state.setVision(initialVision);
    }
}
