package com.ruby.jaba.ch05객체지향;

public class Test_method {

	public static void main(String[] args) {
	
	System.out.println("1");
	System.out.println("2");
	
	
	String num = takeoff(6,7); // takeoff라는 메소드가 리턴하는 값을 num에 저장
	System.out.println(num);

// system.out.println(takeoff()); 	
	
	System.out.println("3");
	System.out.println("4");
	}

// int, String, long, boolean, char
	static String takeoff(int num1, int num2) { //name이라는 int변수에서 받는다
		System.out.println("takeoff1");
		System.out.println("takeoff2");
		System.out.println("takeoff3");
		
		return num1 + "===>" +num2;
	}

}


