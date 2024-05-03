package Practice;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		int num = 123;
	
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
				
	}
	
	public static void print1() {
		
		int num2 = num;
		System.out.println("hello");
		
	}
	
	public void print2() { 
		int num3 = num;
		System.out.println("java");
	}

}
