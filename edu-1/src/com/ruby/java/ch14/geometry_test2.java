package com.ruby.java.ch14;

public class geometry_test2 {

	abstract class Geometry {
		public abstract double calcArea();
	}

	class circle extends Geometry {
		int radius;
		double PI = 3.14;

		public double calcArea() {
		 double circleArea = PI * radius * radius;
		 return circleArea;
		}
	}

	class Rectangle extends Geometry {
		int width;
		int height;
		public double calcArea() {
		 double RectangelArea = width * height;
		 return RectangelArea;
		}
	}

	class Triangle extends Geometry {
		int width;
		int height;
		public double calcArea() {
		double TriangleArea = width * height *0.5;
		return TriangleArea;
		}
	}

	public static void main(String[] args) {
		
	Function<Geometry, Double> func = (g)-> {
		return g.calcArea();		  
	};
		System.out.println("원 면적:"+func(new Circle(5));
		System.out.println("사각형 면적:"+func(new Rectangle(5,10)));

		}

	}

