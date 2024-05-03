package com.ruby.test;

public class Test03 {

	public static void main(String[] args) {
		package com.ruby.java.ch06;
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
		 static int countStudents;//객체수 (객체가 하나 만들어질때마다 1씩 증가)
		 int sid;//학번
		 String sname; //학생 이름
		 String city; //주소 도시
		 
		 
		 public Student() { //default 생성자
			 countStudents++;		 
			 sid =0; 
			 sname=null;city=null;
		 		 }
		 
		 public Student(int sid) {
			 this();
			 this.sid = sid;
		 }
		 
		 public Student(int sid, String name, String city) {
			 this();
			 this.sid = sid;
			 
		//  this.sname=null;city=null;
		//  countStudents++;
		 }
		 

		 public String toString() {
			 return "sid="+sid + ", sname=" + sname + ", city=" + city;
		 }
		 public void showObject() {
			 System.out.println("["+sid +", " + sname + ", " + city+"]");
		 }
		 static void showNumberObjects() {//생성된 객체수를 출력한다.
			 System.out.println(" 생성객체수=" + countStudents);
		 }
		}
		class WorkStudent extends Student {
			String eno;
			String company;
			public WorkStudent(int id, String sname, String city, String eno, String company)
				//this.sid = sid;
				//this.sname =sname;
				//this.city = city;
				super(id, sname, city);
				this.eno=eno;
				this.company=company;
				
			 public String toString() {
				 return 
			 }
			 public void showObject() {
				 //Student 출력 코드 추가
				 System.out.println("["+eno +", " + company + "]");
			 }
		}
		class CodingWorkStudent extends WorkStudent {
			String language;
			 public String toString() {
				 return 
			 }
			 public void showObject() {
				 //WorkStudent 출력 코드 추가 
				 System.out.println("["+language+"]");
			 }
		}
		 // 생성자 구현한다.
		public class Test_Chap06_객체배열 {
			 static void showObjects(InterfaceStudents is) {
				 is.showObject();
			 }
			 public static void main(String[] args) {
			 Student arry[] = new Student[10];
			 showNumberObjects();
			 arry[0] = new Student(); // default 생성자
			 arry[1] = new Student(202301);
			 arry[2] = new Student(202301, "Hong", "Busan");
			 arry[3] = new WorkStudent(1234, "Hong","busan","e1","naver"); 
			 arry[4] = new CodingWorkStudent();
			 arry[5] = new WorkStudent();
			 showNumberObjects();
			 for (Student s : arry) {
				 System.out.println(s.toString());
			 }
			 for (Student sx : arry) {
				 showObjects(sx);
			 }
		 }

		}

