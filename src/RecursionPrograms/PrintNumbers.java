package RecursionPrograms;

public class PrintNumbers {
	public static void main(String[] args) {
		int number=10;
		int number1=1;
		printDown(number);
		
	}
	
	public static void printDown(int number) {
		if(number==0) {
			return;
		}else {
			System.out.println(number);
			printDown(number-1);
			System.out.println(number);
		}
	}
	
	

}
