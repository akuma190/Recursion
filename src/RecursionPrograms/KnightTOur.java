package RecursionPrograms;

import java.util.Arrays;

//can the night occupy all the cells of the board.
//knight cannot traverse the already traversed cell.
//knight can make a move in eight different directions.
public class KnightTOur {
    static int[] pathRow= { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int[] pathCol= { 1, 2, 2, 1, -1, -2, -2, -1 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] visited= {{0,0,0,0,0,0,0,0 },
                          {0,0,0,0,0,0,0,0 },
                          {0,0,0,0,0,0,0,0 },
                          {0,0,0,0,0,0,0,0 },
                          {0,0,0,0,0,0,0,0 },
                          {0,0,0,0,0,0,0,0 },
                          {0,0,0,0,0,0,0,0 },
                          {0,0,0,0,0,0,0,0 }};
		visited[0][0]=1;
		moveKnight(visited,0,0,1);

	}
	public static boolean moveKnight(int[][] visited,int row,int col,int move) {
		if(move==(visited.length*visited[0].length)) {
			for(int[] ar:visited) {
				System.out.println(Arrays.toString(ar));
			}
			System.out.println("-------------------");
			return true;
		}
		for(int[] ar:visited) {
			System.out.println(Arrays.toString(ar));
		}
		System.out.println("-------------------");
		for(int i=0;i<pathRow.length;i++) {
			int newRow=row+pathRow[i];
			int newCol=row+pathCol[i];
			if(canKnightMove(newRow,newCol,visited)) {
				//System.out.println("hi");
				move=move+1;
				visited[newRow][newCol]=move;
				if(moveKnight(visited,newRow,newCol,move)) {
					return true;
				}
				move=move-1;
				visited[newRow][newCol]=0;
			}
		}
		return false;
	}
	
	public static boolean canKnightMove(int row,int col,int[][]visited) {
		if(row>=0 && row<visited.length && col>=0 && col<visited[0].length && visited[row][col]==0) {
			return true;
		}
		return false;
	}

}
