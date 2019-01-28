package com.brackets;

import java.util.Stack;

public class BracketChecker {

	public static void main(String... args) {
		String brackets = args[0];
		boolean validBrackets = isBracketValid(brackets);
		System.out.println("out: " + validBrackets);

	}

	private static boolean isBracketValid(String brackets) {
		boolean result = false;
		if (brackets == null || brackets.length() % 2 != 0)
			return false;
		
		Stack<Character> stack = new Stack<>();
		char c = 0;
		for(int i = 0; i < brackets.length(); i++) {
			if (! stack.empty()) {
				c = stack.peek();
			}
			char next = brackets.charAt(i);
			stack.push(next);
			 
			if (i >= 1 && ((c == '{' && next == '}') || (c == '[' && next == ']')) || (c == '(' && next == ')')) {
				stack.pop();
				stack.pop();
			}
		}
		
		result = stack.empty();
		
		return result;
	}
}
