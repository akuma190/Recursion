package RecursionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayFullRecusrsionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {2,3,7,6,4,5,9};
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<array.length;i++) {
        	arr.add(array[i]);
        }
//        sortList(arr,1);
        sortArrayList(arr);
       // System.out.println(arr);
	}
	
	public static void sortArrayList(List<Integer> arr) {
		if(arr.size()==1) {
			return;
		}else {
			int value=arr.remove(arr.size()-1);
			sortArrayList(arr);
			//System.out.println(arr);
			//System.out.println(value);
			sortList(arr,value);
			System.out.println(arr);
		}
	}
	
	public static void sortList(List<Integer> arr,int element) {
		if(arr.size()==0 || arr.get(arr.size()-1)>=element) {
			arr.add(element);
		}else {
			int data=arr.remove(arr.size()-1);
			sortList(arr,element);
			arr.add(data);
		}
	}

}
