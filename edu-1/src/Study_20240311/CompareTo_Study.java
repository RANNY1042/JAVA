package Study_20240311;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTo_Study {

	public static void main(String[] args) {

		Integer[] arr = {1,26,17,25,99,44,303};
		
		Arrays.sort(arr, new Comparator<Integer>() {
			
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		
		System.out.println("Sorted arr[]:"+Arrays.toString(arr));
	}

}
