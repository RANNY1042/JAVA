package edu;



public class Test2 {


		int[][] mA = {   ///3*4
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		int[][] mB = {  ///4*3
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		
		} ;
		
		int mR[][]  = new int[3][3]; //행렬 곱셈
			// mR[i][j]=mA[i][K]*mB[K][j] + mB[j][K]*mA[i][K]
		
//*public int [][] mR(int[][]mA, int[][]mB) {
	//*int[][] matrix = new int[int[][]mA.length][int[][]mB.length];*/	
			
	
										
		public static void main(String[] args) {
			Test2 x = new Test2();
			
			for(int i=0; i<x.mA.length; i++) {
				
				for(int j=0; j<x.mB[0].length; j++) {
				
					for(int k=0; k<x.mA[0].length; k++)
						x.mR[i][j]+= x.mA[i][k]*x.mB[k][j] ;
				}
			}
			
					
			System.out.println("곱셈 결과값 :");
			 for(int i=0; i<x.mR.length; i++) {
				 for(int j=0; j<x.mR[0].length; j++) {
					 
					 System.out.print(x.mR[i][j]+" ");
					 
					 
					 
					 if((j+1)%x.mR[i].length==0)
						 System.out.println();
				 }
			 }
			 
		}
		
}
			

			
						
