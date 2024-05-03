package Practice.com.ruby.java.ch07.inheritance;


	public class Employee extends Person{
	private String dept;

		public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");
	}

	
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}


	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return super.toString()+":"+dept;
	}
	
}
	
