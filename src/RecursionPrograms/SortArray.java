package RecursionPrograms;

public class SortArray {
	public static void main(String[] args) {
		int[] arr= {2,4,5,6,4,3,8};
		sortTheArray(arr,arr.length-1);
		
	}
	
	public static void  sortTheArray(int[] arr,int n) {
		if(n==0) {
			return ;
		}else {
			sortTheArray(arr,n-1);
			for(int i=0;i<n-1;i++) {
				
			}
			
		}
	}

}
