package com.ruby.java.ch04배열;

import java.util.Random;

public class Test38_2 {

	public static void main(String[] args) {
		int arr[][] = new int [5][5];
		Random rand = new Random();
		for (int i=0; i < arr.length; i++)
			for(int j =0; j< arr[0].length; j++)
			arr[i][j] = rand.nextInt(500);
		for (int i=0; i < arr.length; i++)
			for(int j =0; j< arr[0].length; j++)
			if (i==j)
			
				System.out.println(arr[i][j]);
			
			else
				System.out.print("\t");
			
			System.out.println();
			

}
}

