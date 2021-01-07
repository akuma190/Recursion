package RecursionPrograms;

public class Practice {
	public static void main(String[] args) {
		System.out.println(getFactorial(5));
	}
	
	public static int getFactorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n *getFactorial(n-1);
		}
	}
}
