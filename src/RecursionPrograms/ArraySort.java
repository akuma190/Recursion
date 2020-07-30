package RecursionPrograms;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int sortArray(int i,int[] arr) {
		if(i==arr.length-1) {
			return arr[arr.length-1];
		}else {
			int datum=sortArray(i+1,arr);
			
		}
	}

}
