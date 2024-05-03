package Study_20240226;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
	public abstract void calcBonus();
}

 class Salesman extends Employee{
	 int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}


	public void calcBonus() { 
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
		}
	}

 class Consultant extends Employee {
	 int num_project;
	 public void calcSalary() {
		 System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	 }
 
 	public void calcBonus() { 
 		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
 	}
 }
 
 abstract class Manager extends Employee{
	 int num_team;
	 public void calcSalary() {
		 System.out.println("Manager 급여 = 기본급+팀 성과 수당");
	 }
 }
 
class Director extends Manager{

	@Override
	public void calcSalary() { 
		super.calcSalary();
	}

	@Override
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급*12*6");
		// TODO Auto-generated method stub
		
	}
//	public void calcBonus() { 
//		System.out.println("Director 보너스 = 기본급*12*6");
//	}
}
public class HRSTest {
	public static void calcTax(Employee e ) {
		System.out.println("소득세를 계산합니다.");
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
				
		calcTax(s);
		calcTax(c);
		calcTax(d);

	}

}
