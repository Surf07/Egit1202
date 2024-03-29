package Lesson765;



import java.awt.Polygon;
import java.util.ArrayList;

// Extending the Polygon class because I'm drawing Polygons

class Rock extends Polygon{

	// Upper left hand corner of the Polygon

	int uLeftXPos, uLeftYPos;

	// Used to change the direction of the asteroid when
	// it hits something and determines how fast it moves

	int xDirection = 1;
	int yDirection = 1;

	// Define rock height and width

	int rockWidth = 26;
	int rockHeight = 31;

	// Copy of the Rock ArrayList

	// Holds every Rock I create

	static ArrayList<Rock> rocks = new ArrayList<Rock>();

	// For JApplet
	// int width = ExampleBoard.WIDTH;
	// int height = ExampleBoard.HEIGHT;

	// Get the board width and height

	int width = GameBoard.boardWidth;
	int height = GameBoard.boardHeight;

	// Will hold the x & y coordinates for the Polygons

	int[] polyXArray, polyYArray;

	// x & y positions available for other methods
	// There will be more Polygon points available later

	public static int[] sPolyXArray = {10,17,26,34,27,36,26,14,8,1,5,1,10};
	public static int[] sPolyYArray = {0,5,1,8,13,20,31,28,31,22,16,7,0};

	// Creates a new asteroid

	public Rock(int[] polyXArray, int[] polyYArray, int pointsInPoly, int randomStartXPos, int randomStartYPos){

		// Creates a Polygon by calling the super or parent class of Rock Polygon

		super(polyXArray, polyYArray, pointsInPoly);

		// Randomly generate a speed for the Polygon

		this.xDirection = (int) (Math.random() * 4 + 1);

		this.yDirection = (int) (Math.random() * 4 + 1);

		// Holds the starting x & y position for the Rock

		this.uLeftXPos = randomStartXPos;

		this.uLeftYPos = randomStartYPos;

	}

	public void move(){

		// Get the upper left and top most point for the Polygon
		// This will be dynamic later on

		int uLeftXPos = super.xpoints[0];

		int uLeftYPos = super.ypoints[0];

		// If the Rock hits a wall it will go in the opposite direction

		if (uLeftXPos < 0 || (uLeftXPos + 25) > width) xDirection = -xDirection;

		if (uLeftYPos < 0 || (uLeftYPos + 50) > height) yDirection = -yDirection;

		// Change the values of the points for the Polygon

		for (int i = 0; i < super.xpoints.length; i++){

			super.xpoints[i] += xDirection;
			super.ypoints[i] += yDirection;

		}

	}

	// public method available for creating Polygon x point arrays

	public static int[] getpolyXArray(int randomStartXPos){

		// Clones the array so that the original shape isn't changed for the asteroid

		int[] tempPolyXArray = (int[])sPolyXArray.clone();

		for (int i = 0; i < tempPolyXArray.length; i++){

			tempPolyXArray[i] += randomStartXPos;

		}

		return tempPolyXArray;

	}

	// public method available for creating Polygon y point arrays

	public static int[] getpolyYArray(int randomStartYPos){

		// Clones the array so that the original shape isn't changed for the asteroid

		int[] tempPolyYArray = (int[])sPolyYArray.clone();

		for (int i = 0; i < tempPolyYArray.length; i++){

			tempPolyYArray[i] += randomStartYPos;

		}

		return tempPolyYArray;

	}

}