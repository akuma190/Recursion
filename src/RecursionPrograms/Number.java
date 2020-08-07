package RecursionPrograms;

//printing the number in a given order.
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(0,8);
	}
	
	public static int printNumber(int i,int n) {
		int a=0;
		if(i==n) {
			System.out.println(i);
			return n;
		}else {
			System.out.println(i);
			a= printNumber(i+1,n);
			System.out.println("i"+i);
		}
		return a;
	}

}
