package com.ruby.java.ch04배열;

public class Test35 {

	public static void main(String[] args) {
	String []st = {"apple", "banana", "peach", "pineapple"};
	int[] arr = {10,20,30,40,50};
	int j; int sum = 0;
	for (int i = 0; i < arr.length; i++)
		System.out.println(arr[i]);
		sum += i;
	}		
	
	
	
	for (String stx: st)
		System.out.println(stx);
	for(int num : arr) {
		System.out.println(num);
	}

	}

}
