package com.testdome;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {
	public static boolean isPalindrome(String word) {
		word = word.toUpperCase();
		for (int i = word.length(); i > 0; i--) {
			if (word.charAt(i - 1) != word.charAt(word.length() - i)) {
				return false;
			}
		}

		return true;

	}
	
	public static boolean isPalindrome2(String word) {
		word = word.toUpperCase();
		StringBuilder sb = new StringBuilder(word);
		if (sb.reverse().toString().equals(word)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isPalindrome3(String word) {
		word = word.toUpperCase();
		List<String> collect = word.lines().collect(Collectors.toList());
		Collections.reverse(collect);
		String collect1 = collect.stream().collect(Collectors.joining());
		if (word.equals(collect1)) {
			return true;
		}
		
		return false;
	}
	
	public static void main (String[] args) {
		System.out.println("nAsaBayaBasan: " + Palindrome.isPalindrome("nAsaBayaBasan"));
		System.out.println("radar: " + Palindrome.isPalindrome("radar"));
		System.out.println("develed: " + Palindrome.isPalindrome("develed"));
		
		System.out.println("nAsaBayaBasan: " + Palindrome.isPalindrome2("nAsaBayaBasan"));
		System.out.println("radar: " + Palindrome.isPalindrome2("radar"));
		System.out.println("develed: " + Palindrome.isPalindrome2("develed"));
		
		System.out.println("nAsaBayaBasan: " + Palindrome.isPalindrome3("nAsaBayaBasan"));
		System.out.println("radar: " + Palindrome.isPalindrome3("radar"));
		System.out.println("develed: " + Palindrome.isPalindrome3("develed"));
	}
}