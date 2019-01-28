/**
 * 
 */
package com.hacker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * @author Albert
 * 
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num = "1";
		String result = lookandsay(num, 2);
		System.out.println(result);
	}

	public static String lookandsay(String start, int n) {
		StringBuilder sb = new StringBuilder();
		char looper;
		int ctr;
		
		for (int i = 0; i < n; i++) {
			looper = start.charAt(0);
			start = start.substring(1) + " ";
			ctr = 1;
			
			for (char c : start.toCharArray()) {
				if (c != looper) {
					sb.append(ctr + "" + looper);
					ctr = 1;
					looper = c;
				} else {
					ctr += 1;
				}
			}
			if ((i+1) < n ) {
				start = sb.toString();
				sb = new StringBuilder();
			}			
		}
		
		
		return sb.toString();
	}

}
