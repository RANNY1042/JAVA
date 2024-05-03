package Practice;

public class ThisTest {
	int i=1; 
	
	public void first() {
		int i =2;
		int j =3;
		this.i = i+j;
		
		second(4);
	
	}
	
	public void second(int e) {
		int j=5;
		this.i = e+j;
		System.out.println(this.i);
		
	}

	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();
		System.out.println(exam.i);

	}

}
