package mycontroller;


import tiles.MapTile;
import utilities.Coordinate;
import world.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExploreStrategy extends MyAIController implements ExploreStrategyInterface {
    private Stack<Coordinate> tileStack;

    public ExploreStrategy(Car car) {
        super(car);

        tileStack = new Stack<Coordinate>();

        tileStack.push(state.getMovement().getPrevCoords());

        // used as a proxy for 'visited' nodes
        state.getVision().setVision(getView());
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

    private void depthFirstSearch () {
        // take in current coordinate, as well as array of visited nodes
        // visit node, add to view
        if (tileStack.isEmpty()) { return; }

        Coordinate nextCoord = tileStack.pop();
        state.getMovement().setNextCoords(nextCoord);
        // current node

        ArrayList<Coordinate>neighbours = state.getVision().getNeighbours(nextCoord);

        for (int i=0; i<neighbours.size(); i++) {
            Coordinate neighbour = neighbours.get(i);

            if (state.getVision().getVision().get(neighbour) == null) {
                tileStack.push(neighbour);
            }
        }
    }
}
/*
    // Iterative DFS using stack
    public  void dfsUsingStack(Node node)
    {
        Stack<Node> stack=new  Stack<Node>();
        stack.add(node);
        node.visited=true;
        while (!stack.isEmpty())
        {
            Node element=stack.pop();
            System.out.print(element.data + " ");

            List<Node> neighbours=element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    stack.add(n);
                    n.visited=true;

                }
            }
        }
    }
    */