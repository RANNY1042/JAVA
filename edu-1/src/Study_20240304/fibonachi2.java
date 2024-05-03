package Study_20240304;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class fibonachi2 {

	private static int[] memo = new int[100];

	public static void main(String[] args) {

		fibo(99);

		for (int n : memo) {
			System.out.println(n + " ");
		}

	}

	private static int fibo(int k) {
		if (memo[k] != 0) {

		} else {

			if (k <= 2) {
				memo[k] = 1;
			} else {
				memo[k] = fibo(k - 1) + fibo(k - 2);
			}

		}
		return memo[k];
	}

}