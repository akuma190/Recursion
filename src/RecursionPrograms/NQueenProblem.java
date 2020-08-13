package RecursionPrograms;

import java.util.Arrays;

public class NQueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean[][] board={{false,false,false,false,false,false,false,false },
//                           {false,false,false,false,false,false,false,false },
//                           {false,false,false,false,false,false,false,false },
//                           {false,false,false,false,false,false,false,false },
//                           {false,false,false,false,false,false,false,false },
//                           {false,false,false,false,false,false,false,false },
//                           {false,false,false,false,false,false,false,false },
//                           {false,false,false,false,false,false,false,false } };
		boolean[][] board= {{false,false,false,false},
				            {false,false,false,false},
				            {false,false,false,false},
				            {false,false,false,false}
		                    };
		palceQueen(board,4,-1);

	}
	
	public static void  palceQueen(boolean[][] board,int size,int row) {
		if(row==size-1) {
			for(boolean[] bo:board) {
				System.out.println(Arrays.toString(bo));
			}
			System.out.println("------------------");
			//return true;
		}else {
			for(int i=0;i<board[0].length;i++) {
				int newRow=row+1;
				if(checkValidQueen(board,newRow,i,size)) {
					board[newRow][i]=true;
					palceQueen(board,size,newRow);
						//return true;//this stops from multiple answers
					
					board[newRow][i]=false;
				}
			}
			//return false;
		}
	}
	
	public static boolean checkValidQueen(boolean[][] board,int row,int col,int size) {
		for(int i=0;i<size;i++) {
			if(board[i][col]) {
				return false;
			}
		}
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(board[i][j]) {
				return false;
			}
		}
		for(int i=row,j=col;i>=0 && j<size;i--,j++) {
			if(board[i][j]) {
				return false;
			}
		}
		return true;
	}

}
