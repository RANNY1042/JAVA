package com.ruby.java.ch14;

import java.util.Scanner;

public class PrimeNumber2_0229 {
	
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int userInputNumber = num.nextInt();
			
		int s = (int)Math.pow(10.0, (double)(userInputNumber-1));
		int e = (int)Math.pow(10.0, (double)(userInputNumber))-1;
		// ints<=i<=int e 중에서 소수인 숫자를 찾아서 출력한다.

			for(int i=s; i<e; i++) {	
				for(int j =2; j<i; j++) {
					if(i % j != 0) {
						System.out.println(i+"은 소수가 입니다.");
					break;}
				else 	break;
				
			
			
				}
			
			num.close();
			
			
			}
				
				
	}


}
