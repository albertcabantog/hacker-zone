package com.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Base7 {

	public static void main(String[] args) {
		int number = 7;
        ArrayList<Integer> result = new ArrayList<>();
        List base10 = Arrays.asList("0 1 2 3 4 5 6".split(" "));
        List base7 = Arrays.asList("0 a t l s i n".split(" "));
//        result.add("0");
//        result.add("a");
//        result.add("t");
//        result.add("l");
//        result.add("s");
//        result.add("i");
//        result.add("n");
 
        int remainder = 0;
        boolean finish = false;
 
        while (!finish) {
            if (number == 0) {
                finish = true;
            } else {
                remainder = number % 7;
                number = number / 7;
                result.add(remainder);
            }
//            remainder = 0;
        }
        for (int i = result.size()-1; i >=0 ; i--) {
            String a = (String) base7.get(result.get(i));
            System.out.print(a);
        }
        System.out.println();

	}

}
