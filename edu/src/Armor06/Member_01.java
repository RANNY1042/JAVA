package Armor06;

public class Member_01 {
	private String name;
	private int age;
	
	public Member_01() {
		this.name = "guest";
		this.age = 0;
	}
	
	public Member_01(String name) {
		this.name = name;
		this.age = 0;
	}
	
	public Member_01(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_01 m1=new Member_01();
		Member_01 m2=new Member_01("Amy");
		Member_01 m3=new Member_01("Amy",23);
		
		System.out.println("Done");
	}

}
