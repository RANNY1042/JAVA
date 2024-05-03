package Study_20240311;

import java.util.Arrays;

public class String배열_오름차순정렬 {

	public static void main(String[] args) {
		String arr[]= {"apple","orange","banana","pear","peach","melon"};
		Arrays.sort(arr);
		
		for(String i : arr) {
			System.out.println("["+i+"]");
		}

	}

}
