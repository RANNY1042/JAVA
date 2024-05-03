package com.ruby.java.ch08.Innerclass;

public class OuterClassTest {

	//*
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
		//outer.InstanceClass inner02 = outer.new InstanceClass();
		inner01.a = 123;
		inner01.method2();
		OuterClass.StaticClass inner03 = new OuterClass.StaticClass()
		OuterClass.StaticClass.c =789;
		OuterClass.StaticClass.method4();

	}

}
*//
	
	