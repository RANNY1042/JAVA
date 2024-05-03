package com.ruby.java.ch02;

import java.util.Scanner;

public class Test31_2 {

	public static void main(String[] args) {
		
		//숫자 하나 입력 받자
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*int num = 109;*/
		
		//소수 : 1과 자기자신을 제외하고 나누어지지 않는 수
		
		//2부터 자기자신보다 하나 작은 수까지 나누어서 나누어지지 않으면 소수
	
		//num : 10 ==> 2~9 나누어지지 않는 수 
		
	/*	boolean flag = false ;
		for(int i = 2; i<num ; i++) {
			if (num % i == 0)
				flag = true; {
			break;  
		}
	}
		System.out.println(flag? "소수가 아닙니다." : "소수 입니다."); */
		
		int i = 2;
		for (i=2; i <num; i++) {
			if(num % i == 0) break;
					}
		System.out.println((i<num)? "소수가 아닙니다." : "소수입니다.");
		sc.close();
	}

}
