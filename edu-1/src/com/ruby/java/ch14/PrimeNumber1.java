package com.ruby.java.ch14;

import java.util.Scanner;


public class PrimeNumber1 {
	
	public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	System.out.println("소수를 입력하세요.");
	int userInputNumber = num.nextInt();

	
			
		for(int i =2; i<userInputNumber; i++) {
			if(userInputNumber % i == 0) {
				System.out.println(userInputNumber+"은 소수가 아닙니다.");
			break;}
		else {System.out.println(userInputNumber+"는 소수가 입니다.");
			break;
			}
			
			}
		num.close();
		}
		
			
	}
	


