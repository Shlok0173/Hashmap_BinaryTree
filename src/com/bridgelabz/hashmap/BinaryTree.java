package com.bridgelabz.hashmap;

public class BinaryTree {
int size=0;

public Node insert(Node root,int value) {
	if(root==null) {
		return createNewNode(value);
	}
	if(root.data>value) {
		root.left=insert(root.left,value);
	}else if(root.data<value) {
		root.right=insert(root.right,value);
	}
	return root;
	
}
public Node createNewNode(int data) {
	Node node=new Node(data);
	size=size+1;
	return node;
}
public void print(Node root) {
	if(root==null) {
		return;
	}
	print(root.left);
	System.out.println(root.data);
	print(root.right);
}
public int size() {
	return size;
}


}
