package com.ruby.java.ch02;

public class Test03 {

	public static void main(String[] args) {
		float excahngeRate = (float)1236.50; // type casting
		String st = "Good Day! How are you OK?";
		int num = 2147483647;
		long numSize = Integer.SIZE;
		System.out.println("numSize = " + numSize);
		long d = 2147483648L;//8 byte이면 충분한데
		// d 변수가 8바이트인지 확인하는 방법은?
		int dSize = Long.SIZE;
		System.out.println("dSize= "+ dSize);
	}
}

