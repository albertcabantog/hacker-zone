package com.brackets;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Dummy {
	public static void main(String... s) {
//		test1();
//		test2();
		test3();
	}
	
	public static void test0() {

		List<Integer> i = new ArrayList<Integer>();
		int[] ex = new int[]{3, 4, 5, 6, 7, 8, 9};
		for (int a = 3; a <= 9 ; a++) {
			if (a % 2 <= 1) {
				i.add(a);
			}
		}
		
		ex = new int[i.size()];
		int ctr = 0;
		for(Integer c : i) {
			ex[ctr] = c;
			ctr++;
		}
		
	
	}
	public static void test1() {
		String A = "hello";
		String B = "banana";
		
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) >= 1 ? "YES" : "NO");
		System.out.println(A.substring(0, 1).toUpperCase().concat(A.substring(1).toLowerCase()).concat(" ").concat(B.substring(0, 1).toUpperCase().concat(B.substring(1).toLowerCase())));
	}
	
	public static void test2() {
		BigDecimal b1 = new BigDecimal("0.1");
		BigDecimal b2 = new BigDecimal("-100");
		BigDecimal b3 = new BigDecimal("000.000");
		
		ArrayList<BigDecimal> list = new ArrayList<>();
		list.add(b3);
		list.add(b1);
		list.add(b2);
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}
	
	public static void test3() {
		String[] s = new String[]{"-100", "000.000", ".1", "0.1"};
		
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				BigDecimal b1 = new BigDecimal(arg0);
				BigDecimal b2 = new BigDecimal(arg1);
				
				return b2.compareTo(b1);
			}

		});
		
		for (String string : s) {
			System.out.println(string);
		}
		
		BigInteger bb = new BigInteger("1");
		bb.isProbablePrime(1);
	}
}
