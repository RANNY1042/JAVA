package Study_20240224;

public class HRSTest2 {
	
	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			Salesman s = (Salesman) e;
			s.annual_sales = 6500000;
			System.out.println("Salesman 입니다" + s.annual_sales);
 		} else if(e instanceof Manager) {
 			Manager m = (Manager) e;
 			m.num_team = 5;
 			System.out.println("Manager 입니다." + m.num_team);
 		}
	}
	public class HRSTest { 
		
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c  = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();
		

	}

}