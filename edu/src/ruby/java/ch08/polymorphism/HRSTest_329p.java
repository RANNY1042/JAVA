package ruby.java.ch08.polymorphism;

public class HRSTest_329p {
	
public static void calcTax() {
	//인자로 전달된 인스턴스의 소득세 계산
}

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
	public abstract void calcBonus();
}

 class Salesman extends Employee{
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}


	public void calcBonus() { 
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
	}

 class Consultant extends Employee {
	 public void calcSalary() {
		 System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	 }
 
 	public void calcBonus() { 
 		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
 	}
 }
 
 abstract class Manager extends Employee{
	 public void calcBonus() {
		 System.out.println("Manager 급여 = 기본급+팀 성과 수당");
	 }
 }
 
 class Director extends Manager {
	 public void calcBonus() {
		 System.out.println("Director 보너스 = 기본급 * 12 * 6");
	 }
 }

public class HRSTest {
	public static void calcTax(Salesman s) {
		
	} //인자로 전달된 인스턴스의 소득세 계산
	
	public static void calcTax(Consultant c) {
	 //인자로 전달된 인스턴스의 소득세 계산	
	}
	
	public static void calcTax(Director d) {
		 //인자로 전달된 인스턴스의 소득세 계산	
		}
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		//Salesman 소득세 계산
		//Consultant 소득세 계산
		//Director 소득세 계산
		
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();

	}

}


	}

}
