package com.ruby.java.ch02;

import java.util.Scanner;

public class Test31_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 1;
		for (i= 1; 10*(i-1)< num & num< 10*(i+1); i++) {
			if(num % i == 0) break;
					}
		System.out.println((i<num)? "소수가 아닙니다." : "소수입니다.");
		sc.close();
	}

}

	}

}
