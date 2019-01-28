package com.testdome;

import java.util.HashSet;

public class HappyNumber {
	
	public static void main (String[] args){
		HappyNumber hn = new HappyNumber();
		for(int i = 1; i <= 30; i++) {
			System.out.println("no " + i + " is " + hn.isHappy(i));
		}
		
	}
	public boolean isHappy(int n) {
	    HashSet<Integer> set = new HashSet<Integer>();
	 
	    while(!set.contains(n)){
	        set.add(n);
	 
	        n = getSum(n);
	 
	        if(n==1)
	            return true;
	    }
	 
	    return false;
	}
	 
	public int getSum(int n){
	    int sum =0;
	    while(n>0){
	        sum+=(n%10)*(n%10);
	        n=n/10;
	    } 
	    return sum;    
	}
}
