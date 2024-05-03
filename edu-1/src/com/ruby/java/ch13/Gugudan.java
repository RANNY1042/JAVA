package com.ruby.java.ch13;

public class Gugudan {

	public void print(int i) {
		System.out.println(i + "단");
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
	}

	public void printHorizontal() {
		for(int j=1; j<10; j++) {
			for(int i=2; i<10; i++) {
			if( (i*j)<10)
				System.out.print(i+"*"+j+"="+"0"+i*j+"\t");
			else System.out.print(i+"*"+j+"="+i*j+"\t");
			}	System.out.print("\n");
		}

	}
}
