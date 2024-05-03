package com.ruby.java.ch13.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


	@Retention(RetentionPolicy.RUNTIME)
	@interface Mapping{
		String mode();
		int value();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@interface Comment{
		String msg();
	}
	
	@Mapping(mode="class", value=100)
	@Comment(msg="Annotation2 클래스")
	public class AnnoTest {
		
		@Mapping(mode = "method", value =200)
		@Comment(msg= "test() 메서드")
		public static void test() {
			AnnoTest obj = new AnnoTest();
			try {
				Class<?> c = obj.getClass(); //메타정보를 담는 클래스, 현재 선언된 정보를 전부 가져온다
				Annotation annoList[] = c.getAnnotations();
				System.out.println("클래스의 annotation 목록");
				for(Annotation item : annoList)
					System.out.println(item);
				
			Method m = c.getMethod("test");
			annoList = m.getAnnotations();
			System.out.println();
			System.out.println("test()메서드의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
		
			
	
	public static void main(String[] args) {
		test();
	}
		

	}
