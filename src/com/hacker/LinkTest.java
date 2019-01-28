package com.hacker;

public class LinkTest {

	public static class LinkedListNode {
		String val;
		LinkedListNode next;
		
		LinkedListNode(String node) {
			val = node;
			next = null;
		}
	}
	
	public static void main (String... args) {
		LinkedListNode list = new LinkedListNode("1");
		LinkedListNode subList = new LinkedListNode("1");
		int ctr = 0;
		String val = "";
		while (list.next != null) {
			val += list.val;			
		}
		
		String subVal = "";
		while (subList.next != null) {
			subVal += subList.val;
			
			if (val.equals(subVal))
				ctr++;
		}
		
		int result = val.indexOf(subVal);
		
		String a = "123";
		String b = "23";
		System.out.print(a.indexOf(b));
	}
}

