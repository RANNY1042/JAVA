package Test;

	//하나의 java file에 Student 객체를 정의하고 구현하는 실습
	/*
	 * static 멤버 함수 구현
	 * toString() 함수 구현과 사용
	 * 객체 배열 사용
	 */
	abstract class InterfaceStudents {
		public abstract void showObject();
	}
	class Student extends InterfaceStudents {
	 static int cntStudents;//객체수
	 int sid;//학번
	 String sname; //학생 이름
	 String city; //주소 도시
	 
	 public Student(){
		 cntStudents++;
	 }	 
	 public Student(int sid) {
		 this();
		 this.sid=sid;
	 }
	 public Student(int sid, String sname) {
		 this(sid);
		 this.sname=sname;
	 }
	 public Student(int sid, String sname, String city) {
		 this(sid,sname);
		 this.city=city;
	 }	 	 
	 
	 public String toString() {
		 return "sid="+sid + ", sname=" + sname + ", city=" + city;
	 }
	 public void showObject() {
		 System.out.println("["+sid +", " + sname + ", " + city+"]");
	 }
	 static void showNumberObjects() {//생성된 객체수를 출력한다.
		 System.out.println(" 생성객체수=" + cntStudents);
	 }
	}
	class WorkStudent extends Student {
		String eno;
		String company;
		
		 public WorkStudent(int sid, String sname, String city, String eno, String company) {
			 super(sid,sname,city);
			 this.eno=eno;
			 this.company=company;
		 }
		
		 public String toString() {
			 return super.toString();
			 }
		 
		 public void showObject() {
			 //Student 출력 코드 추가
			 super.showObject(); //  showObject오버라이딩, 다형성
			 System.out.println("["+eno +", " + company + "]");
		 }
	}
	
	class CodingWorkStudent extends WorkStudent {
		String language;
		
		public CodingWorkStudent(int sid, String sname, String city, String eno, String company, String language) {
			super(sid,sname,city,eno,company);
			this.language=language;
		}
				
		 public String toString() {
			 return super.toString();
		 }
		 
		 public void showObject() {
			 //WorkStudent 출력 코드 추가 
			 super.showObject();
			 System.out.println("["+language+"]");
		 }
	}
	 // 생성자 구현한다.
	public class Assignment_inheritance {
		 static void showObjects(InterfaceStudents is) {
			 is.showObject();
		 }
		 public static void main(String[] args) {
		 Student arry[] = new Student[5];
		 
		 Student.showNumberObjects();
		 arry[0] = new Student();
		 arry[1] = new Student(202301);
		 arry[2] = new WorkStudent(202301,"박혜란","부산","123","부산대학교");
		 arry[3] = new CodingWorkStudent(202301,"박혜란","부산","123","부산대학교","영어");
		 arry[4] = new WorkStudent(202301,"박소영","대구","234","부산대학교");
		 
		 Student.showNumberObjects();
		 for (Student s : arry) {
			 System.out.println(s.toString());
		 }
		 for (Student sx : arry) {
			 showObjects(sx);
		 }
	 }

	}
