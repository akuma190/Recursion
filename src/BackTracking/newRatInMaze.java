package BackTracking;

import java.util.Arrays;

public class newRatInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { 
				{ 1, 1, 0, 1 }, 
				{ 0, 1, 1, 1 }, 
				{ 0, 1, 0, 1 }, 
				{ 0, 1, 1, 1 } };
		int[][] visited = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		findMazePath(maze,visited,0,0);
	}
	public static void findMazePath(int[][] maze,int[][] visited,int x,int y) {
		if(x<0 || y<0 || x>maze.length-1 || y>maze[0].length-1 || visited[x][y]!=0 ||maze[x][y]==0) {
			return;
		}
		if(x==maze.length-1 && y==maze[0].length-1) {
			visited[x][y]=1;
			for(int[] arr:visited) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("-------");
			return;
		}
		visited[x][y]=1;
		findMazePath(maze,visited,x,y+1);
		findMazePath(maze,visited,x,y-1);
		findMazePath(maze,visited,x+1,y);
		findMazePath(maze,visited,x-1,y);
		visited[x][y]=0;
		
	}

}
