package ruby.java.ch08.polymorphism;

public class HRSTest_0216 {

	public static void calcTax(Employee e) {
		if (e instanceof Salesman)
			System.out.println("Salesman"+e.annual_sales);
		else if (e instanceof Manager)
			System.out.println("Manager");
		else if (e instanceof Employee)
			System.out.println("Employee");
	}
	
		public static void main(String[] args) {
		Salesman s= new Salesman();
		Employee e= new Salesman();
		Object d = new Salesman();
		Object s3 = new Salesman();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		Object arr[] = new Object[6];
		//
		
		HTSTest.clacTax(s);
		calcTax(e);
		calcTax
		
				
				

	}

}
