package com.ruby.java.ch14;

import java.util.function.Function;

//최상위 추상클래스 geometry생성 => 추상메서드로 getArea

	abstract class Geometry {
		public abstract double getArea();
	}

//자식 클래들 생성 => Circle, Rectangle, Triangle 
	class Circle extends Geometry {
		int radius;
		double PI = 3.14;

		public Circle(int radius) {
			this.radius = radius;
		}
	}

	class Rectangle extends Geometry {
		int width;
		int height;

		public Rectangle(int h, int w) {
			this.height = h;
			this.width = w;
		}

			public double getArea() {
				return (double) (height * width);
		}
	
		class Triangle extends Geometry {
			int width;
			int height;

		public Triangle (int width, int height) {
		this.width;
		this.height;
		}

			public double getArea() {
				return (double) (width * height * 0.5);
			}
		}
		
	public class geometry_test {

	public static void main(String[] args) {
		//funtion 람다생성
		Function<Geometry, Double> func = (g)-> {
			return g.getArea();
		};
		
		//출력
		System.out.println("원 면적:"+func(new Circle(5));
		System.out.println("사각형 면적:"+func(new Rectangle(5,10)));

	}

}
