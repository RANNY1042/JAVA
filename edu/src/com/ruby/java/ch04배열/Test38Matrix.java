package com.ruby.java.ch04배열;

import java.util.Random;

public class Test38Matrix {

	public static void main(String[] args) {
		
		Random rand = new Random(); {
				
		int A[][] = new int [3][4]; // 난수 입력
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j <A[i].length; j++) {
				A[i][j]=rand.nextInt(500);
			}
		}	
		
		int B[][] = new int [4][5]; // 난수 입력
		
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[i].length; j++) {
				B[i][j]=rand.nextInt(500);
			}
		}				
				
		int D[][] = new int [3][4]; // 난수 입력
		for(int i=0; i<D.length; i++) {
			for(int j=0; j<D[i].length; j++) {
				B[i][j]=rand.nextInt(500);
			}
		}				
		
		int E[][] = new int [3][4]; //행렬 더하기
			E[i][j]=A[i][j]+D[i][j];
			
			return E;
		
		int C[][] = new int[3][5]; // 행렬 곱하기
		int F[][] = new int [4][3]; //A의 전치행렬
		
		//C = A * B; //행렬 곱하기
		//E = A + D; //행렬 더하기
		//F = A의 전치 행렬
	}

}
}