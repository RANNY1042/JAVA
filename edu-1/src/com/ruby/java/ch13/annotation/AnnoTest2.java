package com.ruby.java.ch13.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


	@SuppressWarnings("unused")
	@Retention(RetentionPolicy.RUNTIME)
	@interface Check{
		String name();
		int val();
		}
	
	public class AnnoTest2{
		
		@Check(name="first", val=123)
		public static void test() {
			AnnoTest2 obj = new AnnoTest2();
			try { 
				Class<?> c = obj.getClass();
				Method m = c.getMethod("test");
				
				Check check = m.getAnnotation(Check.class);
				System.out.println(check.name()+":"+check.val());
		}	catch(Exception e) {
			e.printStackTrace();
		}
					
	}

	public static void main(String[] args) {
		test();
	}
		

	}
