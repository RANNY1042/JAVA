package Study_20240306;

import java.util.Scanner;


public class Median {
	static int mid3(int a, int b, int c) { 
		if (a>=b)
			if (b>=c)
				return b;
			else if (a<=c)
				return a;
			else if (a>c)
				return a;
			else if (b>c)
				return c;
			else 
				return b;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
