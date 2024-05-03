package Study_20240311;

import java.util.Arrays;
import java.util.Collections;

public class String_배열_내림차순정렬 {

	public static void main(String[] args) {
	
	String arr [] = {"apple","orange","banana","pear","peach","melon"};
	Arrays.sort(arr,Collections.reverseOrder());

	for (String i : arr) {
		System.out.println("["+i+"]");
	}
	}

}
