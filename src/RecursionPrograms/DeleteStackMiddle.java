package RecursionPrograms;

import java.util.Stack;
//this is to delete the middle element in the stack

public class DeleteStackMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		//st.push(5);
		deleteMiddle(st,st.size());
		System.out.println(st);
	}
	
	public static void deleteMiddle(Stack<Integer> sta,int size) {
		if(size==(sta.size()/2)) {
			sta.remove(size);
			return;
		}else {
			deleteMiddle(sta,size-1);
		}
	}

}
