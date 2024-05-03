package Study_20240311;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator1 {

	public static void main(String[] args) {

		MyInteger[] arr = new MyInteger[10];
		
		for(int i =0; i<10; i++) {
			arr[i]=new MyInteger((int)(Math.random()*100));
		}
		
		System.out.println("정렬 전:");
		for(int i =0; i<10; i++) {
			System.out.println(arr[i].value+" ");
		}
		
		System.out.println();
		
		Arrays.sort(arr,comp);
		
		System.out.println("정렬 후:");
		for(int i = 0; i<10; i++) {
			System.out.println(arr[i].value+" ");
		}
		
		System.out.println();
		
	}
		static Comparator<MyInteger> comp = new Comparator<MyInteger>() {
			
			public int compare(MyInteger o1, MyInteger o2) {
				return o2.value -o1.value;
		}
	};	
}

class MyInteger{
			int value;
			
			public MyInteger(int value) {
				this.value=value;
				
			}
		}
