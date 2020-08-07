package RecursionPrograms;

import java.util.Arrays;


public class SortingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {5,4,1,2,6};
		int [] result=new int[array.length];
		sortArray(array,result,array.length-1);
		System.out.println(Arrays.toString(result));
		//int [] array= {2,3,7,6,4,5,9};

	}

	//sorting using the recursion and backtracking.
	public static int sortArray(int[] array,int[] result,int size) {
		if(size==0) {
			result[0]=array[0];
			return array[0];
		}else {
			int number=sortArray(array,result,size-1);
			result[size]=array[size];
			//System.out.println(size);
			sortInteArray(size,result);
			return number;
		}
	}
	public static void  sortInteArray(int index,int[] result) {
		//System.out.println(Arrays.toString(result));
		int datum=0;
		for(int i=index;i>=1;i--) {
			//System.out.println("hi");
			if(result[i]<result[i-1]) {
				datum=result[i-1];
				result[i-1]=result[i];
				result[i]=datum;
			}else {
				break;
			}
		}
	}

}
