package com.testdome;

class Node {
	public int value;
	public Node left, right;

	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

public class BinarySearchTree {
	public static boolean contains(Node root, int value) {
		if (root.value == value) {
			return true;
		}
		
		boolean left = check(root.left, value);
		if (left) {
			return left;
		}
		
		boolean right = check(root.right, value);
		if (right) {
			return right;
		}
		
		return false;
	}
	
	public static boolean check(Node root, int value) {
		if (root == null) {
			return false;
		}
		if (root.value == value) {
			return true;
		}
		
		if (root.left != null) {
			return check(root.left, value);
		}
		
		if (root.right != null) {
			return check(root.right, value);
		}
		
		return false;
	}
	
	public static boolean find(Node root, int value) {
		Node current = root;
		while (current != null) {
			if (current.value == value) {
				return true;
			} 
			current = current.left != null ? current.left : current.right;
		}
		return false;
	}

	public static void main(String[] args) {
		Node n9 = new Node(9, null, null);
		Node n8 = new Node(8, null, null);
		Node n7 = new Node(7, n9, n8);
		Node n1 = new Node(1, null, n7);
		Node n3 = new Node(3, null, null);
		Node n2 = new Node(2, n1, n3);

		System.out.println(contains(n2, 10));
		
		System.out.println(find(n2, 3));
	}
}