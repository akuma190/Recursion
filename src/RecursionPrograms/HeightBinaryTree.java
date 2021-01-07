package RecursionPrograms;

public class HeightBinaryTree {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right= new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left=new Node(6);
		BinarySearchTree bst=new BinarySearchTree();
		//bst.inOrderTraversal(root);
		System.out.println(bst.findHeight(root));

	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinarySearchTree {

	public void inOrderTraversal(Node node) {
		if (node == null) {
			return;
		} else {
			inOrderTraversal(node.left);
			System.out.println(node.data);
			inOrderTraversal(node.right);
		}
	}
	
	public int findHeight(Node node) {
		if(node==null) {
			return 0;
		}else {
			int left=1+findHeight(node.left);
			int right=1+findHeight(node.right);
			return Math.max(left, right);
		}
	}

}