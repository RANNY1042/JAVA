package Study_20240311;

import java.util.Arrays;

public class 배열_오름차순 {

	public static void main(String[] args) {
		int arr[] = {4,23,33,15,17,19};
		Arrays.sort(arr);
		
		for(int i : arr) { //확장형 for문
			System.out.println("["+i+"]");
		}
	}

}
