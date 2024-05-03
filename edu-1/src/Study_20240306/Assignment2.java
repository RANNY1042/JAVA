package Study_20240306;

import java.util.Arrays;

public class Assignment2 {
	
	
		public static void main(String[] args) {
			String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};

			showData(data);
			sortData(data);
			showData(data);
		}
		
		static void showData(String[]arr) {
			System.out.println(Arrays.toString(arr));
				}


		static void swap(String[]arr, int ind1, int ind2) {
			
			String temp = arr[ind1];
			arr[ind1]=arr[ind2];
			arr[ind2]=temp; 
			
		}
		static void sortData(String []arr) {
			
			Arrays.sort(arr);
			
		}

	}
