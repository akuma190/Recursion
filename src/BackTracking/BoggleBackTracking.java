package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class BoggleBackTracking {
	static int[] pathRow= {0,0,1,1,-1,1,-1,-1};
	static int[] pathCol= {1,-1,-1,1,1,0,0,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] words= {{'F','O','B'},{'O','A','E'},{'K','S','C'}};
		boolean[][] visited=new boolean[words.length][words[0].length];
		String word="";
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("FACE");
		arr.add("BOOK");
		arr.add("ACE");
		arr.add("BOOKS");
		arr.add("ACES");
        for(int i=0;i<words.length;i++) {
        	for(int j=0;j<words[i].length;j++) {
        		visited[i][j]=true;
        		findWord(words,visited,i,j,word+words[i][j],arr);
        		visited[i][j]=false;
        	}
        }
		//findWord(words,visited,0,0,word+words[0][0],arr);
	}
	
	public static void findWord(char[][] words,boolean[][] visited,int row,int col,String word,ArrayList<String> arr) {
		if(arr.contains(word)) {
			System.out.println(word);
		}
		if(word.length()==(words.length*words[0].length)) {
			return;
		}
		for(int i=0;i<pathRow.length;i++) {
			int rowNew=row+pathRow[i];
			int colNew=col+pathCol[i];
			if(isValid(rowNew,colNew,words,visited)) {
				visited[rowNew][colNew]=true;
				findWord(words,visited,rowNew,colNew,word+words[rowNew][colNew],arr);
				visited[rowNew][colNew]=false;
			}
			
		}
	}
	
	public static boolean isValid(int row,int col,char[][] words,boolean[][] visited) {
		if(row>=0 && row<words.length && col>=0 && col<words[0].length && !visited[row][col]) {
			return true;
		}
		return false;
	}

}
