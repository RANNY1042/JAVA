package Study_20240306;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n값:");
		int n = stdIn.nextInt();
		
		int sum = 0;  // 합
		
		for (int i = 1; i<=n; i++) //sum에 i 값을 더함
			sum += i;
		
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
	}

}
