package Study_20240311;

import java.util.Arrays;

public class Comparable1 {

	public static void main(String[] args) {
		
		
		MyInteger[]arr =new MyInteger[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = new MyInteger((int)(Math.random()*100));
			
		}
		
		
		System.out.println("정렬 전:");
		for(int i =0; i<10; i++) {
			System.out.println(arr[i].value+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.println("정렬 후:");
		for(int i = 0; i<10; i++) {
			System.out.println(arr[i].value+" ");
		}
		System.out.println();

	}

}

class MyInteger implements Comparable<MyInteger>{
	int value;
	
	public MyInteger(int value) {
		this.value=value;
	}

	@Override
	public int compareTo(MyInteger o) {
		return o.value - this.value;
	}
}