package Study_20240228;

public class Gugudan2 {
	
	public void print(int i) {
		System.out.println(i + "단");
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
	}	
	
	
	public void printColumn(int col) {
		for(int j=1; j<10; j++) {
			for(int i=2; i<10; i++) {
			if(i%col ==1)
			System.out.println(i+"*"+j+"="+i*j+"\t");
			else System.out.print(i+"*"+j+"="+i*j+"\t");
			}
		}
	}

}
