package com.solution;

public class BinaryTreeChecker {

	public static void main(String[] args) {
		BinaryTree main = new BinaryTree("main");
		
		BinaryTree left = new BinaryTree("left");
		BinaryTree left1 = new BinaryTree("left1");
		left.insertLeft(left1);
		BinaryTree right1 = new BinaryTree("right1");
		left.insertRight(right1);
		main.insertLeft(left);
		
		BinaryTree right = new BinaryTree("right");
		BinaryTree right2 = new BinaryTree("right2");
		right.insertRight(right2);
		main.insertRight(right);
		
		showBalance(main, 0);
	}

	public static class BinaryTree {
		private BinaryTree leftNode;
		private BinaryTree rightNode;
		private String name;
		
		public BinaryTree(String name) {
			this.name = name; 
		}
		
		public void insertLeft(BinaryTree left) {
			this.leftNode = left;
		}
		
		public void insertRight(BinaryTree right) {
			this.rightNode = right;
		}
		
		public String toString() {
			return this.name;
		}
	}
	
	public static void showBalance(BinaryTree node, int index) {
		System.out.println("Processing node: " + node);
		if (node == null) {
			return;
		}
		
		BinaryTree leftNode = node.leftNode;
		BinaryTree rigthNode = node.rightNode;
		if (leftNode == null && rigthNode != null) {
			System.out.println("Left at level " + index + " is null");
		}
		
		
		if (rigthNode == null && leftNode != null) {
			System.out.println(", Right at level " + index + " is null");
		}
		index++;
		showBalance(leftNode, index);
		showBalance(rigthNode, index);
	}
}
