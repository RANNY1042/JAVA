package Study_20240312;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_sort {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>(Arrays.asList("C","A","B","a"));
		System.out.println("원본:"+list);
		
		Collections.sort(list);
		System.out.println("오름차순:"+list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("내림차순:"+list);
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("대소문자 구분없이 오름차순:"+list);
		
		Collections.sort(list,Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println("대소문자 구분없이 내림차순"+list);
	}

}
