package com.ruby.java07.inheritance;

public class LMSTest_1 {
	
	public class Professor extends Person{
		private String subject;
		
	

	public static void main(String[] args) {
		Professor p = new Professor();
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
		
		System.out.println(p.toString());
	

	}

}