package Practice.com.ruby.java.ch07.inheritance;

	
	public class Student extends Person {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
		System.out.println("Student(name, age, dept) 생성자 실행!");
	}
	

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}


	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}


	public String toString() {
		return super.toString()+":"+major;
	}

}
