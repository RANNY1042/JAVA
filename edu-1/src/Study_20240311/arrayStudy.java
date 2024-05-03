package Study_20240311;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class arrayStudy {

	public static void main(String[] args) {
		
		String[] arr = {"Apple","Kiwi","Orange","Banana","Watermelon","Cherry"};
		
		Arrays.sort(arr, new Comparator<String>() {
			
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
				}
		});
		
		System.out.println("Sorted arr[]:"+Arrays.toString(arr));
		
	}

}