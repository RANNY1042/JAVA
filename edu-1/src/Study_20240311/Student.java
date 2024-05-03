package Study_20240311;

public class Student implements Comparable<Student>{
	
	int age ;
	int classNumber;
	
	Student(int age, int classNumber){
		this.age= age;
		this.classNumber=classNumber;
	}
	
	public int compareTo(Student o) {
		
		if(this.age>o.age) {
			return 1;
		}
		
		else if (this.age==o.age) {
			return 0;
		}
		
		else {
			return -1;
		}
	

	public static void main(String[] args) {
	

			

}
}
