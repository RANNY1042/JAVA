package com.ruby.java.ch02;


import java.util.Scanner;	
	
	

public class Test25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Num:");
		int num = sc.nextInt();
		
		int sum1 = 0 ;
		int sum2 = 0 ;
		for(int i = 0; i<10 ; i++) {
			
			
			if (i % 2 == 0) {
				sum2 += i;
				System.out.println("->"+sum2);
			}			
			else {
				sum1 += i;
				System.out.println("->"+sum1);
			}
					
			}
			System.out.println("OK:"+ sum1 + "," + sum2);

	}

}
