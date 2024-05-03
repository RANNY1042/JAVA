package Study_20240312;

import java.util.Scanner;

public class 실습3_1 {
	
	static int seqSearch(int[]a, int n , int key) {
		int i = 0;
		
		while (true) {
			if(i==n)
				return -1;
			if(a[i]==key)
				return i;
			i++;
		}
	}

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.println("요솟수:");
	int num = stdIn.nextInt();
	
	int [] x = new int[num];
	
	for (int i =0; i<num; i++) {
		System.out.println("x["+i+"]:");
		x[i]=stdIn.nextInt();
	}
	
	System.out.println("검색할 값:");
	int ky = stdIn.nextInt();
	int idx = seqSearch(x, num, ky);
	
	if(idx == -1)
		System.out.println("그 값의 요소가 없습니다.");
	else
		System.out.println("그 값은 x["+idx+"]에 있습니다.");
	}

}
