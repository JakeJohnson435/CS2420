import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author
 * @version
 *
 */

public class Recursion {

	public static void main(String[] args){

//		solveMaze("Maze1-easy.txt");
//		solveMaze("Maze2-manyChoices.txt");
//		solveMaze("Maze3-Large.txt");
//		solveMaze("Maze4-No_Solution.txt");
//		solveMaze("Maze5-Larger.txt");

//		String[][] maze =readMazeFromFile("CS2420/src/Maze1-easy.txt");

		File maze = new File("CS2420/src/Maze1-easy.txt");

		solveMaze(maze);



	}
	
	
	//Probably not void, or 0 arguments
	public static String[][] readMazeFromFile(String filename) {

		try {
			Scanner in = new Scanner(new File(filename));

			int cols = in.nextInt();
			int rows = in.nextInt();

			String [][] maze = new String[cols][rows];

			for (int c = 0; c < maze.length; c++){
				for (int r = 0; r < maze[c].length; r++){

					maze[c][r] = in.next();

				}
			}

			return maze;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	//Probably not 0 arguments
	public static void printMaze(String[][] maze) {

		int rows = maze.length;
		int cols = maze[0].length;

		for (int c = 0; c < rows; c++){

			for (int r = 0; r < cols; r++){
				System.out.print(maze[c][r]);
			}
			System.out.println();
		}

	}
	
	//This method is what the book calls the "driver" method
	public static void solveMaze(File filename){
		//setup all the variables correctly

		System.out.println("Working on maze " + filename);

		String file = filename.toString();
		
		
		String [][] maze = readMazeFromFile(file);
		printMaze(maze);

		int startX = -1;
		int startY = -1;

		for (int c = 0; c < maze.length; c++){
			for (int r = 0; r < maze[c].length; r++){

				if (maze[c][r].equalsIgnoreCase("s")){
					startX = c;
					startY = r;
				}

			}
		}

		System.out.println("The starting location is: " + startX + ", " + startY);

		mazeTraversal(maze, startX, startY);

		
		//For sure pass the x and y for the "S" location, and whatever data structure you are using to represent the maze
//		mazeTraversal(maze);
		
		System.out.println("\n\n");
	}

	/**
	 * You get to set the parameters to this method
	 * Think about what you need.
	 * A few suggestions:
	 * How does the method represent the maze
	 * How does the method know which square to look at?
	 * 
	 * Also - this is not just a single base case and a single recursive case.
	 * If the maze is solved by going left - there is a solution
	 * If the maze is solved by going right - there is a solution
	 * If the maze is solved by going up - there is  a solution
	 * If the maze is solved by going down - there is  a solution
	 * 
	 * Also, depending on how you go up, down, left, and right
	 * there might be several base cases, like, on a wall,
	 * on the start, on the end, on a trail already marked...
	 */

	public static boolean mazeTraversal(String [][] maze, int x, int y){
		//Note, you should not need any loops.  Your first instinct might be to add them, but ignore that instinct
		//Loops are for iteration, not recursion

		if (maze[x][y].equalsIgnoreCase("e")){
			System.out.println("Finished");
			return true;
		}

		if (x<0 || y<0){
			return false;
		}

		if (maze[x][y].equals("#")){
			return false;
		}

		if (maze[x][y].equals("?")){
			return false;
		}

		if (maze[x][y].equals(".")){
			if (mazeTraversal(maze, x+1, y)){
				return true;
			}
			if (mazeTraversal(maze, x-1, y)){
				return true;
			}
			if (mazeTraversal(maze, x, y+1)){
				return true;
			}
			if (mazeTraversal(maze, x+1, y-1)){
				return true;
			}
		}

		return false;
	}



}