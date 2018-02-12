package twoFileCoding;

public class BstTest {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insertBST('4');
//		bst.insertBST('9');
		bst.insertBST('5');
		bst.insertBST('8');
		bst.insertBST('2');
		bst.insertBST('0');
		bst.insertBST('7');
		bst.insertBST('1');
		bst.insertBST('6');
		bst.insertBST('3');
		
		System.out.println("Binary Tree>>>");
		bst.printBST();
		
		System.out.println("Is There \"1\" ?>>>");
		TreeNode p1 = bst.searchBST('1');
		if(p1 != null) {
			System.out.println(p1.data + "탐색 성공");
		}else {
			System.out.println("탐색 실패");
		}
		
		System.out.println("Is There \"9\" ?>>>");
		TreeNode p2 = bst.searchBST('9');
		if(p2 != null) {
			System.out.println(p2.data + "탐색 성공");
		}else {
			System.out.println("탐색 실패");
		}
	}

}
