package RecursionPrograms;

import java.util.Arrays;

//we will be trying multiple paths until we reach our destination.
public class RatInMaze {
    static int[] pathRow= { 0, 0, 1, -1 };
    static int[] pathCol= { 1, -1, 0, 0 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze= {{1,1,0,1 },
                       {0,1,1,1 },
                       {0,1,0,1 },
                       {0,1,1,1 }};
		int[][] visited={{0,0,0,0 },
                         {0,0,0,0 },
                         {0,0,0,0 },
                         {0,0,0,0 }};
		visited[0][0]=1;
		findPath(maze,visited,0,0,3,3,1);

	}
	
	public static void findPath(int[][] maze,int[][] visited,int row,int col,int desRow,int desCol,int move) {
		if((row==desRow)&&(col==desCol)) {
			//System.out.println("hi");
			for(int[] ar:visited) {
				System.out.println(Arrays.toString(ar));
			}
			return;
		}
		for(int i=0;i<pathRow.length;i++) {
			int newRow=row+pathRow[i];
			int newCol=col+pathCol[i];
			//System.out.println(canMove(newRow,newCol,maze,visited));
			if(canMove(newRow,newCol,maze,visited)) {
				move=move+1;
				visited[newRow][newCol]=move;
				findPath(maze,visited,newRow,newCol,desRow,desCol,move);
				move=move-1;
				visited[newRow][newCol]=0;
			}
			
		}
	}
	
	public static boolean canMove(int row,int col,int[][] maze,int[][] visited) {
		if(row>=0 && row<maze.length && col>=0 && col<maze[0].length && maze[row][col]==1 && visited[row][col]==0) {
			return true;
		}
		return false;
	}

}
