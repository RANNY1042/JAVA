package Practice;

public class Member01{
	private String name;
	private int age;
	
	public Member() {
		this("guest");
	}
	
	public Member(String name) {
		this(name,0);
	}
	
	public Member(String name,int age) {
		this.name=name;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy",23);
	}
}
