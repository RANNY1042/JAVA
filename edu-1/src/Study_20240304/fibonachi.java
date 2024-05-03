package Study_20240304;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class fibonachi {
		
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] fibonacciArray = new int[n];
		fibonacciArray[0] = 0;
		fibonacciArray[1] = 1;
	
	
		if (n>=2) {
			for (int i=2; i<n; i++) {
				fibonacciArray[i] = fibonacciArray[i-1]+fibonacciArray[i-2];
			}
			System.out.println(Arrays.toString(fibonacciArray)+" ");
		}
				

	}

}
