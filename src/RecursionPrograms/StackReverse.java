package RecursionPrograms;

import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st);
		reverseStack(st);
		
	}
	public static void reverseStack(Stack<Integer> str) {
		if(str.isEmpty()) {
			return;
		}else {
			int a=str.pop();
			reverseStack(str);
			str.push(a);
			System.out.println(str);
		}
	}

}
