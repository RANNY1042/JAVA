package Study_20240304;

import java.util.Scanner;

public class factorial {
			
	public static int factorial(int number) {
		if (number<=1)
			return number ;
		else 
			return factorial(number-1)*number;
	}
		
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		System.out.println(number+"!"+"="+factorial(number));
	
	}

}
