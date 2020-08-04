package RecursionPrograms;

import java.util.Arrays;

public class SameElementsMatrix {
	//static boolean[][] test=new boolean[3][5];
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
        };
        System.out.println(findMax(0,arr, 1, 2));
        for(int[] ar:arr) {
        	System.out.println(Arrays.toString(ar));
        }
        

    }

    public static int findMax(int find,int[][] arr, int row, int column) {
        //System.out.println(arr[row][column]);
        if (row < 0 || row >= arr.length || column < 0 || column >= arr[0].length 
        || arr[row][column]!=find) {
            //System.out.println("hi");
            return -1;
        }
        else{
        	arr[row][column] = -1;
            int left=findMax(find,arr,row,column-1)+1;
            int right=findMax(find,arr,row,column+1)+1;
            int top=findMax(find,arr,row-1,column)+1;
            int bottom=findMax(find,arr,row+1,column)+1;
            int sum=left+right+top+bottom;
            return sum;
        }


    }
}