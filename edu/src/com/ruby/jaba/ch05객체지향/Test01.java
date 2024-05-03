package com.ruby.jaba.ch05객체지향;

public class Test01 {
	
	//확장형 for루프
	
		static void test(int... v) {
			System.out.print(v.length+":");
			for(int x:v)
				System.out.print(x+"");
			System.out.println();
		}

	public static void main(String[] args) {
		test(1);
		test(1,2);
		test(1,2,3);
	
		
	}

}
