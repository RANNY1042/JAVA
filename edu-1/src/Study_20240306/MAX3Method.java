package Study_20240306;

public class MAX3Method {
	
	static int max3(int a, int b, int c) {
		int max = a;
		if (b> max)
			max = b;
		if (c>max)
			max = c;
		
		return max;
	}
}