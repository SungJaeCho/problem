package twoFileCoding;

public class BinarySearchTree {
	private TreeNode root = new TreeNode();
	
	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode(x);
		
		if(p == null) {
			return newNode;
		}else if(p.data > newNode.data) {   //새로운 노드가 기존 데이터보다 작을경우 왼쪽으로 들어감
			p.left = insertKey(p.left, x);
			return p;
		}else if(p.data < newNode.data) {   //새로운 노드가 기존 데이터보다 클 경우오른쪽으로 들어감
			p.right = insertKey(p.right, x);
			return p;
		}else {
			return p;
		}
	}
	
	public void insertBST(char x) {
		root = insertKey(root, x);
	}
	
	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while(p != null) {
			if(x < p.data) {
				p = p.left;
			} else if(x > p.data) {
				p = p.right;
			} else {
				return p;
			}
		}
		return p;
	}
	
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + "");
			inorder(root.right);
		}
	}
	
	public void printBST() {
		inorder(root);
		System.out.println();
	}
	
}
