package cracking_practice;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;


public class robotGrid {

	static ArrayList<Point> getPath(boolean[][] maze) {
		if (maze == null || maze.length == 0) return null;
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> failedPoints = new HashSet<Point>();
		if (getPath(maze, maze.length - 1, maze[0].length - 1, path, failedPoints)) {
			return path;
		}
		return null;
	}
	
	static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path, HashSet<Point>
			failedPoints) {
		if (col < 0 || row < 0 || !maze[row][col]) {
			return false;
		}
		
		Point p = new Point(row, col);
		
		boolean isAtOrigin = (row == 0) && (col == 0);
		
		if (isAtOrigin || getPath(maze, row, col - 1, path, failedPoints) ||
		getPath(maze, row - 1, col, path, failedPoints)) {
			path.add(p);
			return true;
		}
		
		failedPoints.add(p);
		return false; 
	}
	
	public static void main(String[] args) {
		boolean[][] maze = new boolean[2][3];
		System.out.println(getPath(maze));
	}
}
