package packagecom.ruby.java.ch07.inheritance;


public class LmsTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
		
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴푸터과학");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		

	}

}
