package Armor06;

public class Member {

		private String name;
		private int age;
		
	public Member() {
		private String name;
		private int age;
	}
	
	public Member(String name) {
		System.out.print("Member() 생성자 실행 ");
		System.out.println(name);

	}
		
	public Member(String name) {
		System.out.println("Member(String) 생성자 실행 :");
		System.out.println(name);
	}
		
	public Member(String name, int age) {
		System.out.println("Member(String, int ) 생성자 실행 :");
		System.out.println(name+":"+age);
	}
	
	
	
	public void setName(String name) {
	
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
		
	
	}
}
