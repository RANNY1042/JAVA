package com.ruby.java.ch04배열;

public class Test37_2 {

	public static void main(String[] args) {
	
	int [] score = new int[20] ;
	
	
	for (int i = 0; i <score.length; i++) {
		if (i%4 ==0)
			System.out.println("\n");
		if (score[i]<10)
			System.out.println(" ");
		System.out.println(score[i]+" ");
	}
		
		
		
	}

}
