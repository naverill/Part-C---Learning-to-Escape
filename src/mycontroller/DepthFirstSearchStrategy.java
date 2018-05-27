package mycontroller;


import tiles.MapTile;
import utilities.Coordinate;
import world.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * The concrete implementation of the Explore strategy using a depth-first
 * search algorithm.
 */
public class DepthFirstSearchStrategy extends MyAIController implements ExploreStrategyInterface {
    private Stack<Coordinate> tileStack;
    private HashMap<Coordinate, MapTile> visited;

    public DepthFirstSearchStrategy(Car car) {
        super(car);

        tileStack = new Stack<Coordinate>();

        Coordinate prevCoords = state.getMovement().getPrevCoords();
        tileStack.push(prevCoords);

        // used as a proxy for 'visited' nodes
        visited.put(prevCoords, getView().get(prevCoords));
        state.getVision().putAll(getView());
    }

    /**
     * Checks if the map has been explored fully, which acts like a
     * de-initialization cue for this object.
     * @return - Boolean - whether the map has been fully explored or not.
     */
    @Override
    public boolean isExplored() {
        if (state.getVision().size() == getMap().size()) {
            return true;
        }

        return false;
    }

    /**
     * Wrapper interface method for algorithmic implementation of the explore functionality.
     */
    @Override
    public void newPath() {
        // provide a new path for the car to traverse
        depthFirstSearch();
    }

    /**
     * Implementation of depth first search, adjusted to incorporate
     * the map vision supplied from getView().
     */
    private void depthFirstSearch () {
        // take in current coordinate, as well as array of visited nodes
        // visit node, add to view
        if (tileStack.isEmpty()) { return; }

        Coordinate nextCoord = tileStack.pop();
        // sets the 'visited' nodes as the ones we've seen
        state.getMovement().setNextCoords(nextCoord);
        state.getVision().putAll(getView());

        // current node
        ArrayList<Coordinate>neighbours = state.getNeighbours(nextCoord);

        for (int i=0; i<neighbours.size(); i++) {
            Coordinate neighbour = neighbours.get(i);

            if (visited.get(neighbour) == null) {
                tileStack.push(neighbour);
                visited.put(neighbour, getView().get(neighbour));
            }
        }
    }
}