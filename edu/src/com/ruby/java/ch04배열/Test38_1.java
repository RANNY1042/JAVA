package com.ruby.java.ch04배열;

public class Test38_1 {

	public static void main(String[] args) {
		int [][] arr = new int[3][4];
		arr[0][0]=1;
		arr[0][1]=2;
		/* arr.length; //행의 길이
		arr[0].length; //열의 길이 */
		
		System.out.println("행수:" + arr.length); // 행의 길이
		System.out.println("열의 수:"+ arr[0].length); //열의 길이
	}

}


