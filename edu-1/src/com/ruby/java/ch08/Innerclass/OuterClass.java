package com.ruby.java.ch08.Innerclass;

public class OuterClass {
	
	static class StaticClass{
		int b;
		static int c;
		void method3() {
			System.out.println("Static Class:" +b);
		}
		
		static void method4() {
			System.out.println("Static Class:" +c);
		}
		
	}
}
	