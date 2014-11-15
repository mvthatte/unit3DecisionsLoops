import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Bug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Scanner;

/**
* Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
* Also demonstrates how to provide accessor methods to make the class testable by unit tests.
* 
* @author @gcschmit
* @version 18 July 2014
*/
public class GameOfLife
{
// the world comprised of the grid that displays the graphics for the game
private ActorWorld world;

// the game board will have 5 rows and 5 columns
private final int ROWS = 10;
private final int COLS = 10;

// constants for the location of the three cells initially alive
private final int X1 = 2, Y1 = 1;
private final int X5 = 5, Y5 = 5
;
private final int X3 = 2, Y3 = 3;

/**
* Default constructor for objects of class GameOfLife
* 
* @post the game will be initialized and populated with the initial state of cells
* 
*/
public GameOfLife() throws InterruptedException
{
    // create the grid, of the specified size, that contains Actors
    BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
    BoundedGrid<Actor> newgrid = new BoundedGrid<Actor>(ROWS, COLS);
    // create a world based on the grid
    world = new ActorWorld(grid);
    // populate the game
    populateGame();
    world.show();
    // display the newly constructed and populated world
    Scanner in = new Scanner(System.in);
    
    System.out.print("How many generations?");
    int more = in.nextInt();
    for (int counter = 0; counter<= more; counter++)
    {
        createNextGeneration();
        Thread.sleep(100);
        world.show();
    }
   
}

/**
* Creates the actors and inserts them into their initial starting positions in the grid
*
* @pre the grid has been created
* @post all actors that comprise the initial state of the game have been added to the grid
* 
*/
public void populateGame()
{
    // the grid of Actors that maintains the state of the game
    // (alive cells contains actors; dead cells do not)
    Grid<Actor> grid = world.getGrid();
    
    Rock rock2 = new Rock();
    Location loc2 = new Location(X5, Y5);
    grid.put(loc2, rock2);

    // create and add rocks (a type of Actor) to the three intial locations
}

/**
* Generates the next generation based on the rules of the Game of Life and updates the grid
* associated with the world
*
* @pre the game has been initialized
* @post the world has been populated with a new grid containing the next generation
* 
*/
public void createNextGeneration()
{
    /** You will need to read the documentation for the World, Grid, and Location classes
       * in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> newgrid = new BoundedGrid<Actor>(ROWS, COLS);

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = this.getActor(row, col);
                Location newloc = new Location(row,col);
                ArrayList <Location> neighbors = grid.getOccupiedAdjacentLocations(newloc);
                int numNeighbors = neighbors.size();
                //if the cell at the current row and col should be alive, assert that the actor is not null
                if(cell == null && numNeighbors == 3)
                {
                    Rock newrock = new Rock();
                    newgrid.put(newloc, newrock);
                }
                if(cell != null && (numNeighbors == 3 || numNeighbors ==2))
                {
                    Rock newrock = new Rock();
                    newgrid.put(newloc, newrock);
                }

            }
        }
        world.setGrid(newgrid);
}

/**
* Returns the actor at the specified row and column. Intended to be used for unit testing.
*
* @param row the row (zero-based index) of the actor to return
* @param col the column (zero-based index) of the actor to return
* @pre the grid has been created
* @return the actor at the specified row and column
*/
public Actor getActor(int row, int col)
{
    Location loc = new Location(row, col);
    Actor actor = world.getGrid().get(loc);
    return actor;
}

/**
* Returns the number of rows in the game board
*
* @return the number of rows in the game board
*/
public int getNumRows()
{
    return ROWS;
}

/**
* Returns the number of columns in the game board
*
* @return the number of columns in the game board
*/
public int getNumCols()
{
    return COLS;
}

/**
* Creates an instance of this class. Provides convenient execution.
*
*/
public static void main(String[] args) throws InterruptedException
{
    GameOfLife game = new GameOfLife();
}
}