package com.bridgelabz.hashmap;

public class MainBST {

	public static void main(String args[]) {
		System.out.println("Welcome To Bonary Search Tree Program");
		BinaryTree bst=new BinaryTree();
		Node root=null;
		root=bst.insert(root, 123);
		root=bst.insert(root, 12);
		root=bst.insert(root, 134);
		bst.print(root);
		System.out.println("leftNode");
		bst.print(root.left);
		
		System.out.println("RightNode");
		bst.print(root.right);
	}
}
