package quiz;

public class Gugudan2 {
	
	
	public void printHorizontal() {
		Gugudan ggd = new Gugudan();

	
	ggd.print(2);
	System.out.println("-".repeat(15));
	ggd.print(3);
	System.out.println("-".repeat(15));
	ggd.print(4);
	System.out.println("-".repeat(15));
	System.out.println("End");

}
		
	public static void main(String[] args) {
			
	Gugudan ggd = new Gugudan();
	ggd.printHorizontal();
	
	}	
	

}