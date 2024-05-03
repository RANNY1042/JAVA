package Study_20240228;

public class Gugudan {
	
	public void print(int i) {
		System.out.println(i + "단");
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
	}	
	
	
	public void printColumn(int col) {
		if (9<col) {
			System.out.println("col is not valid![1~9]");
			return;
		}
		
		for(int i=2; i<10; i+=col) {
			for(int j=1; j<10; j++) {
				for(int k=0; k<col; k++) {
					
					if(10<= i+k) {
						System.out.println("\n");
						break;
					}
					
					System.out.print("%d * %d = %d", (i+k),j,(i+k)*j);
					
					if(k<col-1) System.out.println("\t");
					else 		System.out.println("\n");
				}
			}
			System.out.println();
		}
	}
}
