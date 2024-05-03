package quiz;

public class GugudanTest {

	public static void main(String[] args) {
		
		Gugudan ggd = new Gugudan();
		
		ggd.print(2);
		System.out.println("-".repeat(15));
		ggd.print(3);
		System.out.println("-".repeat(15));
		ggd.print(4);
		System.out.println("-".repeat(15));
		System.out.println("End");
		
		ggd.printHorizontal();
	}
	
}
