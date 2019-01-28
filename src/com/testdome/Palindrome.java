package com.testdome;

public class Palindrome {
	public static boolean isPalindrome(String word) {
		word = word.toUpperCase();
		for (int i = word.length(); i > 0; i--) {
			if (word.charAt(i - 1) != word.charAt(word.length() - (i))) {
				return false;
			}
		}

		return true;

	}
	
	public static void main (String[] args) {
		System.out.println("nAsaBayaBasan: " + Palindrome.isPalindrome("nAsaBayaBasan"));
		System.out.println("radar: " + Palindrome.isPalindrome("radar"));
		System.out.println("develed: " + Palindrome.isPalindrome("develed"));
	}
}