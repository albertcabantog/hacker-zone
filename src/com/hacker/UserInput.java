package com.hacker;

public class UserInput {
	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('b');
		input.add(' ');
//		System.out.println(input.getValue());
	}
}

class TextInput {
	protected StringBuilder sb = new StringBuilder();
	
	public TextInput() {
//		System.out.println("Construct Text");
	}

	public void add(char c) {
		sb.append(c);
	}

	public String getValue() {
		System.out.println("getting");
		String val = sb.toString();
//		if (val.length() <= 0) 
//			return null;
		
		return val;
	}
}

class NumericInput extends TextInput {

	public NumericInput() {
//		System.out.println("Construct Numeric");
	}
	
	public void add(char c) {
//		System.out.println("adding");
		if (Character.isDigit(c)) {
			sb.append(c);
		}
	}
}