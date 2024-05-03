package com.ruby.test;

import java.util.random.*;

public class Test02 {
	
	//*행렬 덧셈, 곱셈 연산 메소드 정의
	//*1차 버전 : 덧셈후 바로 출력
	//*2차 버전 : 덧셈후 return 값으로 결과 행렬 */
		
//Test_행렬연산 t1 = new Test_행렬연산();	
/* int[][]B = new int[3][4]; //변수 선언 */
			
//addMatrix(B,C)
	static int [][] addMatrix(int[][]B,int[][]C){
	int m[][] = new int [B.length][B[0].length];
	int r = B.length;
	int c = B[0].length;
	for (int i = 0; i<r; i++)
		for(int j = 0; j<c; j++)
		 m[i][j] = B[i][j]+C[i][j];
	return m;
	}

//multiplyMatrix

	static int [][] multiplyMatrix(int [][]B,int[][]E){
	int k[][] = new int [B.length][E[0].length];
	int l = B.length;
	int n = E[0].length;
	for (int i = 0; i<l; i++)
		for(int j =0; j<n; j++)
		k[i][j] = B[i][j]*E[i][j] // 1차원 배열
		return k;
}
	
//transposeMatrix()	
	static int transposeMatrix(int[][]B) {
		int e[][]= new int[B.length][B[0].length];
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				B[j][i]=e[i][j];
			}
		}
		return B;
	}
		
	
//난수생성	
		static void getData(int[][]B) {	
		Random rnd= new Random();
			
		for(int i=0; i<B.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				B[i][j]=rnd.nextln(10)+1;
			}		
		}	
		
	public static void main(String[] args) {
		int[][]A = new int[3][4];
		int[][]B = new int[3][4];
		int[][]C = new int[3][4];
		int[][]D = new int[3][5];
		int[][]E = new int[4][5];
		int[][]F = new int[4][3];
	}
			
		/* 난수 생성으로 초기화
		 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
		 * F[4][3] = B[3][4]의 전치 행렬		 */
			
						
	static void showMatrix(int [][]X) {
		//2차원 모습으로 출력
		for(int i=0; i<X.length; i++) {
			for(int j=0; j<X[i].length; j++) {
				if(X[i][j]<10)
					System.out.print("0");
				System.out.print(X[i][j]+"   ");
				if((j+1)%X[i].length==0)
					System.out.println();
			}
		}	
	}				
	
	System.out.println("행렬 더하기: A[3][4] = B[3][4]");
	getData(B);getData(C);getData(E);
	B.getData();C.getData();E.getData();
	
	
		A = addMatrix(B,C);
		System.out.println("행렬B");
		showMatrix(B);
		System.out.println("행렬c");
		showMatrix(C);
		System.out.println("더하기 결과");
		showMatrix(A);
		
			
	
}

