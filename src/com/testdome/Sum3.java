package com.testdome;

import java.util.ArrayList;
import java.util.List;

public class Sum3 {
	
	List<Integer> numList = new ArrayList<Integer>();
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    public void addLast(int[] list) {
    	doAdd(list, 0);
    }
    
    private void doAdd(int[] list, int index) {
    	if (index < list.length) {
    		numList.add(list[index]);
    		doAdd(list, ++index);
    	}
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given sum.
     */
    public boolean containsSum3(int sum) {
//    	IntStream.of(this.numList.toArray(new Integer[this.numList.size()]));
    	
//    	boolean result = false;
//    	for (int i = 0; i < this.numList.size(); i++) {
//    		result = checkSum(sum, 0, 0, i) || checkSum(sum, 0, 0, i+1);
//    		if (result) break;
//    	}
    	boolean result = checkSum(sum, 0);
        return result;
    }
    
    private boolean checkSum(int sum, int total, int counter, int index) {
    	if (total == sum) {
    		return true;
    	}
    	if (counter == 3 || index >= this.numList.size()) {
    		return total == sum;
    	}
    	int temp = this.numList.get(index);
    	total += temp;
    	if (total == sum) {
    		return true;
    	}
    	return checkSum(sum, total, ++counter, ++index);
    }
    
    private boolean checkSum(int sum, int index) {
    	if (index + 2 > this.numList.size()) {
    		return false;
    	}
    	int total = this.numList.get(index) + this.numList.get(index + 1) + this.numList.get(index + 2);
    	if (total == sum) {
    		return true;
    	}
    	return checkSum(sum, ++index);
    }

    public static void main(String[] args) {
        Sum3 s = new Sum3();
        long start = System.currentTimeMillis();
        int[] list = new int[100];
        for (int i = 1; i < 100; i++)
        	list[i] = i;
        s.addLast(list);

        System.out.println(s.containsSum3(294));
        System.out.println(s.containsSum3(9));

        s.addLast(new int[] { 4 });

        System.out.println(s.containsSum3(9));
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end-start));
    }
}
