package Study_20240321;


class SuperObject{

	public void draw() {
		System.out.println("A");
		draw();
	}
	
	public void paint() {
		System.out.print("B");
		draw();
	}
	
}
class SubObject extends SuperObject{
	public void paint() {
		super.paint();
		System.out.print('C');
		draw();
	}
	public void draw() {
		System.out.print('D');
	} 
}

public class Test{
	public static void main(String[] args) {
		System.out.println("생성자");
		SuperObject a = new SubObject();
		System.out.println("paint");
		a.paint();
		System.out.println("draw");
		a.draw();
		

	}

}
