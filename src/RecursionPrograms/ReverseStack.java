package RecursionPrograms;

import java.util.Stack;
//this is the code to reverse a stack.
public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st); 
		reverseStack(st);
		System.out.println(st);
	}
	public static void reverseStack(Stack<Integer> st) {
		if(st.size()==1) {
			return;
		}else {
			 int data=st.pop();
			 reverseStack(st);
			 helperReverse(st,data);
		}
	}
	
	public static void helperReverse(Stack<Integer> st,int element) {
		if(st.size()==0) {
			st.add(element);
		}else {
			int value=st.pop();
			helperReverse(st,element);
			st.push(value);
		}
		
	}

}
