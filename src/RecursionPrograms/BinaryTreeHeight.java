package RecursionPrograms;
//to find the height of a binary search tree.
public class BinaryTreeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store the height of left in left variable and right in right variable.
		Node root=new Node();
		root=null;
		root=createNode(8,root);
		root=createNode(3,root);
		root=createNode(6,root);
		root=createNode(10,root);
		root=createNode(4,root);
		root=createNode(7,root);
		root=createNode(1,root);
		root=createNode(14,root);
		root=createNode(13,root);
		inOrderPrinting(root);
		System.out.println("height is ="+findHeight(root));

	}
	
	public static int findHeight(Node node) {
		if(node==null) {
			return 0;
		}else {
			int left=findHeight(node.left)+1;
			int right=findHeight(node.right)+1;
			int max=Math.max(left, right);
			return max;
			//return 1+Math.max(left,right);
		}
	}
	public static void inOrderPrinting(Node node) {
		if(node==null) {
			return;
		}else {
			inOrderPrinting(node.left);
			System.out.print(node.data+",");
			inOrderPrinting(node.right);
		}
	}
	
	public static Node createNode(int data,Node node) {
		if(node==null) {
			return createNewNode(data);
		}else {
			if(data<node.data) {
				node.left=createNode(data,node.left);
			}else {
				node.right=createNode(data,node.right);
			}
		}
		
		return node;
	}
	
	public static Node createNewNode(int value) {
		Node temp=new Node();
		temp.data=value;
		temp.left=null;
		temp.right=null;
		return temp;
	}

}

class Node{
	int data;
	Node left;
	Node right;
	
	
}